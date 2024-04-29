package dao.mybatis.category;

import dao.category.CategoryDao;
import dao.mybatis.mapper.CategoryMapper;
import domain.category.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class MybatisCategoryDao implements CategoryDao {

    @Autowired
    private CategoryMapper categoryMapper;

    @Override
    public Category getCategory(int catId) {
        return categoryMapper.getCategory(catId);
    }

    @Override
    public List<Category> getCategoryList() {
        return categoryMapper.getCategoryList();
    }

    @Override
    public void addCategory(Category category) {
        categoryMapper.addCategory(category);
    }

    @Override
    public void updateCategory(Category category) {
        categoryMapper.updateCategory(category);
    }

    @Override
    public void deleteCategory(int catId) {
        categoryMapper.deleteCategory(catId);
    }

}
