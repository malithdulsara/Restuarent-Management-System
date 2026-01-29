package edu.icet.controller;

import edu.icet.dto.MenuItemDto;
import edu.icet.service.MenuItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/api/v1/categories")
@RequiredArgsConstructor
@CrossOrigin
@RestController
public class MenuItemController {
    private final MenuItemService menuItemService;
    @GetMapping("/all")
    public String getMenuItems() {
        return menuItemService.getAllMenuItems().toString();
    }
    @DeleteMapping("/delete")
    public void addMenuItem(@RequestBody Integer id) {
        menuItemService.delete(id);
    }
    @PostMapping("/add")
    public void addMenuItem(@RequestBody MenuItemDto menuItemDto) {
        menuItemService.save(menuItemDto);
    }
    @PutMapping("/update")
    public void updateMenuItem(@RequestBody MenuItemDto menuItemDto) {
        menuItemService.update(menuItemDto);
    }

}
