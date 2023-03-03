package com.project.pet;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ActiveProfiles;

import static org.assertj.core.api.Assertions.assertThat;

@ActiveProfiles("test")
@SpringBootTest
class PetProjectApplicationTests {
	@Test
	void contextLoads(ApplicationContext context) {
		assertThat(context).isNotNull();
	}
}