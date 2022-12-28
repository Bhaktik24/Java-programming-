package com.college.model;

import com.college.entity.Course;


import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class StudentDto
{
	private int id;
	private String student_name;
	private String class_name;
	private String city;
	private String country;
	private Course course;
}
