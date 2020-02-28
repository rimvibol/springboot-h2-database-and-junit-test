package com.vibol.springbooth2db;

import com.vibol.springbooth2db.model.Person;
import com.vibol.springbooth2db.repository.PersonRepository;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class SpringbootH2dbApplicationTests {

	@Autowired
	private PersonRepository personRepository;

	@Test
	void contextLoads() {

	}


	@Test
	public void test() {
		Person person = new Person();
		person.setAge(12);
		person.setEmail("test@gamil.com");
		person.setName("tester");
		person.setDesc("Hello from Unit test");


		personRepository.save(person);

		Person p = personRepository.getOne(1);
		assertThat(p.getId()).isEqualTo(p.getId());
	}
}
