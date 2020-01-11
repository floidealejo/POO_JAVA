package model;

import java.util.Date;

public class Main {

    public static void main(String[] args) {

        //showMenu();
        Doctor myDoctor = new Doctor("Alejandro Upegui ", "Ortopedista");
        myDoctor.AddAvailableAppointment(new Date(),"4pm");
        myDoctor.AddAvailableAppointment(new Date(),"10pm");
        myDoctor.AddAvailableAppointment(new Date(),"12pm");
        myDoctor.AddAvailableAppointment(new Date(),"2:40pm");

        User usuario1 = new Doctor("Sandra Magañon", "magañon@gmail.com");
        usuario1.showDataUser();


        /*
        for (Doctor.AvailableAppointment availableAppointment:myDoctor.getAvailableAppointments()) {
            System.out.println(availableAppointment.getFecha() + " " + availableAppointment.getTime());
        }
        */

        //System.out.println(myDoctor.getAvailableAppointments());

        /*
        model.Doctor myDoctor2 = new model.Doctor("Alejandro Osorio ", "Ostetra");

        model.Patient patient1 = new model.Patient();
        patient1.setName("Andresito Herera");
        patient1.setEmail("andresito@gmail.com");
        patient1.setPhoneNumber("12345678");


        System.out.println(myDoctor.name);
        System.out.println(myDoctor.speciality);
        myDoctor.showId();

        System.out.println(myDoctor2.name);
        System.out.println(myDoctor2.speciality);
        myDoctor2.showId();

        System.out.println(patient1.getName());
        System.out.println(patient1.getEmail());
        System.out.println(patient1.getPhoneNumber());
    */
    }
    }

