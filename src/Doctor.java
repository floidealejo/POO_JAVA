import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Date;

public class Doctor extends User{
    //Atributo
    private String speciality;

    Doctor(String name, String email){
        super(name,email);
        System.out.println("El nombre del doctor es : " + name);
        this.speciality = speciality;
    }
    //Comportamientos


    /**
     * Deescripcion : Metodo que crea nuevas  citas disponibles a una coleccion
     */
    ArrayList<AvailableAppointment> availableAppointments = new ArrayList<>();
    public void AddAvailableAppointment(Date fecha, String time){
            availableAppointments.add(new Doctor.AvailableAppointment(fecha,time));
    }

    public ArrayList<AvailableAppointment> getAvailableAppointments() {
        return availableAppointments;
    }

    public static class  AvailableAppointment{
        private int id;
        private Date fecha;
        private String time;

        public AvailableAppointment(Date fecha, String time) {
            this.fecha = fecha;
            this.time = time;
        }

        public Date getFecha() {
            return fecha;
        }

        public void setFecha(Date fecha) {
            this.fecha = fecha;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }
    }
}
