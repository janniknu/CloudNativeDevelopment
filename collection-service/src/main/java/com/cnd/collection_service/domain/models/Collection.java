package com.cnd.collection_service.domain.models;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

//lombok muss am Ende noch entfernt werden, damit model so basic wie möglich ist

@Data
@AllArgsConstructor
public class Collection {

    private Long id;
    private String name;
    private User author;
    private String description;
    private List<Recipe> recipes;
}