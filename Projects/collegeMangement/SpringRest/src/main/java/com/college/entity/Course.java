package com.college.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.*;

@JsonIgnoreProperties({"hibernateLazyInitializer"})
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name="Course")

public class Course {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private  int couse_code;
	
	@NotNull(message="course name is Required")
	private String course_name;
	
	@NotNull(message="phone no is required")
	private String staff_name;
	
	@NotNull(message="location name is required")
	private String location;
	
	
	
	@Builder
	public Course( String course_name, String staff_name, String location) {
		super();
		this.course_name = course_name;
		this.staff_name = staff_name;
		this.location = location;
		
	}

	
	
}
