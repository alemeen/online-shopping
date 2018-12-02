package com.hobab.shoppingbackend.dao;

import java.util.List;

import com.hobab.shoppingbackend.dto.Category;

public interface CategoryDAO {
	
	List<Category> list();
	Category get(int id);

}
