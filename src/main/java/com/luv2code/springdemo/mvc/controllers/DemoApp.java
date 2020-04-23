package com.luv2code.springdemo.mvc.controllers;

import com.luv2code.springdemo.mvc.commons.BaseClass;
import com.luv2code.springdemo.mvc.demo.entity.Instructor;
import com.luv2code.springdemo.mvc.demo.entity.InstructorDetails;
import org.hibernate.Session;

public class DemoApp extends BaseClass {

    public static void main(String args[]) {
        //Creating Objects
        Instructor tempInstructor = new Instructor("ram", "sharma", "ram.sharma@gmail.com");

        InstructorDetails tempInstructorDetails = new InstructorDetails("https://xathon.com", "Playing");

        //Associating Objects
        tempInstructor.setInstructorDetails(tempInstructorDetails);

        //Start a transaction
        Session session = getSession();

        session.beginTransaction();

        //Save the instructor
        //It will also save the details objects because of cascade type ALL

        session.saveOrUpdate(tempInstructor);
        //Commit transaction

        session.getTransaction().commit();
        System.out.println("DONE");

    }
}
