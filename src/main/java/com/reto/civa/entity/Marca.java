package com.reto.civa.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name="marca")
@Builder

public class Marca {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false , unique = true , length = 100)
    private String nombre;

    @OneToMany(mappedBy = "marca")
    private List<Bus> buses  = new ArrayList<>();


}
