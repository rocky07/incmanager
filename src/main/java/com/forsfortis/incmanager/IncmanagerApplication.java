package com.forsfortis.incmanager;

import com.forsfortis.incmanager.repository.UserRepository;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackageClasses = UserRepository.class)
public class IncmanagerApplication {

	public static void main(String[] args) {
		SpringApplication.run(IncmanagerApplication.class, args);
	}

}
