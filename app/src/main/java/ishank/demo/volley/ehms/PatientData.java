package ishank.demo.volley.ehms;

public class PatientData {
    String name, age, gender, dob, email, phone, address, prescription_present, prescription_old,
            medicine_present, medicine_old, appointment, allergies, chronic, bills;

    public PatientData(String name, String age, String gender, String dob, String email, String phone, String address, String prescription_present, String prescription_old, String medicine_present, String medicine_old, String appointment, String allergies, String chronic, String bills) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.dob = dob;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.prescription_present = prescription_present;
        this.prescription_old = prescription_old;
        this.medicine_present = medicine_present;
        this.medicine_old = medicine_old;
        this.appointment = appointment;
        this.allergies = allergies;
        this.chronic = chronic;
        this.bills = bills;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPrescription_present() {
        return prescription_present;
    }

    public void setPrescription_present(String prescription_present) {
        this.prescription_present = prescription_present;
    }

    public String getPrescription_old() {
        return prescription_old;
    }

    public void setPrescription_old(String prescription_old) {
        this.prescription_old = prescription_old;
    }

    public String getMedicine_present() {
        return medicine_present;
    }

    public void setMedicine_present(String medicine_present) {
        this.medicine_present = medicine_present;
    }

    public String getMedicine_old() {
        return medicine_old;
    }

    public void setMedicine_old(String medicine_old) {
        this.medicine_old = medicine_old;
    }

    public String getAppointment() {
        return appointment;
    }

    public void setAppointment(String appointment) {
        this.appointment = appointment;
    }

    public String getAllergies() {
        return allergies;
    }

    public void setAllergies(String allergies) {
        this.allergies = allergies;
    }

    public String getChronic() {
        return chronic;
    }

    public void setChronic(String chronic) {
        this.chronic = chronic;
    }

    public String getBills() {
        return bills;
    }

    public void setBills(String bills) {
        this.bills = bills;
    }
}
