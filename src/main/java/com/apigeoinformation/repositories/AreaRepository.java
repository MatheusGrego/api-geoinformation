package com.apigeoinformation.repositories;

import com.apigeoinformation.models.entities.Area;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface AreaRepository extends JpaRepository<Area, UUID> {
}
