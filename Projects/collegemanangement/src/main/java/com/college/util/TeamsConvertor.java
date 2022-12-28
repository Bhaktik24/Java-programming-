package com.college.util;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import com.college.entity.Teams;
import com.college.model.TeamsDto;

@Component
public class TeamsConvertor {
	//Method for converting Dto to Entity
		public Teams convertTeamsDtoToTeamsEntity(TeamsDto teamsDto) {
			
			Teams teams =new Teams(); //creation of object
			if(teams!=null) {
				BeanUtils.copyProperties(teamsDto, teams); //copy properties of teams
			}
			return teams;
		}
		
		//Method for converting Entity to Dto
		public TeamsDto convertTeamsEntityToTeamsDto(Teams teams) {
			TeamsDto teamsDto = new TeamsDto(); //creation of object
			if(teamsDto!=null) {
				BeanUtils.copyProperties(teams, teamsDto); //copy properties of TeamsDto
			}
			return teamsDto;
		}

}
