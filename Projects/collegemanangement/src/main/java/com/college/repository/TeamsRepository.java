package com.college.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.college.entity.Teams;

@Repository
public interface TeamsRepository extends JpaRepository<Teams,Integer>{

	@Query("from Teams where team_name like :s%")
	List<Teams> getTeamByTeam_name(@Param("s") String team_name);
	@Query("from Teams where sport_name like :s%")
	List<Teams> getTeamsBySport_name(@Param("s") String sport_name);
	@Query("from Teams where city like :s%")
	List<Teams>getTeamsByCity(@Param("s") String city);
	@Query("from Teams where coach_id =:s")
	List<Teams> getTeamsByCoach(@Param("s") int id);
	
	
  
  
   
	 
}
