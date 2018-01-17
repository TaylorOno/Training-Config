package io.scale.training.TrainingConfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class TrainingConfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(TrainingConfigApplication.class, args);
	}
}
