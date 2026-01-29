package edu.icet.service;

import edu.icet.dto.CategoryDto;

import java.util.List;

public interface CategoryService {
    CategoryDto save(CategoryDto categoryDTO);
    CategoryDto update(CategoryDto categoryDTO);
    void delete(Long id);
    List<CategoryDto> getAll();
}
