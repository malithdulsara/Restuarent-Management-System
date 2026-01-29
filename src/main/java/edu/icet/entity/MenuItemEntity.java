package edu.icet.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "menu_item")
public class MenuItemEntity {
    @Id
    private Integer id;
    private String name;
    private Double price;
    private String availability;
    private Long categoryId;
    private String imageUrl;
}
