package section08;
/*
 * 메소드(Method)
 *  프로그래밍에서 메소드는 하나의 특별한 목적의 작업을 수행하기 위해 설계된 프로그램 코드 집합.
 *  객체에서 기능 역할을 한다.
 *  
 * 메소드 구조
 *  (접근제한자) (정적) 반환타입 메소드이름(매개변수타입 매개변수명) { //선언부
 *  	실행할 코드 (명령문 집합)
 *  
 *  	(return 반환값;)
 *  }
 *  
 */

public class Method01 {
	public static void main(String[] args) {
		hello(); //hello는 static 메소드이고 main과 같은 클래스에 있으므로 이름만으로 호출 가능.
		//다른 클래스에 있으면 Method01.hello(); 하고 클래스명 함께 불러줘야 한다.
		
	}
	//1. 인자(매개변수) x 리턴 x -> 호출시 실행하고 끝나는 메소드
	public static void hello() {
		System.out.println("Hello, World!");
	}
}
