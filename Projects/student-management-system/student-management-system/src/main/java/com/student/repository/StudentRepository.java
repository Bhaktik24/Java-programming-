package com.student.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.student.model.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{
	List<Student> findBy(Long id);
	List<Student> findByTitleContaining(String name);

}
