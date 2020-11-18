package apocalypse.cloudpartybuilding.service.implement;

import apocalypse.cloudpartybuilding.config.Mail;
import apocalypse.cloudpartybuilding.service.MailService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import javax.mail.internet.MimeMessage;
import java.io.File;

@Service
public class MailServiceImpl implements MailService {

    Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private JavaMailSender mailSender;

    @Value("${spring.mail.username}")
    private String mailFrom;

    // 只发送文本
    @Override
    public void sendMail(Mail mail) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom(mailFrom);
        message.setTo(mail.getTo());
        message.setSubject(mail.getSubject());
        message.setText(mail.getContent());
        mailSender.send(message);
        logger.info("发送完毕");
    }

    // 发送Html邮件
    @Override
    public void sendHtmlMail(Mail mail) {
        MimeMessage message = mailSender.createMimeMessage();
        try {
            MimeMessageHelper helper = new MimeMessageHelper(message, true);
            message.setFrom(mailFrom);
            helper.setTo(mail.getTo());
            helper.setSubject(mail.getSubject());
            helper.setText(mail.getContent(), true);

            mailSender.send(message);
            logger.info("发送Html邮件成功");
        } catch (Exception e) {
            e.printStackTrace();
            logger.error("发送Html邮件失败");
        }
    }

    // 发送带附件的邮件
    @Override
    public void sendAttachmentsMail(Mail mail) {
        MimeMessage message = mailSender.createMimeMessage();
        try {
            // 附件
            FileSystemResource resourse = new FileSystemResource(new File(mail.getFilePath()));

            MimeMessageHelper helper = new MimeMessageHelper(message, true);
            message.setFrom(mailFrom);
            helper.setTo(mail.getTo());
            helper.setSubject(mail.getSubject());
            helper.setText(mail.getContent(), true);
            // 添加附件
            helper.addAttachment(resourse.getFilename(), resourse);

            mailSender.send(message);
            logger.info("发送邮件成功");
        } catch (Exception e) {
            e.printStackTrace();
            logger.error("发送邮件失败");
        }
    }
}