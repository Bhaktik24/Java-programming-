package com.college.service;

import java.util.List;
import com.college.entity.Course;
import com.college.model.CourseDto;

public interface CourseService 
{
	String createCourse(Course course);
	CourseDto updateCourse(int id,Course course);
	CourseDto getCoachById(int id);	
	List<CourseDto> getAllCourses();
	String deleteCourseById(int id);
	void deleteAllCoaches();
	List<CourseDto> getCourseByCourse_name(String course_name);
	List<CourseDto> getCourseByStaff_name(String staff_name);
	List<CourseDto>getCourseByLocation(String location);
	void deleteAllCourses1();
	void deleteAllCourses();
	CourseDto getCourseById(int id);
	CourseDto getCourseByCode(int course_code);
	
	

}
