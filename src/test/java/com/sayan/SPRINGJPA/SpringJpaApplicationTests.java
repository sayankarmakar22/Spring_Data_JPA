package com.sayan.SPRINGJPA;

import com.sayan.SPRINGJPA.Entity.Student;
import com.sayan.SPRINGJPA.Repository.StudentRepo;
import com.sayan.SPRINGJPA.Services.Implmentations.StudentImpl;
import com.sayan.SPRINGJPA.Services.StudentService;
import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class SpringJpaApplicationTests {
	@Autowired
	private StudentImpl student;
	@Test
	public void getUserTest(){
		System.out.println("testing get user method");
		Student user = student.getUser(7);
		Assert.assertEquals(7,user.getId());
		System.out.println("testing done!");
	}
	@Test
	public void saveUserTest(){
		System.out.println("testing save user method");
		Student student1 = new Student(1, "arghadeep ghosh", "naihati");
		Student user = student.saveUser(student1);
		Assert.assertEquals("arghadeep ghosh",user.getName());
		System.out.println("testing done!");
	}
	@Test
	public void updateUserTest(){
		System.out.println("testing update user method");
		Student student1 = new Student(9, "arghadeep ghosh", "ranaghat");
		Student user = student.updateUser(student1);
		Assert.assertEquals("ranaghat",user.getAddress());
		System.out.println("testing done!");
	}
}
