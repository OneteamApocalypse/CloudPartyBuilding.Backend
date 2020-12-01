package apocalypse.cloudpartybuilding;

import apocalypse.cloudpartybuilding.file.FileProperties;


import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
@EnableAdminServer
@EnableConfigurationProperties({FileProperties.class})
//@EnableAutoConfiguration(exclude = {
//		org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration.class
//})
@MapperScan("apocalypse.cloudpartybuilding.mapper")
public class CloudpartybuildingApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudpartybuildingApplication.class, args);
	}


}
