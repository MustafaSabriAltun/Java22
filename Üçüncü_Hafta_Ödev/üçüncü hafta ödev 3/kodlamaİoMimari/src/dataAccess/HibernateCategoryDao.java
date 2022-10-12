package dataAccess;

import entities.Category;

public class HibernateCategoryDao implements CategoryDao{
	public void add (Category category) {
		System.out.println("Kategori Hibernate eklendi" + category.getCategoryName() );
	};
}
