
import java.util.LinkedList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Javi Cruz
 *@author Eli LInares
 */
public class Escuela {
    
    String strNombre;
    String strCity;
    String strDireccion;
    String strTelefono;
    LinkedList<Departamento> lkldepDepartamentos;
    LinkedList<Estudiante> lklestEstudiantes;

    public String getStrNombre() {
        return strNombre;
    }

    public void setStrNombre(String strNombre) {
        this.strNombre = strNombre;
    }

    public String getStrCity() {
        return strCity;
    }

    public void setStrCity(String strCity) {
        this.strCity = strCity;
    }

    public String getStrDireccion() {
        return strDireccion;
    }

    public void setStrDireccion(String strDireccion) {
        this.strDireccion = strDireccion;
    }

    public String getStrTelefono() {
        return strTelefono;
    }

    public void setStrTelefono(String strTelefono) {
        this.strTelefono = strTelefono;
    }

    public LinkedList<Departamento> getLkldepDepartamentos() {
        return lkldepDepartamentos;
    }

    public void setLkldepDepartamentos(LinkedList<Departamento> lkldepDepartamentos) {
        this.lkldepDepartamentos = lkldepDepartamentos;
    }

    public LinkedList<Estudiante> getLklestEstudiantes() {
        return lklestEstudiantes;
    }

    public void setLklestEstudiantes(LinkedList<Estudiante> lklestEstudiantes) {
        this.lklestEstudiantes = lklestEstudiantes;
    }

    public void addEstudiante (Estudiante estudiante) {
        this.lklestEstudiantes.addLast(estudiante);
    }
    
    public void addDepartamento (Departamento departamento) {
        this.lkldepDepartamentos.addLast(departamento);
    }
}
