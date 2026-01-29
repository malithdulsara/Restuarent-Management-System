package edu.icet.controller;

import edu.icet.dto.CategoryDto;
import edu.icet.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api/v1/categories")
@RequiredArgsConstructor
@CrossOrigin
@RestController
public class CategoryController {

    private final CategoryService categoryService;

    @GetMapping("/all")
    public String getCategories() {
        List<CategoryDto>list = categoryService.getAll();
        return list.toString();
    }
    @PutMapping("/update")
    public CategoryDto updateCategory(@RequestBody CategoryDto categoryDTO) {
        return categoryService.update(categoryDTO);

    }
    @PostMapping("/add")
    public CategoryDto addCategory(@RequestBody CategoryDto categoryDTO) {
        return categoryService.save(categoryDTO);
    }
    @DeleteMapping("/delete/{id}")
    public void deleteCategory(@PathVariable Long id) {
        categoryService.delete(id);
    }
}
