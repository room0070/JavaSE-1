package section09;
/*
 * 생성자(Constructor)
 *  객체가 생성되기 직전 실행되는 반환값이 없는 메소드.(주의 메소드 아님! 비유적 표현)
 *  객체 초기화 목적에 주로 사용된다.
 *  클래스명과 동일하다.
 * 
 */
public class Constructor01 {
	public static void main(String[] args) {
		Book book1 = new Book();	// 1. 객체 생성
		book1.title = "이방인";		// 2. 값 대입
		book1.price = 9000;
		book1.totalPage = 280;
		book1.author = "알베르 카뮈";
		
		book1.getInfo();			// 3. getInfo
		
		System.out.println("======================");
		
		Book book2 = new Book();	// 1. 객체 생성
		book2.getInfo();			// 2. getInfo

	}
}
//객체 생성 후 아무 값도 안 넣으면 전역변수의 defalt값이 들어간다.
//but 생성자를 만들면 객체가 