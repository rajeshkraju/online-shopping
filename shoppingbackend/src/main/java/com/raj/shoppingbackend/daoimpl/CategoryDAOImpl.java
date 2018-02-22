 package com.raj.shoppingbackend.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.raj.shoppingbackend.dao.CategoryDAO;
import com.raj.shoppingbackend.dto.Category;

@Repository("categoryDAO")
public class CategoryDAOImpl implements CategoryDAO {

	private static List<Category> categories = new ArrayList<>();

	static {
		// first
		Category category = new Category();
		category.setId(1);
		category.setName("Television");
		category.setDescription("This is some tv description");
		category.setImageURL("CAT_1.png");
		categories.add(category);

		// second
		category = new Category();
		category.setId(2);
		category.setName("Mobile");
		category.setDescription("This is some Mobile");
		category.setImageURL("CAT_1.png");
		categories.add(category);

		// third
		category = new Category();
		category.setId(3);
		category.setName("Laptop");
		category.setDescription("This is some Laptop");
		category.setImageURL("CAT_1.png");
		categories.add(category);
	}

	@Override
	public List<Category> list() {
		// TODO Auto-generated method stub
		return categories;
	}

	@Override
	public Category get(int id) {

		for (Category category : categories) {
			if (category.getId() == id)
				return category;
		}
		return null;
	}

}
