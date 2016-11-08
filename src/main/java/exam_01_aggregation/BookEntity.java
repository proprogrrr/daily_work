package exam_01_aggregation;


// DTO를 만들 수 있는 class
// Database를 근간으로 해서 만듦!
public class BookEntity {
    
	private String bisbn;
	private String btitle;
	private String bauthor;
	
	
	public String getBisbn() {
		return bisbn;
	}

	public void setBisbn(String bisbn) {
		this.bisbn = bisbn;
	}

	public String getBtitle() {
		return btitle;
	}

	public void setBtitle(String btitle) {
		this.btitle = btitle;
	}

	public String getBauthor() {
		return bauthor;
	}

	public void setBauthor(String bauthor) {
		this.bauthor = bauthor;
	}

	public int getPricess() {
		return pricess;
	}

	public void setPricess(int pricess) {
		this.pricess = pricess;
	}

	
	
	
	private int pricess;

	public BookEntity(){
			
	}
	
	
	
	
	
}
