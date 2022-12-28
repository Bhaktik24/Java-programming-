  package com.college.servicelmp;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.college.controller.CourseController;
import com.college.entity.Course;

import com.college.model.CourseDto;
import com.college.repository.CourseRepository;
import com.college.service.CourseService;

@Service
public abstract class CourseServiceImp implements CourseService {
	@Autowired
	private CourseRepository courseRepository;  //instance of courseRepository
	
	@Autowired
	private CourseController courseConvertor;  //instance of courseConvertor

	
	public String createCourse1(Course course) {
		//method creating new course
				String message = null;
				courseRepository.save(course);  //saving course to database
				if(course!=null) {
					message = "New Course is assign to Team ..";
				}
				return message;
	} //end of method
	

	public CourseDto updateCourse1(int id, Course course) {
		//method for updating course
		Course getCourse = courseRepository.findById(id).orElseThrow();
		getCourse.setCourse_name(course.getCourse_name());
		getCourse.setLocation(course.getLocation());
		getCourse.setStaff_name(course.getStaff_name());;
		courseRepository.save(getCourse); //saving course to database
			return courseConvertor.convertCourseEntityToCourseDto(getCourse);
	} //end of method

	

	public CourseDto getCourseByCourseCode(int course_code) {
		//method for getting coach details by Id
				Course course = courseRepository.findById(course_code).orElseThrow();
				return courseConvertor.convertCourseEntityToCourseDto(course);
	}
	

	@Override
	public List<CourseDto> getAllCourses() {
		//method for showing all coaches
		List<Course> courseList =courseRepository.findAll();
		List<CourseDto> courseDto = new ArrayList<>();
		for(Course b: courseList) {
			courseDto.add(courseConvertor.convertCourseEntityToCourseDto(b));
		}
			return courseDto;
	}
	

	@Override
	public String deleteCourseById(int id) {
		//method for delete coach by id
				String message=null;
				Optional<Course> course=courseRepository.findById(id);
				if(course.isPresent()) {
					
					courseRepository.deleteById(id);
					message = "Course Delteted  Successfully....";
				}
				else {
					message = "Course Details are not found........";
				}
				return message;
	}

	@Override
	public void deleteAllCourses() {
		//method for removing all Coach from dataabses
		courseRepository.deleteAll();
		
	}

	@Override
	public List<CourseDto> getCourseByCourse_name(String course_name) {
		List<Course> course = courseRepository.getCourseByCourse_name(course_name);
		List<CourseDto> courseDto = new ArrayList<>();
		for(Course b : course) {
			courseDto.add(courseConvertor.convertCourseEntityToCourseDto(b));
		}
			return courseDto;
	}

	@Override
	public List<CourseDto> getCourseByStaff_name(String staff_name) {
		List<Course> course = courseRepository.getCourseByStaff_name(staff_name);
		List<CourseDto> courseDto = new ArrayList<>();
		for(Course b : course) {
			courseDto.add(courseConvertor.convertCourseEntityToCourseDto(b));
		}
			return courseDto;
		
	}

	@Override
	public List<CourseDto> getCourseByLocation(String location) {
		List<Course> course = courseRepository.getCourseByLocation(location);
		List<CourseDto> courseDto = new ArrayList<>();
		for(Course b : course) {
			courseDto.add(courseConvertor.convertCourseEntityToCourseDto(b));
		}
			return courseDto;
	}

}
