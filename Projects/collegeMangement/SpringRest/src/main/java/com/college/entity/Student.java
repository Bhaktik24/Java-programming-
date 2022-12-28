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
@Entity
@ToString
@Table(name="Student")
public class Student {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int student_id;
	
	@NotNull(message="Student name is required")
	private String student_name;
	
	@NotNull(message="class name is required")
	private String class_name;
	
	@NotNull(message="City name is required")
	private String city;
	
	@NotNull(message="Country name is required")
	private String country;
	
	@OneToOne(fetch=FetchType.LAZY,cascade=CascadeType.ALL)
	@JoinColumn(name="student_id")
	private Course course;
	
	@Builder
	public Student( String student_name,String class_name, String city,String country) {
		super();
		this.student_name = student_name;
		this.class_name = class_name;
		this.city = city;
		this.country = country;
	}

	.
	
	
	
}