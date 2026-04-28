package com.reto.civa.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name="buses")
@Builder

public class Bus {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false , unique=true , length = 20)
    private String numeroBus;
    @Column(nullable = false , unique = true , length = 20)
    private String placa;
    @Column(nullable = false,updatable = false)
    private LocalDateTime fechaCreacion;
    @PrePersist
    public void generarFecha() {
        this.fechaCreacion = LocalDateTime.now();
    }
    @Column(length = 200)
    private String caracteristicas;
    @Column(nullable = false)
    private Boolean activo;
    @ManyToOne
    @JoinColumn(name = "marcaId",nullable = false)
    private Marca marca;
}
