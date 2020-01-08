public class Doctor {
    static int id = 0; // Autoincrement
    String name;
    String speciality;
    String email;


    Doctor(){
        System.out.println("Construyendo el objeto Doctor");
    }

    Doctor(String name, String speciality){
        id ++;
        System.out.println("El nombre del doctor es : " + name);
        this.name = name;
        this.speciality = speciality;
    }
    //Comportamientos
    public void showName(){
        System.out.println(name);
    }
    public void showId(){
        System.out.println(" El doctor " + name  + " tiene identificacion : " + id);
    }
}
