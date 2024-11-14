package com.cnd.collection_service.adapter.jpa;

import com.cnd.collection_service.adapter.jpa.entities.CollectionEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface JpaCSRepository extends CrudRepository<CollectionEntity, Long> {
}