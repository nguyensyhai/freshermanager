package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.TestPropertySource;

import com.example.demo.model.Center;
import com.example.demo.model.Fresher;
import com.example.demo.repository.FresherRepository;

@DataJpaTest
@TestPropertySource(locations = "classpath:test.properties")
public class FresherRepositoryTests {

	@Autowired
	private TestEntityManager entityManager;
	
	@Autowired
	private FresherRepository repo;
	
	@Test
	public void testCreatFresher() {
		
		Center center=entityManager.persist(new Center("vmo","123456"));
		Fresher fresher=repo.save(new Fresher("nam",center));
		
		assertNotNull(fresher);
		assertTrue(fresher.getId() > 0);
	}
}
