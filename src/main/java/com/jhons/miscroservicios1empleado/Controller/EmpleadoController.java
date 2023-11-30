package com.jhons.miscroservicios1empleado.Controller;

import com.jhons.miscroservicios1empleado.Entity.Empleado;
import com.jhons.miscroservicios1empleado.Service.EmpleadoService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/empleado")
public class EmpleadoController {

    @Autowired
    private EmpleadoService  service;

    @GetMapping("")
    public List<Empleado> obtenerTodos(){
        return service.listarEmpelado();
    }

    @GetMapping("/{id}")
    public Empleado obtenerPorId(Long id){
        return null;
    }

    @PostMapping
    public Empleado guardarEmpelado(@RequestBody Empleado empleado){
      return   service.guardarEmpleado(empleado);
    }

    @DeleteMapping("/{id}")
    public void eliminarEmpleado(@PathVariable Long id){
        service.eliminarEmpleado(id);
    }



}
