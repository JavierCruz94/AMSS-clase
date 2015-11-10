
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
class Estudiante {
    
    String strNombre;
    String strApellido;
    String strMatricula;
    int intSemestre;
    Escuela escEscuela;
    LinkedList <Curso> lklcrsCursos;

    public String getStrNombre() {
        return strNombre;
    }

    public void setStrNombre(String strNombre) {
        this.strNombre = strNombre;
    }

    public String getStrApellido() {
        return strApellido;
    }

    public void setStrApellido(String strApellido) {
        this.strApellido = strApellido;
    }

    public String getStrMatricula() {
        return strMatricula;
    }

    public void setStrMatricula(String strMatricula) {
        this.strMatricula = strMatricula;
    }

    public int getIntSemestre() {
        return intSemestre;
    }

    public void setIntSemestre(int intSemestre) {
        this.intSemestre = intSemestre;
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
    
    public void addCurso (Curso curso) {
        this.lklcrsCursos.addLast(curso);
    }
    
    
}
