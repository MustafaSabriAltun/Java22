package business;

import java.util.ArrayList;
import java.util.List;

import core.Logger;
import dataAccess.CategoryDao;
import entities.Category;


public class CategoryManager {
	private CategoryDao categoryDao;
	private Logger [] loggers;
	
	
	public CategoryManager(CategoryDao categoryDao, Logger[] loggers) {
		super();
		this.categoryDao = categoryDao;
		this.loggers = loggers;
	}
			
	List<Category> categories = new ArrayList<Category>();
	public void add(Category category) throws Exception {
		for (Category category1:categories) {
			if(category1.getCategoryName()==category.getCategoryName()) {
				throw new Exception("Kategori isimleri aynı. Lütfen değiştirin.");
			}
				
			}
			
			categoryDao.add(category);
			
			for (Logger logger : loggers) {// [db, mail]
				logger.log(category.getCategoryName());
			}
}	
}
