import ui.UIMenu;

import static ui.UIMenu.showMenu;

public class Main {

    public static void main(String[] args) {

        //showMenu();
        Doctor myDoctor = new Doctor("Alejandro Upegui ", "Ortopedista");
        Doctor myDoctor2 = new Doctor("Alejandro Osorio ", "Ostetra");

        Patient patient1 = new Patient("Julian Arango", "juli33@gmail.com");
        Patient patient2 = new Patient("Samuel Moreno", "samuelCarurrusel@hotmail.com");

        System.out.println(myDoctor.name);
        System.out.println(myDoctor.speciality);
        myDoctor.showId();

        System.out.println(myDoctor2.name);
        System.out.println(myDoctor2.speciality);
        myDoctor2.showId();

        System.out.println(patient1.name);
        System.out.println(patient1.email);

        System.out.println(patient2.name);
        System.out.println(patient2.email);
    }
    }

