package com.cnd.collection_service.adapter.api;


import com.cnd.collection_service.domain.CSService;
import com.cnd.collection_service.domain.models.Collection;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/collections")
public class CSController {

    private final CSService csService;

    public CSController(CSService csService) {
        this.csService = csService;
    }

    @GetMapping
    public List<Collection> getAllCollections() {
        return csService.getAllCollections();
    }

    @GetMapping("/{id}")
    public Collection getCollectionById(@PathVariable Long id) {
        return csService.getCollectionById(id);
    }

    @PostMapping
    public Collection createCollection(@RequestBody Collection collection) {
        return csService.createCollection(collection);
    }

    @PutMapping("/{id}")
    public Collection updateCollection(@PathVariable Long id, @RequestBody Collection collection) {
        return csService.updateCollection(id, collection);
    }

    @DeleteMapping("/{id}")
    public void deleteCollection(@PathVariable Long id) {
        csService.deleteCollection(id);
    }
}