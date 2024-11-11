package com.cnd.collection_service.ports.outgoing;

import com.cnd.collection_service.domain.models.Collection;

import java.util.List;

public interface CSRepository {
    void save(Collection collection);
    List<Collection> listAll();
    Collection findById(Long id);
    void delete(Collection collection);
}
