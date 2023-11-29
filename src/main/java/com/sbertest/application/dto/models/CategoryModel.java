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


    private String categoryName;

    public static CategoryModel fromEntity(CategoryEntity category){
        return CategoryModel.builder()
                .categoryName(category.getCategoryName())
                .build();
    }
}
