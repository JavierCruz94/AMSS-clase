
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
class Departamento {
    
    String strNombre;
    Escuela escEscuela;
    LinkedList<Curso> lklcrsCursos;
    Profesor profJefe;
    LinkedList<Profesor> lklprofProfesores;

    public String getStrNombre() {
        return strNombre;
    }

    public void setStrNombre(String strNombre) {
        this.strNombre = strNombre;
    }

    public Escuela getEscEscuela() {
        return escEscuela;
    }

    public void setEscEscuela(Escuela escEscuela) {
        this.escEscuela = escEscuela;
    }

    public LinkedList<Curso> getLklcrsCursos() {
        return lklcrsCursos;
    }

    public void setLklcrsCursos(LinkedList<Curso> lklcrsCursos) {
        this.lklcrsCursos = lklcrsCursos;
    }

    public Profesor getProfJefe() {
        return profJefe;
    }

    public void setProfJefe(Profesor profJefe) {
        this.profJefe = profJefe;
    }

    public LinkedList<Profesor> getLklprofProfesores() {
        return lklprofProfesores;
    }

    public void setLklprofProfesores(LinkedList<Profesor> lklprofProfesores) {
        this.lklprofProfesores = lklprofProfesores;
    }
    
    public void addCurso (Curso curso) {
        this.lklcrsCursos.addLast(curso);
    }
    
    public void addProfesor (Profesor profesor) {
        this.lklprofProfesores.addLast(profesor);
    }
    
}
