package com.zosh.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Data;

import java.util.List;

@Data
@Embeddable
//The @Embeddable annotation is used to mark a class as being embeddable, meaning its properties can be included in another class as a value type.
public class RestaurantDto {
    private String title;

    @Column(length = 1000)
    private List<String> images;

    private String description;

    private Long id;
}
