package section07;
/*
 * 변수(Variable)
 *  값을 저장하기 위한 메모리 공간을 의미.
 *  변수는 이름을 통해 해당 메모리 공간에 접근하고 값을 읽거나 수정할 수 있다.
 *  
 * 변수 선언 및 초기화
 *  자료형(type) 변수명 = 값 or 객체;
 *  
 * 1. 타입의 따른 변수
 * 		기본형 - 예약어, 소문자로 시작, 직접 값을 가지고 있다.
 * 			8가지 - boolean, char, byte, short, int, long, float, double
 * 		참조형 - 기본형 외 나머지 전부! 참조(주소)값을 가지고 있다. 보통 대문자로 시작하지만 소문자도 가능하다.
 * 			예) String
 * 
 * 2. 선언 위치에 따른 변수
 * 		전역변수 - 클래스 안에 선언된 변수(멤버변수, 멤버필드)
 * 				초기화 하지 않으면 default 값이 들어간다.
 * 				boolean - false
 * 				정수형 - 0
 * 				실수형 - 0.0
 * 				참조형 - null (참조할 주소값이 없다)
 * 		지역변수 - 메소드 또는 생성자 안에 선언된 변수(매개변수도 지역변수이다)
 * 				초기화 하지 않으면 컴파일 에러 발생!(반드시 초기화하기)
 * 				메소드 종료시 같이 소멸된다.
 * 
 * 3. 정적(static) 변수에		> 변수를 보고 3가지 타입을 바로 파악할 줄 알아야 한다.
 * 		static 붙은 멤버변수
 * 		같은 타입 모든 객체가 공유하는 변수		ex)OOP02 의 PokerCard.width 참조
 * 		클래스명으로 접근 가능.
 * 		객체 생성 없이 불러올 수 있다.
 * 
 */
public class Var {
	int globalNum = 100;	//클래스에 종속 > 전역변수
	//전역변수는 class가 존재하는 한 같이 존재. class 사라질 때 소멸.
	
	static int globalNum2;	//변수 선언만. 초기화하지 않음!
	
	
	public static void main(String[] args) {
		
//		System.out.println("globalNum: " + globalNum); 부터 호출하면 오류 생긴다.
/* 이유
 *  main은 프로그램 실행 전에 static 영역에 먼저 올라간다.
 *  먼저 올라가서 globalNum 찾아도 없음..
 *  따라서 globalNum을 가진 class Var 또한 main 메모리에 올려줘야 한다.
 *  아래처럼!!
 */
	
		Var var1 = new Var();	//메모리에 올리고
		System.out.println("globalNum: " + var1.globalNum); //찾자(globalNum)
		
//		printNum(); 	메소드도 마찬가지로 static 아니라서 못찾는다.
		var1.printNum();
		
//main에서 그냥 불러오고 싶으면 메소드에 static 붙이자.
		getAreaNum();
		
		int areaNum2;	//변수 선언 초기화하지 않음!
		
		System.out.println("globalNum2: " + globalNum2);	//0 : 전역변수는 초기화하지 않으면 default값
//		System.out.println("areaNum2: " + areaNum2);		//오류 : 지역변수는 초기화하지 않으면 에러 발생!
	}
	
	public static void getAreaNum() {
		int areaNum = 30;	//메소드에 종속 > 지역변수
		//지역변수는 해당 메소드가 끝나면 같이 사라진다.
	}
	
	public void printNum() {
		System.out.println("globalNum: " + globalNum);	//전역변수는 메소드에서 호출 가능
//		System.out.println("areaNum: " + areaNum);	//지역변수는 다른 메소드에서 찾으려해도 찾을 수 없다!!
		//자기 메소드에 속하지 않으면 못 찾음. 사용 불가. 전역변수는 사용 가능.
	}
	

}
