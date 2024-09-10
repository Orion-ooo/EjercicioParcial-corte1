
package Logica;

import java.util.ArrayList;

public class Cycle implements InterfaceCycleManagement{
    private String name;
    private String description;
    private ArrayList<Course> course;

    public Cycle() {
    }

    public Cycle(String name, String description, ArrayList<Course> course) {
        this.name = name;
        this.description = description;
        this.course = course;
    }
    
    //Metodos de Override
    
    @Override
    
    public void addCourse(Course course){
        
    }
    
    @Override
    
    public void removeCourse(Course course){
        
    }
    
    @Override
    public ArrayList<Course> getCourses(){
        return this.course;
    }
    
    //Getters y Setters

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

    public ArrayList<Course> getCourse() {
        return course;
    }

    public void setCourse(ArrayList<Course> course) {
        this.course = course;
    }
    
}
