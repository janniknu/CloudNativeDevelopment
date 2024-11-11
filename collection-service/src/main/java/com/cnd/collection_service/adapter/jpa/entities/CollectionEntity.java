package com.cnd.collection_service.adapter.jpa.entities;

import com.cnd.collection_service.domain.models.Recipe;
import com.cnd.collection_service.domain.models.User;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Data
@AllArgsConstructor
@Table(name = "collections")
@NoArgsConstructor
public class CollectionEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    @ManyToOne
    @JoinColumn(name = "author_id", nullable = false)
    private User author;
    private String description;
    @ManyToMany
    @JoinTable(
            name = "collection_recipes",
            joinColumns = @JoinColumn(name = "collection_id"),
            inverseJoinColumns = @JoinColumn(name = "recipe_id")
    )
    private List<Recipe> recipes;

    public void addRecipe(Recipe recipe) {
        this.recipes.add(recipe);
    }

    public void removeRecipe(Recipe recipe) {
        this.recipes.remove(recipe);
    }
}