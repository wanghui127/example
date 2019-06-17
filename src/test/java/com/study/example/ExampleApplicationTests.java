package com.study.example;

import com.study.example.Controller.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ExampleApplicationTests {

	@Test
	public void contextLoads() {
		User user = null;
         Optional.ofNullable(user).map(user1 -> user.getUserName()).orElse("unknown");

		System.err.println(user.getUserName());
	}

	@Test
	public void lambda(){
		List<Integer> aList = new ArrayList<>();
		aList.add(1);
		aList.add(5);
		aList.add(3);
		aList.add(4);
		aList.add(2);
		aList.stream().forEach(user ->{
			//System.out.println(user);
		});
		//aList.forEach((a)->System.out.println(a));
		aList.forEach(System.out::println);

		aList.forEach(user ->{
			System.out.println(user);});
	}


	public void createUser(User user){

		Optional<User> user1 = Optional.ofNullable(user);
		//user1.orElseGet(user);
		User aa = user1.orElse(new User());
		System.err.println(aa);

	}

	@Test
	public void optional(){
		User user = new User();
		//user.setId(2);
		//user.setAddress("a");
		//user.setUserName("b");
		createUser(user);
	}

}
