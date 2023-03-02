package com.project.pet;

import com.project.pet.model.User;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

@SpringBootTest
class PetProjectApplicationTests {

	@Test
	void contextLoads() {
//
	}

	@Test
	public void userShouldCreated() {
		User user = new User();
		Assert.notNull( user.toString(), "should be not null");
	}
}
