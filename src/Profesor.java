
import java.util.LinkedList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Javier
 * @author Eli LInares
 */
class Profesor {
    
    String strId;
    String strNombre;
    String strApellido;
    Departamento depDepartamento;
    LinkedList<Curso> lklcrsCursos;
    boolean esJefe;
    Departamento depDepartamentoJefe;

    public String getStrId() {
        return strId;
    }

    public void setStrId(String strId) {
        this.strId = strId;
    }

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

    public Departamento getDepDepartamento() {
        return depDepartamento;
    }

    public void setDepDepartamento(Departamento depDepartamento) {
        this.depDepartamento = depDepartamento;
    }

    public LinkedList<Curso> getLklcrsCursos() {
        return lklcrsCursos;
    }

    public void setLklcrsCursos(LinkedList<Curso> lklcrsCursos) {
        this.lklcrsCursos = lklcrsCursos;
    }

    public boolean isEsJefe() {
        return esJefe;
    }

    public void setEsJefe(boolean esJefe) {
        this.esJefe = esJefe;
    }

    public Departamento getDepDepartamentoJefe() {
        return depDepartamentoJefe;
    }

    public void setDepDepartamentoJefe(Departamento depDepartamentoJefe) {
        this.depDepartamentoJefe = depDepartamentoJefe;
    }
    
    public void addCurso (Curso curso) {
        this.lklcrsCursos.addLast(curso);
    }
    
}
