package Logica;

import java.util.ArrayList;

public class Course implements InterfaceCourseManagement {

    private String level;
    private int enrolledStudents;
    private String group;
    private ArrayList<Subject> subjects;
    private ArrayList<Student> numStudents;

    public Course() {
    }

    public Course(String level, int enrolledStudents, String group, ArrayList<Subject> subjects, ArrayList<Student> numStudents) {
        this.level = level;
        this.enrolledStudents = enrolledStudents;
        this.group = group;
        this.subjects = subjects;
        this.numStudents = numStudents;
    }
    
    //Metodos de Override

    @Override

    public void addStudent(Student student) {
        
    }

    @Override

    public void deleteStudent(Student student) {

    }

    @Override

    public void addSubject(Subject subject) {

    }

    @Override

    public void deleteSubject(Subject subject) {

    }

    @Override

    public int getTotalEnrolledStudents() {
        return this.enrolledStudents;

    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public int getEnrolledStudents() {
        return enrolledStudents;
    }

    public void setEnrolledStudents(int enrolledStudents) {
        this.enrolledStudents = enrolledStudents;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public ArrayList<Subject> getSubjects() {
        return subjects;
    }

    public void setSubjects(ArrayList<Subject> subjects) {
        this.subjects = subjects;
    }

    public ArrayList<Student> getNumStudents() {
        return numStudents;
    }

    public void setNumStudents(ArrayList<Student> numStudents) {
        this.numStudents = numStudents;
    }

    @Override
    public String toString() {
        return "Course{" + "level=" + level + ", enrolledStudents=" + enrolledStudents + ", group=" + group + ", subjects=" + subjects + ", numStudents=" + numStudents + '}';
    }

}
