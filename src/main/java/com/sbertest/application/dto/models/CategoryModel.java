package com.sbertest.application.dto.models;

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
}
