package crowdfunding.crowdfunding;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;

@SpringBootApplication
public class CrowdfundingApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrowdfundingApplication.class, args);
	}

}
