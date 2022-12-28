package com.college.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.college.entity.Coach;

@Repository
public interface CoachRepository extends JpaRepository<Coach,Integer>{

	@Query("from Coach where coach_name like :s%")
	List<Coach> getCoachByCoach_name(@Param("s")String coach_Name);
	@Query("from Coach where phone_no =:s")
	List<Coach> getCoachByPhone_no(@Param("s")Long phone_no);
	@Query("from Coach where city like :s%")
	List<Coach> getCoachByCity(@Param("s")String city);
	
}
