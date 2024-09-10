package Logica;

import java.util.Date;

public abstract class Person {
    protected int codigoID;
    protected String name;
    protected String addres;
    protected String bankDetails;
    protected Date bornDate;
    protected String phone;

    public Person() {
    }

    public Person(int codigoID, String name, String addres, String bankDetails, Date bornDate, String phone) {
        this.codigoID = codigoID;
        this.name = name;
        this.addres = addres;
        this.bankDetails = bankDetails;
        this.bornDate = bornDate;
        this.phone = phone;
    }
    
    //Metodos
    

    
    //Getters y Setters

    public int getcID() {
        return codigoID;
    }

    public void setcID(int cID) {
        this.codigoID = cID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddres() {
        return addres;
    }

    public void setAddres(String addres) {
        this.addres = addres;
    }

    public String getBankDetails() {
        return bankDetails;
    }

    public void setBankDetails(String bankDetails) {
        this.bankDetails = bankDetails;
    }

    public Date getBornDate() {
        return bornDate;
    }

    public void setBornDate(Date bornDate) {
        this.bornDate = bornDate;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Person{" + "codigoID=" + codigoID + ", name=" + name + ", addres=" + addres + ", bankDetails=" + bankDetails + ", bornDate=" + bornDate + ", phone=" + phone + '}';
    }
    
    
}
