package dailyWork1;

import java.util.ArrayList;
import java.util.Scanner;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;


public class Main {

	public static void main(String[] args) {
		
		System.out.println("키워드를 입력하세요 ==>");
		Scanner sc = new Scanner(System.in);
		String keyword = sc.nextLine(); 
		
		
		String config = "classpath:work_applicationCtx.xml";
		
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(config); 
		BookService service = ctx.getBean("bookService",BookService.class);
		ArrayList<ArrayList<BookEntity>> list = service.getListByKeyword(keyword);
		

		ArrayList<BookEntity> a = list.get(0);
		ArrayList<BookEntity> b = list.get(1);
		
		for(int i=0;i<a.size();i++){
			System.out.println(a.get(i).getBtitle()+" : "+a.get(i).getBauthor());
			int count=1;
		
			for(int j=0;j<b.size();j++){
				
				if(a.get(i).getBisbn().equals(b.get(j).getBisbn())){
					
					System.out.println("======> 서평 "+count+ ": "+b.get(j).getBcomment());
					
				}
				count = count+1;
			}
		}
	
		sc.close();
		ctx.close();
	}
}
