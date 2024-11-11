package com.cnd.collection_service.adapter.jpa;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cnd.collection_service.domain.models.Collection;
import com.cnd.collection_service.ports.outgoing.CSRepository;

@Service
public class JpaCSRepositoryImpl implements CSRepository {

    @Autowired
    JpaCSRepository repo;


    @Override
    public void save(Collection collection) {
    }

    @Override
    public List<Collection> listAll() {
        return null;
    }

    @Override
    public Collection findById(Long id) {
        return null;
    }

    @Override
    public void delete(Collection collection) {

    }


}

