package com.bigmakk.databse;

import com.bigmakk.databse.dao.UserDao;
import com.bigmakk.databse.entity.User;
import org.assertj.core.api.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Random;

@SpringBootTest
class DatabaseProjectApplicationTests {

	@Autowired
	UserDao userDao;

	@Test
	void userTest(){
		User user=new User();
		user.setId(new Random().nextInt(1000));
		user.setName("Kashish");
		user.setEmail("kashishmakkar99@gmial.com");
		user.setPassword("abc");
		user.setCity("nyc");
		user.setSalary(1000000);
		Assertions.assertEquals(1,userDao.saveUser(user));

	}

}
