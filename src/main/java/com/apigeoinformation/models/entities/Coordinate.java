package com.apigeoinformation.models.entities;

import jakarta.persistence.Embeddable;

@Embeddable
public class Coordinate {
    Double latitude;
    Double longitude;
}
