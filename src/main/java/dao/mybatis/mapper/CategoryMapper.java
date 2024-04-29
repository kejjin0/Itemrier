package dao.mybatis.mapper;

import domain.category.Category;
import java.util.List;

public interface CategoryMapper {
	Category getCategory(int catId);
    List<Category> getCategoryList();
    void addCategory(Category category);
    void updateCategory(Category category);
    void deleteCategory(int catId);
}
