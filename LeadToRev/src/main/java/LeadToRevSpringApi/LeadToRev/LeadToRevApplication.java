package LeadToRevSpringApi.LeadToRev;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "LeadToRevSpringApi")
@EnableJpaRepositories(basePackages = "LeadToRevSpringApi")
@EntityScan(basePackages = "LeadToRevSpringApi")
public class LeadToRevApplication {

	public static void main(String[] args) {
		SpringApplication.run(LeadToRevApplication.class, args);
	}

}
