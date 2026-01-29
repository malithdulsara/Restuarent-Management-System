package edu.icet.service;

import edu.icet.dto.MenuItemDto;

import java.util.List;

public interface MenuItemService {
    void save(MenuItemDto menuItemDto);
    List<MenuItemDto> getAllMenuItems();
    MenuItemDto getMenuItemById(Integer id);
    void update(MenuItemDto menuItemDto);
    void delete(Integer id);
}

