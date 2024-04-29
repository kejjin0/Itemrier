package dao.search;
import java.util.List;
import domain.search.Search;

public interface SearchDao {
	//검색 기록 추가
	void addSearchRecord
		(int userId, String searchWord);
	//최근 기록 불러오기
	List<Search> getRecentSearches(int userId);
	//특정 유저의 검색 기록 불러오기
	List<Search> getSearchHistoryByWord(int userId, String searchWord);
}
