package com.college.util;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import com.college.entity.Coach;
import com.college.model.CoachDto;

@Component
public class CoachConvertor {
	//Method for converting Dto to Entity
		public Coach convertCoachDtoToCoachEntity(CoachDto coachDto) {
			
			Coach coach =new Coach(); //creation of object
			if(coach!=null) {
				BeanUtils.copyProperties(coachDto, coach); //copy properties of coach
			}
			return coach;
		}
		
		//Method for converting Entity to Dto
		public CoachDto convertCoachEntityToCoachDto(Coach coach) {
			CoachDto coachDto =new CoachDto(); //creation of object
			if(coachDto!=null) {
				BeanUtils.copyProperties(coach, coachDto); //copy properties of coachDto
			}
			return coachDto;
		}

}
