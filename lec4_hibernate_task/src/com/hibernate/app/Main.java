package com.hibernate.app;

import com.hibernate.app.model.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {
        Configuration configuration = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Doctor.class)
                .addAnnotatedClass(DoctorData.class)
                .addAnnotatedClass(Hospital.class)
                .addAnnotatedClass(Patient.class);
        SessionFactory factory = configuration.buildSessionFactory();


    }
}
