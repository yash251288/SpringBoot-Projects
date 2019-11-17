package com.springbootrestswaggerexample;

import com.springbootrestswaggerexample.domain.Person;
import com.springbootrestswaggerexample.repository.PersonRepository;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import static org.junit.Assert.assertEquals;


@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootRestSwaggerExampleApplicationTests {

	@MockBean
	private PersonRepository repository;

	@Before
	public void setUp() {
		Person adam = new Person("Adam","Serge");

		Mockito.when(repository.findOne(5L))
				.thenReturn(adam);
	}
	@Test
	public void contextLoads() {
	}

	@Test
	public void whenFindByName_thenReturnPerson() {

	// given
		Person adam = new Person("Adam","Serge");

	// when
	Person found = repository.findOne( 5L);

	// then
	assertEquals(found.getFirstName(), adam.getFirstName());
	}

}
