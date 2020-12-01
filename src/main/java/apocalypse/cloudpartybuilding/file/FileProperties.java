package apocalypse.cloudpartybuilding.file;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/*
*在Spring Boot 项目中我们将大量的参数配置在 application.properties 或 application.yml 文件中，
*通过 @ConfigurationProperties 注解，我们可以方便的获取这些参数值
*/
@Component
@ConfigurationProperties(prefix = "file")
public class FileProperties {
    private String uploadDir;

    public String getUploadDir() {
        return uploadDir;
    }
    public void setUploadDir(String uploadDir) {
        this.uploadDir = uploadDir;
    }
}