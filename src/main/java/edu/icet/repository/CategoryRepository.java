package edu.icet.repository;

import edu.icet.dto.CategoryDto;
import edu.icet.entity.CategoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<CategoryEntity,Integer> {

}
