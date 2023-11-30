package com.jhons.miscroservicios2empleado.Model;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

public class Item {

    private Empleado empleado;
    private Date fechaActual;

    public Item() {
    }

    public Item(Empleado empleado, Date fechaActual) {
        this.empleado = empleado;
        this.fechaActual = fechaActual;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public Date getFechaActual() {
        return fechaActual;
    }

    public void setFechaActual(Date fechaActual) {
        this.fechaActual = fechaActual;
    }

    public Double getPagoEmpleado(){
        return getPagoEmpleado().doubleValue()*50;
    }
}
