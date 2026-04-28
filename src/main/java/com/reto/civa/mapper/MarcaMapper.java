package com.reto.civa.mapper;

import com.reto.civa.DTO.MarcaDTO;
import com.reto.civa.entity.Marca;

public class MarcaMapper {
    public static MarcaDTO toMarcaDTO(Marca marca){
        return MarcaDTO.builder()
                .id(marca.getId())
                .nombre(marca.getNombre())
                .build();
    }
}
