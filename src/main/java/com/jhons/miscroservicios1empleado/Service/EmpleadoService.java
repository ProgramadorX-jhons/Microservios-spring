package com.jhons.miscroservicios1empleado.Service;



import com.jhons.miscroservicios1empleado.Entity.Empleado;
import com.jhons.miscroservicios1empleado.Repository.EmpleadoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmpleadoService implements ImpleEmpleadoService{

    @Autowired
    private EmpleadoRepo repository;

    @Override
    public List<Empleado> listarEmpelado() {
        return repository.findAll();
    }

    @Override
    public Empleado obtenerPorId(Long id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public Empleado guardarEmpleado(Empleado empleado) {
       return repository.save(empleado);

    }

    @Override
    public void eliminarEmpleado(Long id) {
        repository.deleteById(id);
    }
}
