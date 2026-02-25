package edu.icet.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class MenuItemDto {
    private Integer id;
    private String name;
    private Double price;
    private String availability;
    private Long categoryId;
}
