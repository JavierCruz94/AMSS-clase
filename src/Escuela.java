
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
    
    String nombre;
    String city;
    String direccion;
    String telefono;
    LinkedList<Departamento> departamentos;
    LinkedList<Estudiante> estudiantes;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public LinkedList<Departamento> getDepartamentos() {
        return departamentos;
    }

    public void setDepartamentos(LinkedList<Departamento> departamentos) {
        this.departamentos = departamentos;
    }
    
    public void addDepartamento(Departamento departamento) {        
        this.departamentos.addLast(departamento);
    }

    public LinkedList<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(LinkedList<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }

    public void addEstudiante(Estudiante estudiante) {
        this.estudiantes.addFirst(estudiante);
    }
}
