package com.luv2code.springdemo.mvc.demo.entity;

import javax.persistence.*;

@Entity
@Table(name = "instructor")
public class Instructor {

    public Instructor(){}

    public Instructor(String firstName , String lastName, String email){
        this.firstName = firstName;
        this.lastName=lastName;
        this.email=email;
    }

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id ;

    @Column(name="firstName")
    String firstName;

    @Column(name="lastName")
    String lastName;

    @Column
    String email;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "instructor_detail_id")
    private InstructorDetails instructorDetails;

    public InstructorDetails getInstructorDetails() {
        return instructorDetails;
    }

    public void setInstructorDetails(InstructorDetails instructorDetails) {
        this.instructorDetails = instructorDetails;
    }

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Instructor{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
