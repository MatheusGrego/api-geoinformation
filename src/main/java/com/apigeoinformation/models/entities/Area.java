package com.apigeoinformation.models.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;
import java.util.UUID;

@Data
@Entity
public class Area {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @ElementCollection
    @CollectionTable(name = "area_coordinates")
    private List<Coordinate> coordinates;

    private Double area;
    private Double perimeter;



}
