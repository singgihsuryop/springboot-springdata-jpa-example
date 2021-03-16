package com.singgihsuryop.springboot.springdata.jpa;

import java.util.Iterator;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationTests {

	@Autowired
	PersonJpaRepository personRepository;

	@Test
	public void contextLoads() {
		
		System.out.println("Print all Persons");
		Iterable<PersonEntity> persons = personRepository.findAll();
		Iterator<PersonEntity> iterator = persons.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
	}

}
