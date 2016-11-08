package dailyWork1;

import java.util.ArrayList;


public class BookService {

	private BookDAO dao;
	
	
	public BookService(){
	
	}

	public BookService(BookDAO dao){
		this.dao = dao;
	}
	
	public BookDAO getDao() {
		return dao;
	}	

	public void setDao(BookDAO dao) {
		this.dao = dao;
	}
	
	
	public ArrayList<ArrayList<BookEntity>> getListByKeyword(String keyword){
	
		return dao.selectAll(keyword);
	}
}
