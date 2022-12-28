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
@Table(name="coach")

public class Coach {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private  int coach_id;
	
	@NotNull(message="Coach name is Required")
	private String coach_name;
	
	@NotNull(message="phone no is required")
	private long phone_no;
	
	@NotNull(message="City name is required")
	private String city;
	
	@NotNull(message="Country name is required")
	private String country;
	
	@Builder
	public Coach( String coach_name, long phone_no, String city,String country) {
		super();
		this.coach_name = coach_name;
		this.phone_no = phone_no;
		this.city = city;
		this.country = country;
	}

	
	
}
