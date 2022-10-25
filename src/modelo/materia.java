/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author estudiante
 */
public class materia 
{
    private String codigo, nombre, creditos, codProfesor;

    public materia() {
    }

    public materia(String codigo, String nombre, String creditos, String codProfesor) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.creditos = creditos;
        this.codProfesor = codProfesor;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCreditos() {
        return creditos;
    }

    public void setCreditos(String creditos) {
        this.creditos = creditos;
    }

    public String getCodProfesor() {
        return codProfesor;
    }

    public void setCodProfesor(String codProfesor) {
        this.codProfesor = codProfesor;
    }

    @Override
    public String toString() {
        return "materia{" + "codigo=" + codigo + ", nombre=" + nombre + ", creditos=" + creditos + ", codProfesor=" + codProfesor + '}';
    }
    
    
}
