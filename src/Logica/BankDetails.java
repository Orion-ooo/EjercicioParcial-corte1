
package Logica;

import java.util.Scanner;

public class BankDetails {
    private String bankName;
    private String haveDebt;
    private double debtAmount;
    private String active;
    
    static Scanner entrada = new Scanner(System.in);

    public BankDetails() {
    }

    public BankDetails(String bankName, String haveDebt, double debtAmount, String active) {
        this.bankName = bankName;
        this.haveDebt = haveDebt;
        this.debtAmount = debtAmount;
        this.active = active;
    }
    
    //Metodos
    
    public void BankRegister(){
        System.out.println("tiene una cuenta bancaria activa?");
        active = entrada.next();
        
        if(active.equalsIgnoreCase("si")){
            System.out.println("Ingrese el nombre del banco:");
            bankName = entrada.next();
            System.out.println("Tiene deuda?");
            haveDebt = entrada.next();
            if(haveDebt.equalsIgnoreCase("Si")){
                System.out.println("Ingrese la deuda");
                debtAmount = entrada.nextDouble();
            }else if(haveDebt.equalsIgnoreCase("no")){
                
            }
        }
    }
    
    //Getters y Setters

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getHaveDebt() {
        return haveDebt;
    }

    public void setHaveDebt(String haveDebt) {
        this.haveDebt = haveDebt;
    }
    
    public double getDebtAmount(){
        return debtAmount;
    }
    
    public void setDebtAmount(double debtAmount){
        this.debtAmount = debtAmount;
    }

    public String getActive() {
        return active;
    }

    public void setActive(String active) {
        this.active = active;
    }
    
    
    
            
}
