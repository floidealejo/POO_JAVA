public class Patient {
    private static int idPatient;
    private String name;
    private String email;
    private String address;
    private String phoneNumber;
    private String birthday;
    private String blood;
    private double weight;
    private double height;

    public Patient(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        if (phoneNumber.length() > 8) {
            System.out.println("El numero telefonico debe ser de 8 digitos maximo");
        } else if (phoneNumber.length() == 8) {
            this.phoneNumber = phoneNumber;
        }
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
