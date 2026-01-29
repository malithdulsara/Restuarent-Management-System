package edu.icet.service.impl;

import edu.icet.dto.CategoryDto;
import edu.icet.entity.CategoryEntity;
import edu.icet.repository.CategoryRepository;
import edu.icet.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor

public class CategoryServiceImpl implements CategoryService {
    private final CategoryRepository categoryRepository;
    private final ModelMapper modelMapper;

    @Override
    public CategoryDto save(CategoryDto categoryDTO) {
        CategoryEntity categoryEntity = modelMapper.map(categoryDTO, CategoryEntity.class);
        CategoryEntity savedEntity = categoryRepository.save(categoryEntity);
        return modelMapper.map(savedEntity, CategoryDto.class);
    }

    @Override
    public CategoryDto update(CategoryDto categoryDTO) {
        CategoryEntity categoryEntity = modelMapper.map(categoryDTO, CategoryEntity.class);
        CategoryEntity updatedEntity = categoryRepository.save(categoryEntity);
        return modelMapper.map(updatedEntity, CategoryDto.class);
    }

    @Override
    public void delete(Long id) {
        if (!categoryRepository.existsById(Math.toIntExact(id))) {
            throw new RuntimeException("Category not found with id: " + id);
        }
        categoryRepository.deleteById(Math.toIntExact(id));

    }

    @Override
    public List<CategoryDto> getAll() {
        List<CategoryEntity> categoryEntities = categoryRepository.findAll();
        return categoryEntities.stream()
                .map(entity -> modelMapper.map(entity, CategoryDto.class))
                .toList();
     }
}
