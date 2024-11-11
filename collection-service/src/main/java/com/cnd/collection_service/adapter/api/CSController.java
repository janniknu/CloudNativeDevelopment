package com.cnd.collection_service.adapter.api;


import com.cnd.collection_service.domain.CSService;
import com.cnd.collection_service.domain.models.Collection;
import com.cnd.collection_service.domain.models.Recipe;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RequestMapping("/collections")
@RestController
public class CSController {

    private final CSService csService;

    public CSController(CSService csService) {
        this.csService = csService;
    }

    @GetMapping
    public ResponseEntity<List<Collection>> getAllCollections() {
        return new ResponseEntity<>(csService.getAllCollections(), HttpStatus.OK);
    }

    /*
    @GetMapping("/{id}")
    public ResponseEntity<Collection> getCollectionById(@PathVariable Long id) {
        System.out.println(id);
        return new ResponseEntity<>(csService.getCollectionById(id), HttpStatus.OK);
    }

    @PostMapping
    public Collection createCollection(@RequestBody Collection collection) {
        System.out.println(collection);
        return csService.createCollection(collection);
    }

    @PutMapping("/{id}")
    public Collection updateCollection(@PathVariable Long id, @RequestBody Collection collection) {
        System.out.println("ID: " + id + ", Collection: " + collection);
        return csService.updateCollection(id, collection);
    }

    @DeleteMapping("/{id}")
    public void deleteCollection(@PathVariable Long id) {
        System.out.println("ID: " + id);
        csService.deleteCollection(id);
    }
    @PostMapping("/{id}/recipe")
    public Collection addRecipe(@PathVariable Long id, @RequestBody Recipe recipe) {
        return csService.addRecipe(id, recipe);
    }

    @DeleteMapping("/{id}/recipe")
    public Collection removeRecipe(@PathVariable Long id, @RequestBody Recipe recipe) {
        return csService.removeRecipe(id, recipe);
    }
    /*
     */
}