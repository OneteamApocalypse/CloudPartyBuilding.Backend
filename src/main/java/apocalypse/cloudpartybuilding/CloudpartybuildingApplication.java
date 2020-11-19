package apocalypse.cloudpartybuilding;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
@EnableAutoConfiguration(exclude = {
		org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration.class
})
@MapperScan("apocalypse.cloudpartybuilding.mapper")
public class CloudpartybuildingApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudpartybuildingApplication.class, args);
	}

}
