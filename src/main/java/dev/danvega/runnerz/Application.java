package dev.danvega.runnerz;


import java.time.LocalDateTime;
import dev.danvega.runnerz.run.Run;
import dev.danvega.runnerz.run.Location;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

	private static final Logger log = LoggerFactory.getLogger(Application.class);

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Bean
	CommandLineRunner runner() {
		return args -> {
			Run run = new Run(1,"First Run",LocalDateTime.now(),LocalDateTime.now().plusHours(1),5,Location.OUTDOOR);
			log.info("Run:"+run);
		};
	}

}
