
import java.util.LinkedList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Javi Cruz
 * @author Eli Linares
 */
class Curso {
    
    String strNombre;
    String strClave;
    LinkedList<Estudiante> lklestEstudiantes;
    Departamento departamento;
    LinkedList<Profesor> lklprofProfesores;

    public String getStrNombre() {
        return strNombre;
    }

    public void setStrNombre(String strNombre) {
        this.strNombre = strNombre;
    }

    public String getStrClave() {
        return strClave;
    }

    public void setStrClave(String strClave) {
        this.strClave = strClave;
    }

    public LinkedList<Estudiante> getLklestEstudiantes() {
        return lklestEstudiantes;
    }

    public void setLklestEstudiantes(LinkedList<Estudiante> lklestEstudiantes) {
        this.lklestEstudiantes = lklestEstudiantes;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public LinkedList<Profesor> getLklprofProfesores() {
        return lklprofProfesores;
    }

    public void setLklprofProfesores(LinkedList<Profesor> lklprofProfesores) {
        this.lklprofProfesores = lklprofProfesores;
    }
    
    public void addEstudiante (Estudiante estudiante) {
        this.lklestEstudiantes.addLast(estudiante);
    }
    
    public void addProfesor (Profesor profesor) {
        this.lklprofProfesores.addLast(profesor);
    }
    
}
