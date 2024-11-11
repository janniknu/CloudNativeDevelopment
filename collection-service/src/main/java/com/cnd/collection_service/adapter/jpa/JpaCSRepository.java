package com.cnd.collection_service.adapter.jpa;

import com.cnd.collection_service.adapter.jpa.entities.CollectionEntity;
import com.cnd.collection_service.domain.models.Collection;
import org.springframework.data.repository.CrudRepository;

import java.util.List;


public interface JpaCSRepository extends CrudRepository<CollectionEntity, Long> {
}