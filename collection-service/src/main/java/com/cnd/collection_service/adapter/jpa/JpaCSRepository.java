package com.cnd.collection_service.adapter.jpa;

import com.cnd.collection_service.adapter.jpa.entities.CollectionEntity;
import org.springframework.data.repository.CrudRepository;



public interface JpaCSRepository extends CrudRepository<CollectionEntity, Long> {
}