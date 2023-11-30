package com.jhons.miscroservicios1empleado.Repository;

import com.jhons.miscroservicios1empleado.Entity.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpleadoRepo extends JpaRepository<Empleado, Long > {

    //esta clase es abtracta de donde se llama todas las funcioes  buscar eliminar y actualizar
}
