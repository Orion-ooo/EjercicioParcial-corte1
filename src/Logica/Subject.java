package Logica;

import java.util.ArrayList;

public class Subject implements InterfaceSubjectManagement{
    private int id;
    private String name;
    private String description;
    private String subject;

    public Subject() {
    }

    public Subject(int id, String name, String description, String subject) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.subject = subject;
    }
    
    //Metodos
    
    @Override public void addSubject(Subject subject){
        
    }
    
    @Override public void removeSubject(Subject subject){
        
    }
    
    @Override public ArrayList<Subject> getAllSubjects(){
        return null; //Por el momento
    }
    
    //Getters y Setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
    
    
}
