package com.zhenql.zhurvey;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.zhenql.zhurvey.Questions.Questions;
import com.zhenql.zhurvey.Users.Users;
import com.zhenql.zhurvey.Users.UsersRepository;

@SpringBootTest
class ZhurveyApplicationTests {

	@Autowired
	UsersRepository userJpa;

	@Test
	void contextLoads() {
	}

	@Test
	void insertToDatabase(){
		Users user = new Users();
		Questions q1 = new Questions();
		q1.setQuestion("How are you?");
		q1.setUser(user);
		user.setUsername("Tom");
		user.setPassword("testing");
		user.getQuestions().add(q1);
		userJpa.save(user);
		System.out.println(userJpa);
	}

}
