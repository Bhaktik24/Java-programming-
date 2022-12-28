package com.college.serviceImp;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.college.entity.Coach;
import com.college.exception.CoachNotFoundException;
import com.college.model.CoachDto;
import com.college.repository.CoachRepository;
import com.college.service.CoachService;
import com.college.util.CoachConvertor;

@Service
public class CoachServiceImp implements CoachService {
	
	@Autowired
	private CoachRepository coachRepository;  //instance of coachRepository
	
	@Autowired
	private CoachConvertor coachConvertor;  //instance of coachConvertor

	@Override
	public String createCoach(Coach coach) {
		//method creating new coach
				String message = null;
				coachRepository.save(coach);  //saving coach to database
				if(coach!=null) {
					message = "New Coach is assign to Team ..";
				}
				return message;
	} //end of method
	

	@Override
	public CoachDto updateCoach(int id, Coach coach) {
		//method for updating coach
		Coach getCoach = coachRepository.findById(id).orElseThrow(()-> new CoachNotFoundException("Coach","ID",id));
		getCoach.setCoach_name(coach.getCoach_name());
		getCoach.setCity(coach.getCity());
		getCoach.setCountry(coach.getCountry());
		getCoach.setPhone_no(coach.getPhone_no());;
		coachRepository.save(getCoach); //saving coach to database
			return coachConvertor.convertCoachEntityToCoachDto(getCoach);
	} //end of method

	

	@Override
	public CoachDto getCoachById(int id) {
		//method for getting coach details by Id
				Coach coach = coachRepository.findById(id).orElseThrow(()-> new CoachNotFoundException("Coach","ID",id));
				return coachConvertor.convertCoachEntityToCoachDto(coach);
	}
	

	@Override
	public List<CoachDto> getAllCoaches() {
		//method for showing all coaches
		List<Coach> coachList =coachRepository.findAll();
		List<CoachDto> coachDto = new ArrayList<>();
		for(Coach b: coachList) {
			coachDto.add(coachConvertor.convertCoachEntityToCoachDto(b));
		}
			return coachDto;
	}
	

	@Override
	public String deleteCoachById(int id) {
		//method for delete coach by id
				String message=null;
				Optional<Coach> coach=coachRepository.findById(id);
				if(coach.isPresent()) {
					
					coachRepository.deleteById(id);
					message = "Coach Delteted  Successfully....";
				}
				else {
					message = "Coach Details are not found........";
				}
				return message;
	}

	@Override
	public void deleteAllCoaches() {
		//method for removing all Coach from dataabses
		coachRepository.deleteAll();
		
	}

	@Override
	public List<CoachDto> getCoachByCoach_name(String coach_name) {
		List<Coach> coach = coachRepository.getCoachByCoach_name(coach_name);
		List<CoachDto> coachDto = new ArrayList<>();
		for(Coach b : coach) {
			coachDto.add(coachConvertor.convertCoachEntityToCoachDto(b));
		}
			return coachDto;
	}

	@Override
	public List<CoachDto> getCoachByPhone_no(long phone_no) {
		List<Coach> coach = coachRepository.getCoachByPhone_no(phone_no);
		List<CoachDto> coachDto = new ArrayList<>();
		for(Coach b : coach) {
			coachDto.add(coachConvertor.convertCoachEntityToCoachDto(b));
		}
			return coachDto;
		
	}

	@Override
	public List<CoachDto> getCoachByCity(String city) {
		List<Coach> coach = coachRepository.getCoachByCity(city);
		List<CoachDto> coachDto = new ArrayList<>();
		for(Coach b : coach) {
			coachDto.add(coachConvertor.convertCoachEntityToCoachDto(b));
		}
			return coachDto;
	}

}
