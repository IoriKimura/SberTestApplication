package com.sbertest.application.repositories;

import com.sbertest.application.entities.CategoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface CategoryRepo extends JpaRepository<CategoryEntity, UUID> {
}
