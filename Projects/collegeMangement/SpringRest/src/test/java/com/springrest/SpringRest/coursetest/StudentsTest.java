package com.springrest.SpringRest.coursetest;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.college.entity.Students;
import com.college.repository.StudentRepository;
import com.college.service.StudentService;

@SpringBootTest
//testing service class
public class StudentsTest {

	@Autowired
	private StudentService ss;
	
	@MockBean
	private StudentRepository stdRepo;
	
	//testing deleteById() of service
 	@Test
 	public void testDeleteById() {
 		Students u4 = new Students();
 		u4.setSid(101);
		u4.setStdName("Madhusudan");
		u4.setStd("12");
		
		Optional<Students> b =  Optional.of(u4);
		Mockito.when(stdRepo.existsById(109)).thenReturn(false);
		assertThat(stdRepo.existsById(b.get().getSid()));
		
 	}
}
