package com.project.pet;

import static org.assertj.core.api.Assertions.assertThat;

import com.project.pet.controllers.GreetingController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ActiveProfiles;

@ActiveProfiles("test")
@SpringBootTest
class PetProjectApplicationTests {
	@Autowired
	@Test
	/*void contextLoads(ApplicationContext context) {
		assertThat(context).isNotNull();
	}*/
	void contextLoads(ApplicationContext context) {
		assertThat(context.getBean(GreetingController.class)).isNotNull();
	}
}