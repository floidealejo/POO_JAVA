package model;

public class Patient extends User{
    private static int idPatient;
   //Atributos
    private String birthday;
    private String blood;
    private double weight;
    private double height;

    public Patient(String name, String email) {
        super(name,email);
    }

    @Override
    public void showDataUser() {
        System.out.println("Nombre del paciente : Alejandro Surriaga");
        System.out.println("Historial completo desde el nacimiento");
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getBlood() {
        return blood;
    }

    public void setBlood(String blood) {
        this.blood = blood;
    }

    public String getWeight() {
        return weight + "KG";
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getHeight() {
        return height + "mts";
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
