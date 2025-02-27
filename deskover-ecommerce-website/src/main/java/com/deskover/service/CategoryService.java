package com.deskover.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.jpa.datatables.mapping.DataTablesInput;
import org.springframework.data.jpa.datatables.mapping.DataTablesOutput;

import com.deskover.model.entity.database.Category;

public interface CategoryService {
	// Check if the slug is already in use by another category
	Boolean existsBySlug(String slug);
	
	Boolean existsByOtherSlug(Category category);

	Boolean existsBySlug(Category category);

	List<Category> getByActived(Boolean isActive);

    DataTablesOutput<Category> getAllForDatatables(DataTablesInput input);

    DataTablesOutput<Category> getByActiveForDatatables(DataTablesInput input, Boolean isActive);

    Page<Category> getByActived(Boolean isActive, Integer page, Integer size);

	Category getById(Long id);

	Category create(Category category);

	Category update(Category category);

	void changeActived(Long id);
	
}
