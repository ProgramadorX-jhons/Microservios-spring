package com.jhons.miscroservicios1empleado.Entity;

import jakarta.persistence.*;

import java.util.Date;
@Entity
@Table(name="empleado")
public class Empleado {

    //atributos

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;
    private String nombre;
    @Temporal(TemporalType.DATE)
    private Date fechaNacimiento;
    private Integer horasLaboradas;

    //metodos


    public Empleado() {

    }

    public Empleado(Long codigo, String nombre, Date fechaNacimiento, Integer horasLaboradas) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.horasLaboradas = horasLaboradas;
    }

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

    public Integer getHorasLaboradas() {
        return horasLaboradas;
    }

    public void setHorasLaboradas(Integer horasLaboradas) {
        this.horasLaboradas = horasLaboradas;
    }
}
