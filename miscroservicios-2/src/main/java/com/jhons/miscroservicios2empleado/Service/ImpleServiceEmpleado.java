package com.jhons.miscroservicios2empleado.Service;
import com.jhons.miscroservicios2empleado.Model.Empleado;
import com.jhons.miscroservicios2empleado.Model.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.*;
import java.util.stream.Collectors;
@Service
public class ImpleServiceEmpleado implements ItemService{

    @Autowired
    //esto es propio de sping boot para poder conectar a un sevicio aparte
    private RestTemplate clienteRest;

    @Override
    public List<Item> listarEnpleado() {
        //boya obtener y coloca la ruta de donde esta otro servicio
        List<Empleado> empleados =Arrays.asList(clienteRest.getForObject("http://localhost:8080/empleado", Empleado[].class));
        //informacion que se obtenga
        return empleados.stream().map(p -> new Item(p, new Date())).collect(Collectors.toList());
    }

    @Override
    public Item eliminarPorId(Long id, Integer horasLaboradas) {
       return null;

       // Map<String,String> pathVariables = new HashMap<>();
       // pathVariables.put("id", id.toString());
       // Empleado empleado=clienteRest.getForObject("http://localhost:8080/listar/{id}", Empleado.class, pathVariables);
       // return new Item(empleado,20);

    }






}
