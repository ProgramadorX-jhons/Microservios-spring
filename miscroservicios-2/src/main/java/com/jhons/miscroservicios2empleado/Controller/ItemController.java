package com.jhons.miscroservicios2empleado.Controller;

import com.jhons.miscroservicios2empleado.Model.Item;
import com.jhons.miscroservicios2empleado.Service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

// Controlador (debería estar en una clase separada)
@RestController
public class ItemController {

    @Autowired
    private ItemService service;

    @GetMapping("/listar")
    public List<Item> listar(){
        return service.listarEnpleado();
    }

    @GetMapping("/ver/{id}/cantidad/{cantidad}")
    public Item detalle(@PathVariable Long id, @PathVariable Integer cantidad) {
        return service.eliminarPorId(id, cantidad);
    }

}
