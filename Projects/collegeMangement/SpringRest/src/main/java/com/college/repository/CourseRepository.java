package com.college.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.college.entity.Course;





@Repository
public interface CourseRepository extends  JpaRepository<Course, Integer> {
	
	@Query("from Course where course_name like :s%")
	List<Course> getCourseByCourse_name(@Param("s")String course_Name);
	@Query("from Course where Staff_name like :s%")
	List<Course> getCourseByStaff_name(@Param("s")String staff_name);
	@Query("from Course where location like :s%")
	List<Course> getCourseByLocation(@Param("s")String location);
		
	
		
		

}
