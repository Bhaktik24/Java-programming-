package com.springrest.SpringRest.coursetest;

import static org.assertj.core.api.Assertions.assertThat;


import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.college.entity.Course;
import com.college.repository.CourseRepository;
import com.college.service.CourseService;




//testing service class
@SpringBootTest
public class CourseTest {

	@Autowired
	private CourseService cs;
	
	@MockBean
	private CourseRepository cd;
	
	// Testing addCourse() of service
	@Test
	public void testAddCourse() {
		Course c = new Course();
		c.setId(101);
		c.setTitle("C++");
		c.setDescription("This is the C++ language Course");
		
		Mockito.when(cd.save(c)).thenReturn(c);
		assertThat(cs.addCourse(c)).isEqualTo(c);
	}
	
//	@Test
//	public void testGetCourse() {
//		
//		Course c = new Course();
//		 
//		c.setId(108);
//		c.setTitle("C Language");
//		c.setDescription("This course is about C language");
//	
//		
//		
//		Optional<Course> a =  Optional.of(c);
//		Course ua = a.get();
//		
//		Mockito.when(cd.findById(108)).thenReturn(a);
//		assertThat(cs.getCourse(108)).isEqualTo(ua);
//	}


	//testing deleteById() of service
	 	@Test
	 	public void testDeleteById() {
	 		Course u4 = new Course();
	 		u4.setId(109);
			u4.setDescription("Java Course");
			u4.setTitle("Java Full Stack");
			
			Optional<Course> b =  Optional.of(u4);
			Mockito.when(cd.existsById(109)).thenReturn(false);
			assertThat(cd.existsById(b.get().getId()));
			
	 	}
}

