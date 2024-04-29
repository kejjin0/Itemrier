package dao.mybatis.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import org.apache.ibatis.annotations.Param;

import domain.search.Search;
import java.util.List;
import java.util.Map;

public interface SearchMapper {
	@Insert("INSERT INTO Search (userId, searchWord) VALUES (#{userId}, #{searchWord})")
    void addSearchRecord(@Param("userId") int userId, @Param("searchWord") String searchWord);
	
	@Select("SELECT * FROM Search WHERE userId = #{userId}")
    List<Search> getRecentSearches(int userId);
	
	@Select("SELECT * FROM Search WHERE userId = #{userId} AND searchWord = #{searchWord}")
    List<Search> getSearchHistoryByWord(Map<String, Object> params);

	List<Search> getSearchHistoryByWord(int userId, String searchWord);

}
