package com.raj.shoppingbackend.dao;

import java.util.List;

import com.raj.shoppingbackend.dto.Category;

public interface CategoryDAO {

	List<Category> list();

	Category get(int id);
}
