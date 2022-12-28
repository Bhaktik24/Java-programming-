package com.college.servicelmp;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.college.entity.Student;

import com.college.exception.StudentNotFoundException;
import com.college.model.StudentDto;
import com.college.repository.StudentRepository;
import com.college.service.StudentService;

@Service
public class StudentServiceImp<StudentConvertor> implements StudentService {
	
	@Autowired
	private StudentRepository StudentRepository;
	@Autowired
	private StudentConvertor studentConvertor;
	@Autowired
	private StudentRepository studentRepository;
	private Object Student;

	
	@Override
	public String createStudent(Student student) {   //method for creating Team
		String message = null;
		studentRepository.save(student);  //saving bank to database
		if(student!=null) {
			message = "New Student is formed";
		}
		return message;
	} //end of method


	@Override
	public StudentDto updateStudent(int id, Student student) {
		// TODO Auto-generated method stub
		Student getStudent = studentRepository.findById(id).get();
		getStudent.setStudent_name(student.getStudent_name());
		getStudent.setClass_name(student.getClass_name());
		getStudent.setCity(student.getCity());
		getStudent.setCountry(student.getCountry());
		
		studentRepository.save(getStudent);
		return studentConvertor.convertStudentEntityToStudentDto(getStudent);
	}


	@Override
	public StudentDto getStudentById(int id) {
		//method for getting Team by id
		Student teams = StudentRepository.findById(id).get();		
				return StudentConvertor.convertStudentEntityToStudentDto(Student);
		
	}


	@Override
	public List<StudentDto> getAllStudent() {
		//method for getting all id
				List<Student> Student = StudentRepository.findAll();
				List<StudentDto> StudentDto = new ArrayList<>();
				for(Student a: Student) {
					StudentDto.add(StudentConvertor.convertStudentEntityToStudentDto(a));
				}
				return StudentDto;
	}


	@Override
	public String deleteStudentById(int id) {
		//method for deleting team by id
				String message=null;
				Optional<Student> student=StudentRepository.findById(id);
				if(Student.isPresent()) {		
					StudentRepository.deleteById(id);
					message = "Student Deleted Successfully.....";
				}
				else {
					message = "Team Details are not found... ==> "+id+"\n ----Enter Correct Team Id !";
				}
				return message;
	}


	@Override
	public void deleteAllTeams() {
		//method for deleting all teams
				teamsRepository.deleteAll();
		
	}


	@Override
	public TeamsDto assignCoachToTeam(int id, int coachId) {
		//method for assigning coach to team
				Teams teams = teamsRepository.findById(id).orElseThrow(()-> new TeamNotFoundException("Team","ID",id));
				Coach coach = coachRepository.findById(coachId).orElseThrow(()-> new CoachNotFoundException("Coach","ID",id));
				teams.setCoach(coach);
				teamsRepository.save(teams);
				return teamsConvertor.convertTeamsEntityToTeamsDto(teams);
	}


	@Override
	public List<TeamsDto> getTeamsByTeam_name(String team_name) {
		List<Teams> teams = teamsRepository.getTeamByTeam_name(team_name);
		List<TeamsDto> teamsDto = new ArrayList<>();
		for(Teams a: teams) {
			teamsDto.add(teamsConvertor.convertTeamsEntityToTeamsDto(a));
		}
		return teamsDto;
	}


	@Override
	public List<TeamsDto> getTeamsBySport_name(String sport_name) {
		List<Teams> teams= teamsRepository.getTeamsBySport_name(sport_name);
		List<TeamsDto> teamsDto = new ArrayList<>();
		for(Teams a: teams) {
			teamsDto.add(teamsConvertor.convertTeamsEntityToTeamsDto(a));
		}
		return teamsDto;
	}
		
	@Override
	public List<TeamsDto> getTeamsByCity(String city) {
		List<Teams> teams = teamsRepository.getTeamsByCity(city);
		List<TeamsDto> teamsDto = new ArrayList<>();
		for(Teams a: teams) {
			teamsDto.add(teamsConvertor.convertTeamsEntityToTeamsDto(a));
		}
		return teamsDto;
	
	}
	@Override
	public List<TeamsDto> getTeamsByCoach(int coachId) {
		List<Teams>teams= teamsRepository.getTeamsByCoach(coachId);
		List<TeamsDto> teamsDto = new ArrayList<>();
		for(Teams a : teams) {
			teamsDto.add(teamsConvertor.convertTeamsEntityToTeamsDto(a));
		}
		return teamsDto;
	}


	@Override
	public void deleteAllStudent() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public StudentDto assignCourseToTeam(int id, int courseCode) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public List<StudentDto> getStudentByStudent_name(String Student_name) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public List<StudentDto> getStudentByClass_name(String class_name) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public List<StudentDto> getStudentByCity(String city) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public List<StudentDto> getStudentByCourse(int course_code) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
