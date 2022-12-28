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

import com.college.entity.Student;
import com.college.model.StudentDto;
import com.college.service.StudentService;


@RestController
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	@Autowired
	private StudentController studentConvertor;
	private Object teamsService;
	private int course_code;
	
	@PostMapping("/createStudent")
	public String createStudent(@RequestBody StudentDto studentDto) {
		final Student student = studentConvertor.convertStudentDtoToStudentEntity(studentDto);
		return studentService.createStudent(student);
	}
	
	private Student convertStudentDtoToStudentEntity(StudentDto studentDto) {
		// TODO Auto-generated method stub
		return null;
	}

	@PutMapping("/updateStudent/{id}")
	public StudentDto updateStudent(@PathVariable("id") int id ,@RequestBody StudentDto studentDto) {
		Student student = studentConvertor.convertStudentDtoToStudentEntity(studentDto);
		return studentService.updateStudent(id, student);
		
	}
	
	@GetMapping("/getStudent/{id}")
	public StudentDto getStudent(@PathVariable("id") int id) {
		return studentService.getStudentById(id);
	}
	
	@GetMapping("/getAllStudent")
	public List<StudentDto> getAllStudent(){
		return studentService.getAllStudent();
	}
	
	@DeleteMapping("/deleteStudent/{id}")
	public String deleteStudent(@PathVariable("id") int id) {
		return studentService.deleteStudentById(id);
	}
	@DeleteMapping("/deleteAll")
	public ResponseEntity<String> deleteAll(){
		studentService.deleteAllStudent();
		return new ResponseEntity<String>("All Student Details Are Deleted" , HttpStatus.OK);
	}
	
	@PostMapping("/assign/{id}/{couse_id}")
	public ResponseEntity<String> assignCoachToTeamId(@PathVariable("id") int id,@PathVariable("coachId") int coach_id) {
		((StudentService) teamsService).assignCourseToTeam(id, course_code);
		return new ResponseEntity<String>("Coach is created having id :"+id+" is "+ coach_id ,HttpStatus.OK);
	}
	
	@GetMapping("/getByStudent_Name/{student_name}")
	public List<StudentDto> getStudentByStudent_name(@PathVariable("name") String student_name){
		return studentService.getStudentByStudent_name(student_name);
	}
	@GetMapping("/getByClassName/{class_name}")
	public List<StudentDto> getStudentByClass_name(@PathVariable(" class name") String class_name){
		return studentService.getStudentByClass_name(class_name);
	}
	@GetMapping("/getByCity/{city}")
	public List<StudentDto> getStudentByCity(@PathVariable("city") String city){
		return studentService.getStudentByCity(city);
	}
	

	}
	
