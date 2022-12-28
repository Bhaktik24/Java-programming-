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
@Table(name="Teams")
public class Teams {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int team_id;
	
	@NotNull(message="Sport name is required")
	private String sport_name;
	
	@NotNull(message="Team name is required")
	private String team_name;
	
	@NotNull(message="City name is required")
	private String city;
	
	@NotNull(message="Country name is required")
	private String country;
	
	@OneToOne(fetch=FetchType.LAZY,cascade=CascadeType.ALL)
	@JoinColumn(name="coach_id")
	private Coach coach;
	
	@Builder
	public Teams( String sport_name,String team_name, String city,String country) {
		super();
		this.sport_name = sport_name;
		this.team_name = team_name;
		this.city = city;
		this.country = country;
	}
	
	
	
}