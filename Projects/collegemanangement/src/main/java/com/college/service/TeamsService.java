package com.college.service;

import java.util.List;

import com.college.entity.Teams;
import com.college.model.TeamsDto;





public interface TeamsService {
	
	String createTeam(Teams team);
	TeamsDto updateTeam(int id,Teams team);
	TeamsDto getTeamById(int id);	
	List<TeamsDto> getAllTeams();
	String deleteTeamById(int id);
	void deleteAllTeams();
	TeamsDto assignCoachToTeam(int id, int coachId);
	
	List<TeamsDto> getTeamsByTeam_name(String team_name);
	List<TeamsDto> getTeamsBySport_name(String sport_name);
	List<TeamsDto> getTeamsByCity(String city);
	List<TeamsDto>getTeamsByCoach(int coach_id);
	
	
	
	
}

