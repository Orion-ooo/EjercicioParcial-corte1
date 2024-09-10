
package Logica;

public interface InterfaceCourseManagement {
    
    //Interfaz para gestionar los cursos. Añadir y eliminar estudiantes y asignaturas
    
    public void addStudent(Student student);
    public void deleteStudent(Student student);
    public void addSubject(Subject subject);
    public void deleteSubject(Subject subject);
    public int getTotalEnrolledStudents();
}
