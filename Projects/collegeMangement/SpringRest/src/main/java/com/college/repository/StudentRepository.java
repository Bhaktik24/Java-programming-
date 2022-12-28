package com.college.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.college.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

	@Query("from Student where student_name like :s%")
	List<Student> getStudentByStudent_name(@Param("s") String student_name);
	@Query("from Student where class_name like :s%")
	List<Student> getStudentByClass_name(@Param("s") String class_name);
	@Query("from Student where city like :s%")
	List<Student>getStudentByCity(@Param("s") String city);
	@Query("from Student where course_id =:s")
	List<Student> getStudentByCourse(@Param("s") int id);
	
}
