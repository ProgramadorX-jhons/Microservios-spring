package com.jhons.miscroservicios2empleado.Service;

import com.jhons.miscroservicios2empleado.Model.Item;

import java.util.List;

public interface ItemService {

    public List<Item>listarEnpleado();
    public Item eliminarPorId(Long id,Integer horasLaboradas);
}
