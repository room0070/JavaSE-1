package section07;

//3
//OOP01.java

public class Car {
	static int wheel = 4; 		// OOP03에서 사용
//	int wheel = 4;   //바퀴 4개 	 > OOP01에서 사용
						//멤버필드 선언 및 초기화
	String color;
	
	//메소드 - 객체에서 기능 역할
	public void drive() {
		System.out.println("운전을 해요!");
	}
	
	public void parking() {
		System.out.println("주차를 해요!");
	}

}
