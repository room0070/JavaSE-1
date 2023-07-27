package section11;

import section11.access2.Ade;
import section11.access2.Drink;
import section11.access2.IonicDrink;

/*
 * instanceof 연산자
 *  객체가 특정 클래스 또는 인터페이스의 인스턴스인지 여부를 확인
 */
public class Polymorphism03 {
	public static void main(String[] args) {
		int selectNum = Integer.parseInt(args[0]);
		//Integer.parseInt : 문자열을 숫자로 변환시키는 함수
		System.out.println("selectNum: " + selectNum);
		
		Drink drink = selectDrink(selectNum);
		
		if (drink instanceof Ade) {
			Ade ade = (Ade) drink;
			ade.getinfo();
			ade.getDiscountRate();
			ade.zero();
		} else if(drink instanceof IonicDrink){
			IonicDrink ionicDrink = (IonicDrink) drink;
			ionicDrink.getinfo();
			ionicDrink.getDiscountRate();
		}
	}
	/**
	 * 음료선택 메소드
	 * 1: Ade
	 * 2: 이온음료
	 */
		public static Drink selectDrink(int selectNum) {
			Drink drink;
			if(selectNum == 1) {
				drink = new Ade();
			}else {
				drink = new IonicDrink();
			}
			return drink;
	}
	
}
