package com.entity;

import jakarta.persistence.*;


@Entity
@Table(name="staff_detail")

public class StaffDetail {
	 @Id
	    @GeneratedValue(strategy=GenerationType.IDENTITY)
	    
	    //variables
	    @Column(name="id")
	    private int id;
	    
	    @Column(name="Subject")
	    private String subject;
	    
	    @Column(name="Degree")
	    private String degree;
	    
	    @OneToOne(mappedBy="staffDetail", cascade=CascadeType.ALL)
	    private Staff staff;
	    
	    //default constructor
	    public StaffDetail() {
	        
	    }

	 
	    //Parameterized Constructor
	    public StaffDetail(String subject, String degree) {
	        this.subject = subject;
	        this.degree = degree;
	    }

	 
	    //getter & setter
	    public int getId() {
	        return id;
	    }

	 

	    public void setId(int id) {
	        this.id = id;
	    }

	 

	    public String getSubject() {
	        return subject;
	    }

	 

	    public void setSubject(String subject) {
	        this.subject = subject;
	    }

	 

	    public String getDegree() {
	        return degree;
	    }

	 

	    public void setDegree(String degree) {
	        this.degree = degree;
	    }
	    
	    public Staff getStaff() {
	        return staff;
	    }

	 

	    public void setStaff(Staff staff) {
	        this.staff = staff;
	    }

	 

	    @Override
	    public String toString() {
	        return "StaffDetail [id=" + id + ", Subject=" + subject + ", Degree=" + degree + "]";
	    }

}
