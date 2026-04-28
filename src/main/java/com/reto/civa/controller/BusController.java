package com.reto.civa.controller;


import com.reto.civa.DTO.BusDTO;
import com.reto.civa.service.BusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/bus")
public class BusController {
    @Autowired
    private BusService service;

    @GetMapping
    public Page<BusDTO> listar(@RequestParam(defaultValue = "0") int pagina , @RequestParam(defaultValue = "5") int longitud){
        return service.listar(pagina,longitud);
    }

    @GetMapping("/{id}")
    public BusDTO busPorId(@PathVariable Long id){
        return service.busPorId(id);
    }
}
