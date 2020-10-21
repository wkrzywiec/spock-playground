package io.wkrzywiec.medium.spock;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"io.wkrzywiec.medium.spock"})
public class SpockDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpockDemoApplication.class, args);
	}

}
