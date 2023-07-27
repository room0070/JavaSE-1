package section09;

public class Book {
	//속성
	public String title;						// 여기
	public int price;							//	^
	public int totalPage;						//	|
	public String author;						//	|
												//	|
	public Book() {		//생성자 만들면
		title = "멘토씨리지 자바";	//객체가 생성되기 전에 값을 위에 대입하고
		price = 32000;			//값이 있는 상태로 객체화 된다.
		totalPage = 603;
		author = "김영우";
	}//생성자의 목적: 객체 생성 전에 뭔가를 해야할 경우. 주로 초기화 목적
	
	public void getInfo() {
		System.out.println("title: " + title);
		System.out.println("price: " + price);
		System.out.println("totalPage: " + totalPage);
		System.out.println("author: " + author);
	}
}
