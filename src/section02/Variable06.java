package section02;
/*
 *  5. String 형 (문자열)
 *   문자열을 저장할 수 있다.
 *   참조형 변수
 *   
 *   선언방법
 *    String 변수명;
 *    
 *   기본형 - boolean, char, byte, short, int, long float, double
 *   		 8가지
 *   		 실제 값을 저장
 *   
 *   참조형 - 기본형을 제외한 모든 객체(클래스 코드로 되어있다)
 *   		 주소값을 저장
 *   		 속성(변수), 기능(메소드)
 * 
 */
public class Variable06 {
	public static void main(String[] args) {
		//변수 선언과 동시에 대입하기
		String str = "안녕하세요.";
		System.out.println("str: " + str);
		
		/*
		 * h e l l o
		 * 0 1 2 3 4  <= 인덱스 번호
		 * 
		 */
		
		String hello = "hello";
		System.out.println("1번 인덱스: "+ hello.charAt(1));
		System.out.println("2번 인덱스부터 4번 인덱스까지: " + hello.substring(2, 4));

		String addr = "서울특별시 서대문구 신촌";
		boolean isContain = addr.contains("특별시");
		
		//if 조건문
		if(isContain) {
			System.out.println("특별시민 입니다.");
		}else {
			System.out.println("특별시민 아닙니다.");
		}
	}

}
