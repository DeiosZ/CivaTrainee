package com.reto.civa.service;

import com.reto.civa.DTO.BusDTO;
import com.reto.civa.entity.Bus;
import com.reto.civa.mapper.BusMapper;
import com.reto.civa.repository.BusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

@Service
public class BusService {
    @Autowired
    private BusRepository repo;

    public Page<BusDTO> listar(int pagina , int longitud){
        Pageable p = PageRequest.of(pagina,longitud, Sort.by("id").ascending());
        return repo.findAll(p).map(BusMapper::toBusDTO);
    }

    public BusDTO busPorId(Long id){
        Bus b  = repo.findById(id).orElseThrow(()->new RuntimeException("Bus no encontrado"));
        return BusMapper.toBusDTO(b);
    }
}
