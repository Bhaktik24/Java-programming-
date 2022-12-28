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

import com.college.entity.Coach;
import com.college.model.CoachDto;
import com.college.service.CoachService;
import com.college.util.CoachConvertor;

@RestController
public class CoachController {
	
	@Autowired
	private CoachService coachService;
	@Autowired
	private CoachConvertor coachConvertor;
	
	@PostMapping("/create")
	public String createCoach(@RequestBody CoachDto coachDto) {
		final Coach coach = coachConvertor.convertCoachDtoToCoachEntity(coachDto);
		return coachService.createCoach(coach);
	}
	
	@PutMapping("/update/{id}")
	public CoachDto updateCoach(@PathVariable("id") int id,@RequestBody CoachDto coachDto) {
		Coach coach = coachConvertor.convertCoachDtoToCoachEntity(coachDto);
		return coachService.updateCoach(id, coach);
	}
	
	@GetMapping("/get/{id}")
	public CoachDto getCoach(@PathVariable("id") int id) {
		return coachService.getCoachById(id);
	}
	
	@GetMapping("/getAll")
	public List<CoachDto> getAllCoach(){
		return coachService.getAllCoaches();
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteCoachById(@PathVariable("id") int id) {
		return coachService.deleteCoachById(id);
	}
	
	@DeleteMapping("/deleteAllCoach")
	public ResponseEntity<String> deleteAllCoach(){
		coachService.deleteAllCoaches();
		return new ResponseEntity<String>("All Coach Details Are Deleted",HttpStatus.OK);
	}
	
	@GetMapping("/getByCoach_Name/{coach_name}")
	public List<CoachDto> getCoachByCoach_name(@PathVariable("coach_name") String coach_name){
		return coachService.getCoachByCoach_name(coach_name);
	}
	@GetMapping("/getByPhone_no/{phone_no}")
	public List<CoachDto> getCoachByPhone_no(@PathVariable("phone_no") long phone_no){
		return coachService.getCoachByPhone_no(phone_no) ;
	}
	
	@GetMapping("/getByCoachCity/{city}")
	public List<CoachDto> getCoachByCity(@PathVariable("city") String city){
		return coachService.getCoachByCity(city);
	}

}
