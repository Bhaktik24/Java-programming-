package com.entity;

import jakarta.persistence.*;


@Entity
@Table(name="staff")

public class Staff {

	//variables
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id")
    private int id;
    
    @Column(name="first_name")
    private String firstName;
    
    @Column(name="last_name")
    private String lastName;

 

    @Column(name="location")
    private String location;
    
    @OneToOne(cascade=CascadeType.ALL)
    @JoinColumn(name="staff_detail_id")
    private StaffDetail instructorDetail;

	private StaffDetail staffDetail;
    
    //default constructor
    public Staff() {
        
    }

 
    //parameterized constructor
    public Staff(String firstName, String lastName, String location) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.location = location;
    }

 
    //gatter & Setter
    public int getId() {
        return id;
    }

 

    public void setId(int id) {
        this.id = id;
    }

 

    public String getFirstName() {
        return firstName;
    }

 

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

 

    public String getLastName() {
        return lastName;
    }

 

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

 

    public String getlocation() {
        return location;
    }

 

    public void setlocation(String location) {
        this.location = location;
    }

 

    public StaffDetail getStaffDetail() {
        return staffDetail;
    }

 

    public void setStaffDetail(StaffDetail staffDetail) {
        this.staffDetail = staffDetail;
    }

 

    @Override
    public String toString() {
        return "Staff [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", location=" + location
                + ", staffDetail=" + staffDetail + "]";
    }
}
