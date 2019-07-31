package jar.blog.tech.service;

import java.util.List;

import jar.blog.tech.model.TblCategories;

public interface CategoriesService {
	List<TblCategories> findAllCategories();
	
	TblCategories findCategoryById( Integer id );
}
