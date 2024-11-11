package com.cnd.collection_service.application;

import com.cnd.collection_service.domain.CSService;
import com.cnd.collection_service.domain.models.Collection;
import com.cnd.collection_service.domain.models.Recipe;
import com.cnd.collection_service.ports.outgoing.CSRepository;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CSServiceImpl implements CSService {

    @Lazy
    private final CSRepository repository;

    public CSServiceImpl(CSRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Collection> getAllCollections() {
        return repository.listAll();
    }

    @Override
    public Collection getCollectionById(Long id) {
        return repository.findById(id);
    }

    @Override
    public Collection createCollection(Collection collection) {
        return null;
    }

    @Override
    public Collection updateCollection(Long id, Collection collection) {
        return null;
    }

    @Override
    public void deleteCollection(Long id) {
    }

    @Override
    public Collection addRecipe(Long collectionId, Recipe recipe) {
        return null;
    }

    @Override
    public Collection removeRecipe(Long collectionId, Recipe recipe) {
        return null;
    }

}
