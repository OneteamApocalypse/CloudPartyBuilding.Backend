package apocalypse.cloudpartybuilding;

import apocalypse.cloudpartybuilding.file.FileProperties;


import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
<<<<<<< HEAD
=======
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
>>>>>>> cacdb2319f2f90261ff5ec41a1aa2162d2edaf05
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
