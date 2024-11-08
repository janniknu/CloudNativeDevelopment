package com.cnd.collection_service;

import com.cnd.collection_service.domain.models.Collection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CSRepository extends JpaRepository<Collection, Long> {
}