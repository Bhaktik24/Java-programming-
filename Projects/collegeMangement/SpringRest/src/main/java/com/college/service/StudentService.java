package com.college.service;

import java.util.List;
import com.college.entity.Student;
import com.college.model.StudentDto;



public interface StudentService {

	String createStudent(Student student);
	StudentDto updateStudent(int id,Student student);
	StudentDto getStudentById(int id);	
	List<StudentDto> getAllStudent();
	String deleteStudentById(int id);
	void deleteAllStudent();
	StudentDto assignCourseToTeam(int id, int courseCode);
	
	List<StudentDto> getStudentByStudent_name(String Student_name);
	List<StudentDto> getStudentByClass_name(String class_name);
	List<StudentDto> getStudentByCity(String city);


	List<StudentDto> getStudentByCourse(int course_code);

}
