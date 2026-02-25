package edu.icet.service.impl;

import edu.icet.dto.MenuItemDto;
import edu.icet.entity.MenuItemEntity;
import edu.icet.repository.MenuItemRepository;
import edu.icet.service.MenuItemService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MenuItemServiceImpl implements MenuItemService {
    private final MenuItemRepository menuItemRepository;
    private final ModelMapper modelMapper;

    @Override
    public void save(MenuItemDto menuItemDto) {
        MenuItemEntity menuItemEntity = modelMapper.map(menuItemDto, MenuItemEntity.class);
        menuItemRepository.save(menuItemEntity);
    }

    @Override
    public List<MenuItemDto> getAllMenuItems() {
        List<MenuItemEntity> menuItemEntities = menuItemRepository.findAll();
        return menuItemEntities.stream()
                .map(entity -> modelMapper.map(entity, MenuItemDto.class))
                .toList();
    }

    @Override
    public MenuItemDto getMenuItemById(Integer id) {
        MenuItemEntity menuItemEntity = menuItemRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Menu item not found with id: " + id));
        return modelMapper.map(menuItemEntity, MenuItemDto.class);
    }

    @Override
    public void update(MenuItemDto menuItemDto) {
        MenuItemEntity menuItemEntity = modelMapper.map(menuItemDto, MenuItemEntity.class);
        menuItemRepository.save(menuItemEntity);
    }

    @Override
    public void delete(Integer id) {
        MenuItemEntity menuItemEntity = menuItemRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Menu item not found with id: " + id));
        menuItemRepository.delete(menuItemEntity);
    }
}
