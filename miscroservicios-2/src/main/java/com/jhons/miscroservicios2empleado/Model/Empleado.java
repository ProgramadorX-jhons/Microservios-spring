package com.jhons.miscroservicios2empleado.Model;

import java.util.Date;

public class Empleado {

    private Long codigo;
    private String nombre;
    private Date fechaNacimiento;
    private int horasLaboradas;

    public Empleado(Date fechaNacimiento, Integer horasLaboradas) {
    }


    //solo geneamos los get y set


    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getHorasLaboradas() {
        return horasLaboradas;
    }

    public void setHorasLaboradas(int horasLaboradas) {
        this.horasLaboradas = horasLaboradas;
    }
}
