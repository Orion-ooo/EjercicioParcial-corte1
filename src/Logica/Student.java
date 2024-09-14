package Logica;

import java.util.Date;

public class Student extends Person {
    private String motherName;
    private String fatherName;
    private Cycle cycle;
    private Course course;

    public Student() {
    }

    public Student(String motherName, String fatherName, Cycle cycle, int cID, String name, String addres, BankDetails bankDetails, Date bornDate, String phone) {
        super(cID, name, addres, bankDetails, bornDate, phone);
        this.motherName = motherName;
        this.fatherName = fatherName;
        this.cycle = cycle;
    }

    //Metodos

    
    
    //Getters y Setters
    
    public String getMotherName() {
        return motherName;
    }

    public void setMotherName(String motherName) {
        this.motherName = motherName;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public Cycle getCycle() {
        return cycle;
    }

    public void setCycle(Cycle cycle) {
        this.cycle = cycle;
    }
    
    
}
