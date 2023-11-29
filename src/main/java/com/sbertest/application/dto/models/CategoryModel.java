package com.sbertest.application.dto.models;

import com.sbertest.application.entities.CategoryEntity;
import lombok.*;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class CategoryModel {

    private UUID categoryId;

    private String categoryName;

    public static CategoryModel fromEntity(CategoryEntity category){
        return CategoryModel.builder()
                .categoryId(category.getId())
                .categoryName(category.getCategoryName())
                .build();
    }
}
