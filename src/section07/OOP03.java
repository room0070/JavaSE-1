package section07;

public class OOP03 {
	//참조형, 전역변수, 동적
	Car car3 = new Car();
	
	public static void main(String[] args) {
		//참조형, 지역변수, 동적
		Car car1 = new Car();	//객체 생성
		Car car2 = new Car();
		
		car1.drive();
		car2.parking();
		
		System.out.println(System.identityHashCode(car1));
		System.out.println(System.identityHashCode(car2));
		
		//기본형, 지역변수
		int num = 10;	//지역변수 생성
		double PI = 3.14;
	}

}
/* 저장공간 별 프로그램 실행 순서
 * Method Area에서 프로그램 실행 코드 읽고
 * 				 static 부터 찾아서 static 영역에 정보 올린다.(main)
 * 			     상수도 Constant Pool에 먼저 올라간다.
 * 
 * stack Area에 지역변수/메소드 단위로 프로그램 실행 코드 순서대로 쌓인다.
 * 				기본형 변수도 여기에.
 * 				참조형 변수는 Heap 영역의 주소값 가져온다.
 * 
 * Heap Area에 new 연산자로 생성된 객체 정보(Object) 올라간다.
 * 		Object가 가진 멤버필드, 멤버메서드(static이 붙지 않은 것) 정보.
 * 				가진	static 정보는 Static 영역으로.
 * 		참조형 변수도 여기에.
 * 	
 * 
 * Method Area 의 static 영역에 정보 올라간다.
 * 		Car.wheel = 4;
 * 		OOP03.main(String[] args) 도 올라간다.
 * 
 * Heap Area 에서 new 연산자로 생성된 객체 정보 올라간다.(전역변수도 여기)
 * 		new Car.();
 * 			wheel : Car.wheel
 * 			주소값: 123456789
 * 
 * 		new Car.();
 * 			wheel : Car.wheel
 * 			주소값: 987654321
 * 
 * Stack Area 에서 프로그램 실행 시 main의 코드가 순서대로 쌓인다.(메소드 단위로)
 * 		Car car1 = 123456789
 * 		Car car2 = 987654321
 * 		car1.drive();
 * 		car2.parking();
 * 
 * Stack 영역은 제일 마지막에 실행된 것(parking)부터 사라진다.
 * Heap 영역은 자주 사용하지 않는 or 오래 된 것부터 JVM이 판단 후 garbage 영역으로 보낸다.
 *			사용할 때 다시 가져온다. => 동적이다. 
 *
 *
 ******
 *프로그램 실행 전에 메소드 영역에 static 정보 올리고(main도)
 * > 실행하면 스택 영역에 메소드 단위로 main 내용 쌓아 올린다.
 * > 필요한 경우 힙 영역에 만들어져 있는 객체의 주소 참조.
 * 
 */
//