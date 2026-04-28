package com.reto.civa.mapper;

import com.reto.civa.DTO.BusDTO;
import com.reto.civa.entity.Bus;

public class BusMapper {
    public static BusDTO toBusDTO(Bus bus) {

        return BusDTO.builder()
                .id(bus.getId())
                .numeroBus(bus.getNumeroBus())
                .placa(bus.getPlaca())
                .fechaCreacion(bus.getFechaCreacion())
                .caracteristicas(bus.getCaracteristicas())
                .marca(bus.getMarca() !=null ? bus.getMarca().getNombre(): null)
                .activo(bus.getActivo())
                .build();
    }
}
