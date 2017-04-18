package prob02;

public class Book {
	
	private int bookNo;
	private String title;
	private String auther;

	private int stateCode;
	
	public int getStateCode(){
		return stateCode;
	}
	
	public int getBookNo() {
		return bookNo;
	}
	public void setBookNo(int bookNo) {
		this.bookNo = bookNo;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuther() {
		return auther;
	}
	public void setAuther(String auther) {
		this.auther = auther;
	}

	
	public Book(int bookNo,String title,String auther){
		this.bookNo = bookNo;
		this.title = title;
		this.auther = auther;
		this.stateCode =1;
	}
	public void rent(){
		this.stateCode =0;
		System.out.println(title+"이 대여되었습니다.");
		
	}
	
	public void print(){
		String state ="";
		
		if(this.stateCode ==1){
			state ="재고있음";
		}
		else{
				state = "대여중";
			}
		
		System.out.println("책제목: "+title+"작가: "+auther+"대여 유무 : "+state);
		

	}
}
