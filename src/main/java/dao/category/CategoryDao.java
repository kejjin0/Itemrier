package dao.category;
import java.util.List;
import domain.category.Category;

public interface CategoryDao {
	//카테고리 추가
	void addCategory(Category category);
	
	//카테고리 불러오기
    Category getCategory(int catId);
    
    //카테고리 리스트
    List<Category> getCategoryList();
    
    //카테고리 업데이트
    void updateCategory(Category category);
    
    //삭제
    void deleteCategory(int catId);
}
