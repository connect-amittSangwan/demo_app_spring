package com.luv2code.springdemo.mvc.commons;

import com.luv2code.springdemo.mvc.demo.entity.Instructor;
import com.luv2code.springdemo.mvc.demo.entity.InstructorDetails;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class BaseClass {

        public static Session getSession(){

            final SessionFactory factory = new Configuration()
                    .configure("hibernate.cfg.xml")
                    .addAnnotatedClass(Instructor.class)
                    .addAnnotatedClass(InstructorDetails.class)
                    .buildSessionFactory();

            final  Session session = factory.getCurrentSession();
            return session;

    }
}