package br.com.provaonline;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(basePackages = {"br.com.provaonline.model"})
@EnableJpaRepositories(basePackages = {"br.com.provaonline.repositories"})
public class ProvaonlineApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProvaonlineApplication.class, args);
	}

}
