package apocalypse.cloudpartybuilding;


import apocalypse.cloudpartybuilding.util.Mail;
import apocalypse.cloudpartybuilding.service.MailService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.thymeleaf.context.Context;
import org.thymeleaf.spring5.SpringTemplateEngine;

import javax.mail.MessagingException;
import java.util.HashMap;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest
class CloudpartybuildingApplicationTests {

	@Autowired
	private MailService mailService;
	@Autowired
	private SpringTemplateEngine templateEngine;

	// 发送Html邮件
	@Test
	public void postHtmlMail() throws MessagingException {
		String content = "<html>\n" +
				"<body>\n" +
				"<h3>hello! test Html test!</h3>\n" +
				"</body>\n" +
				"</html>";
		Mail mail = new Mail();
		mail.setTo("2796675652@qq.com");
		mail.setSubject("Html格式邮件");
		mail.setContent(content);
		mailService.sendHtmlMail(mail);
//        return ResultGenerator.getSuccessResult().setMessage("发送成功");
	}


	// 发送 Html 模板邮件
	@Test
	public void postTemplateMail() throws MessagingException {
		Context context = new Context();
		Map<String, Object> emailParam = new HashMap<>();
		emailParam.put("name", "产品终端更换名字");
		emailParam.put("content", "牛牛终端");
		emailParam.put("person", "Alex Wong");
		context.setVariable("emailParam", emailParam);
		String emailTemplate = templateEngine.process("emailTemplate", context);

		Mail mail = new Mail();
		mail.setTo("2796675652@qq.com");
		mail.setSubject("模板邮件");
		mail.setContent(emailTemplate);
		mailService.sendHtmlMail(mail);
//        return ResultGenerator.getSuccessResult().setMessage("发送成功");
	}

}
