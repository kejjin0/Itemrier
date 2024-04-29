package dao.mybatis.search;

import dao.search.SearchDao;
import domain.search.Search;
import dao.mybatis.mapper.SearchMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class MybatisSearchDao implements SearchDao {
	@Autowired
	private SearchMapper searchMapper;

    @Override
    public void addSearchRecord(int userId, String searchWord) {
    	searchMapper.addSearchRecord(userId, searchWord);
    }


    @Override
    public List<Search> getRecentSearches(int userId) {
        return searchMapper.getRecentSearches(userId);
    }

    @Override
    public List<Search> getSearchHistoryByWord(int userId, String searchWord) {
        return searchMapper.getSearchHistoryByWord(userId, searchWord);
    }

}