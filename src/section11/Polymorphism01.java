package section11;

import section11.access1.Bus;
import section11.access1.Car;

/*
 * 다형성(Polymorphism)
 *  같은 인터페이스 또는 부모를 공유하는 객체가 여러 유형의 타입을 가질 수 있는 것
 *  
 */
public class Polymorphism01 {
	public static void main(String[] args) {
		Bus bus = new Bus();
		bus.drive();		//승객을 태우고 운전합니다	//Bus 정보
		bus.bell();			//벨을 누릅니다.			//Bus 정보
		
		Car car = new Bus();	
		car.drive();		//승객을 태우고 운전합니다.	//Bus 정보
//		car.bell();			////Bus 정보
//자식Bus의 정보를 부모Car 변수car로 쉽게 호출 가능하나, 부모Car 정보drive를 오버라이딩 했을때만 호출 가능 
		
		Bus bus2 = (Bus) car;	//다운캐스팅
		bus2.drive();		//승객을 태우고 운전합니다.	//Bus 정보
		bus2.bell();		//벨을 누릅니다.			//Bus 정보
		
	}
}
