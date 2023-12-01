package com.sbertest.application.entities;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;
import org.hibernate.annotations.UuidGenerator;

import java.util.UUID;
/**Класс, описывающий сущность Категория*/
@Entity
@Table(name = "category")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CategoryEntity {

    /**Поле идентификатор*/
    @Id
    @UuidGenerator
    private UUID id;

    /**Поле имя категории*/
    @Column(name = "category_name")
    private String categoryName;

}
