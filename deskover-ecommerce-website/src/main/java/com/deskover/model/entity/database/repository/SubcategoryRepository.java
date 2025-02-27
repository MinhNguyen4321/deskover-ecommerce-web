package com.deskover.model.entity.database.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.deskover.model.entity.database.Subcategory;

public interface SubcategoryRepository extends JpaRepository<Subcategory, Long> {
	List<Subcategory> findByActivedAndCategoryId(Boolean isActive, Long categoryId);
	List<Subcategory> findByActived(Boolean actived);

	List<Subcategory> findByCategoryId(Long categoryId);
	
	Subcategory findBySlug(String slug);

	Boolean existsBySlug(String slug);
}