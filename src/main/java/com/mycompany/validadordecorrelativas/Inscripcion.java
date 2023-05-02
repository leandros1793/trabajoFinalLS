/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.validadordecorrelativas;

import java.util.Date;

/**
 *
 * @author leand
 */
public class Inscripcion {
    
    Materia materia;
    
    Alumno alumno;

    Date fecha = new Date();
    Boolean aprobado;

    public Inscripcion() {
    }

    public Inscripcion(Materia materia, Alumno alumno, Boolean aprobado) {
        this.materia = materia;
        this.alumno = alumno;
        this.aprobado = aprobado;
    }

    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    
    public boolean getAprobadp () {
        return aprobado;
    }

    public void setAprobado(Boolean aprobado) {
        this.aprobado = aprobado;
    }
    
    
    

    @Override
    public String toString() {
        return "Inscripcion{" + "materia=" + materia + ", alumno=" + alumno + ", fecha=" + fecha + "aprobado=" + aprobado  + '}' ;
    }
    
    
    
}

