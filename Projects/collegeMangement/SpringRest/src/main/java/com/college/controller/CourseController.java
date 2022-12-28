package com.college.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.college.entity.Course;
import com.college.model.CourseDto;
import com.college.service.CourseService;






@RestController
public class CourseController {
	
	
	@Autowired
	private CourseService courseService;
	@Autowired
	private CourseController courseConvertor;
	
	@PostMapping("/create")
	public String createCourse(@RequestBody CourseDto courseDto) {
		final Course course = courseConvertor.convertCoachDtoToCoachEntity(courseDto);
		return courseService.createCourse(course);
	}
	
	private Course convertCoachDtoToCoachEntity(CourseDto courseDto) {
		// TODO Auto-generated method stub
		return null;
	}

	@PutMapping("/update/{id}")
	public CourseDto updateCourse(@PathVariable("id") int id,@RequestBody CourseDto courseDto) {
		Course course = CourseController.convertCourseDtoToCourseEntity(courseDto);
		return courseService.updateCourse(id, course);
	}
	
	private static Course convertCourseDtoToCourseEntity(CourseDto courseDto) {
		// TODO Auto-generated method stub
		return null;
	}

	@GetMapping("/get/{id}")
	public CourseDto getCourse(@PathVariable("id") int id) {
		return courseService.getCoachById(id);
	}
	
	@GetMapping("/getAll")
	public List<CourseDto> getAllCourse(){
		return courseService.getAllCourses();
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteCourseById(@PathVariable("id") int id) {
		return courseService.deleteCourseById(id);
	}
	
	@DeleteMapping("/deleteAllCourse")
	public ResponseEntity<String> deleteAllCourses(){
		courseService.deleteAllCourses1();
		return new ResponseEntity<String>("All Courses Details Are Deleted",HttpStatus.OK);
	}
	
	@GetMapping("/getByCourse_Name/{course_name}")
	public List<CourseDto> getCourseByCoach_name(@PathVariable("course_name") String course_name){
		return courseService.getCourseByCourse_name(course_name);
	}
	@GetMapping("/getByStaff_name/{staff_name}")
	public List<CourseDto> getCourseByStaff_name(@PathVariable("Staff_name") String staff_name){
		return courseService.getCourseByStaff_name(staff_name) ;
	}
	
	@GetMapping("/getByCourseLocation/{location}")
	public List<CourseDto> getCourseByLocation(@PathVariable("location") String location){
		return courseService.getCourseByLocation(location);
	}

	public CourseDto convertCourseEntityToCourseDto(Course getCourse) {
		// TODO Auto-generated method stub
		return null;
	}

	
	
}
