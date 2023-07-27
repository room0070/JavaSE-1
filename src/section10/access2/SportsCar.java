package section10.access2;

import section10.access1.Car;

public class SportsCar extends Car{
	public boolean isOpen;	
	
	@Override
	public void getinfo() {
		System.out.println("model: " + model);
		System.out.println("year: " + year);	//protected 상속관계 접근가능
//		System.out.println("color: " + color);	//default 다른패키지 접근불가
//		System.out.println("brand: " + brand);	//private 다른클래스 접근불가
		System.out.println("isOpen: " + isOpen);
		
	}

}
