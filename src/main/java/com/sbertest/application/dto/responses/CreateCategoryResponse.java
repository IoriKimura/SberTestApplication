package com.sbertest.application.dto.responses;

import com.sbertest.application.dto.models.CategoryModel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CreateCategoryResponse {

    private CategoryModel categoryModel;
}
