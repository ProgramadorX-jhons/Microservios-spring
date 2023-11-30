package com.jhons.miscroservicios1empleado.Service;

import com.jhons.miscroservicios1empleado.Entity.Empleado;

import java.util.List;

public interface ImpleEmpleadoService {

    //aqui solo pones las funiones que realia un sistema crud una clase abstracta
    List<Empleado>listarEmpelado();
    Empleado obtenerPorId(Long id);
    Empleado guardarEmpleado(Empleado empleado);
    void  eliminarEmpleado(Long id);

}
