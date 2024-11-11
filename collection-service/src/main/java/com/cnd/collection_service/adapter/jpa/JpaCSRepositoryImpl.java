package com.cnd.collection_service.adapter.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cnd.collection_service.ports.outgoing.CSRepository;

@Service
public class JpaCSRepositoryImpl implements CSRepository {

    private final JpaCSRepository repo;

    @Autowired
    public JpaCSRepositoryImpl(JpaCSRepository repo) {
        this.repo = repo;
    }

}

