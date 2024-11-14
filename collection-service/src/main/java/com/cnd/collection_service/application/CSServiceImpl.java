package com.cnd.collection_service.application;

import com.cnd.collection_service.domain.CSService;
import com.cnd.collection_service.domain.models.Collection;
import com.cnd.collection_service.domain.models.Recipe;
import com.cnd.collection_service.ports.outgoing.CSRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CSServiceImpl implements CSService {

    private final CSRepository repository;

    public CSServiceImpl(CSRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Collection> getAllCollections() {
        System.out.println(repository);
        return List.of();
    }
}
