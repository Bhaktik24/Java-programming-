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

import com.college.entity.Teams;
import com.college.model.TeamsDto;
import com.college.service.TeamsService;
import com.college.util.TeamsConvertor;

@RestController
public class TeamsController {
	
	@Autowired
	private TeamsService teamsService;
	@Autowired
	private TeamsConvertor teamsConvertor;
	
	@PostMapping("/createTeam")
	public String createTeam(@RequestBody TeamsDto teamsDto) {
		final Teams teams = teamsConvertor.convertTeamsDtoToTeamsEntity(teamsDto);
		return teamsService.createTeam(teams);
	}
	
	@PutMapping("/updateTeam/{id}")
	public TeamsDto updateTeam(@PathVariable("id") int id ,@RequestBody TeamsDto teamsDto) {
		Teams teams = teamsConvertor.convertTeamsDtoToTeamsEntity(teamsDto);
		return teamsService.updateTeam(id, teams);
		
	}
	
	@GetMapping("/getTeam/{id}")
	public TeamsDto getTeams(@PathVariable("id") int id) {
		return teamsService.getTeamById(id);
	}
	
	@GetMapping("/getAllTeams")
	public List<TeamsDto> getAllTeams(){
		return teamsService.getAllTeams();
	}
	
	@DeleteMapping("/deleteTeam/{id}")
	public String deleteTeam(@PathVariable("id") int id) {
		return teamsService.deleteTeamById(id);
	}
	@DeleteMapping("/deleteAll")
	public ResponseEntity<String> deleteAll(){
		teamsService.deleteAllTeams();
		return new ResponseEntity<String>("All Team Details Are Deleted" , HttpStatus.OK);
	}
	
	@PostMapping("/assign/{id}/{coach_id}")
	public ResponseEntity<String> assignCoachToTeamId(@PathVariable("id") int id,@PathVariable("coachId") int coach_id) {
		teamsService.assignCoachToTeam(id, coach_id);
		return new ResponseEntity<String>("Coach is created having id :"+id+" is "+ coach_id ,HttpStatus.OK);
	}
	
	@GetMapping("/getByTeam_Name/{team_name}")
	public List<TeamsDto> getTeamsByTeam_name(@PathVariable("name") String team_name){
		return teamsService.getTeamsByTeam_name(team_name);
	}
	@GetMapping("/getBySportName/{sport_name}")
	public List<TeamsDto> getTeamsBySport_name(@PathVariable("name") String sport_name){
		return teamsService.getTeamsBySport_name(sport_name);
	}
	@GetMapping("/getByCity/{city}")
	public List<TeamsDto> getTeamsByCity(@PathVariable("city") String city){
		return teamsService.getTeamsByCity(city);
	}
	
	@GetMapping("/getByCoach/{id}")
	public List<TeamsDto> getTeamsByCoach(@PathVariable("id") int coach_id){
		return teamsService.getTeamsByCoach(coach_id);
	}

}
