package exam_01_composition;

import java.util.ArrayList;

public class BookService {

	
	// Business Logic을 처리하는 method
	public ArrayList<BookEntity> getListByKeyword(String keyword) {
		
		//로직처리 나와요!!
		//객체가 다른 객체를 사용할 때 있어서의 관계
		//서비스 객체가 자신의 method내에서 다른 객체(DAO)를 생성해서 사용.
		//composition관계에 있다고 얘기를 함
		//두개의 객체가 강하게 결합할 수밖에 없어요 (tightly coupled)
		//클래스를 재사용하기가 힘듦. 유지보수적인 측면도 좋지 않아요.
		//우리가 하려는 객체지향 프로그램과 상반되는 현상

		BookDAO dao=new BookDAO();
		ArrayList<BookEntity> list=dao.selectAll(keyword);
		return list;
		
	}

	
}
