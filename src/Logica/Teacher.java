package Logica;

import java.util.Date;

public class Teacher extends Person{
    private String teacherCycle;
    private int nIF;
    private String qualification;
    private Subject subject;
    private Cycle cycle;

    public Teacher() {
    }

    public Teacher(String teacherCycle, int nIF, String qualification, Subject subject, Cycle cycle, int cID, String name, String addres, String bankDetails, Date bornDate, String phone) {
        super(cID, name, addres, bankDetails, bornDate, phone);
        this.teacherCycle = teacherCycle;
        this.nIF = nIF;
        this.qualification = qualification;
        this.subject = subject;
        this.cycle = cycle;
    }

    public String getTeacherCycle() {
        return teacherCycle;
    }

    public void setTeacherCycle(String teacherCycle) {
        this.teacherCycle = teacherCycle;
    }

    public int getnIF() {
        return nIF;
    }

    public void setnIF(int nIF) {
        this.nIF = nIF;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public Cycle getCycle() {
        return cycle;
    }

    public void setCycle(Cycle cycle) {
        this.cycle = cycle;
    }
    
    
}
