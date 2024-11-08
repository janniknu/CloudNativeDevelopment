package com.cnd.collection_service.domain;

import com.cnd.collection_service.domain.models.Collection;

import java.util.List;

public interface CSService {
    List<Collection> getAllCollections();
    Collection getCollectionById(Long id);
    Collection createCollection(Collection collection);
    Collection updateCollection(Long id, Collection collection);
    void deleteCollection(Long id);
}
