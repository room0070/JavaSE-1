package section11;

import section11.access2.Ade;
import section11.access2.Drink;
import section11.access2.IonicDrink;

public class practice extends Drink{
	public static void main(String[] args) {
		
		Drink drink = new Drink();
		drink.getinfo();
		drink.getDiscountRate();
		System.out.println(System.identityHashCode(drink));
		
		System.out.println("===================");
		
		Ade ade = new Ade();
		ade.getinfo();
		ade.getDiscountRate();
		ade.taste();
		ade.zero();
		System.out.println(System.identityHashCode(ade));
		
		System.out.println("===================");

		IonicDrink ionicDrink = new IonicDrink();
		ionicDrink.getinfo();
		ionicDrink.taste();
		ionicDrink.getDiscountRate();
		System.out.println(System.identityHashCode(ionicDrink));
		
		System.out.println("===================");
		
		Drink drink1 = ade;	//업캐스팅
		drink1.getinfo();
		drink1.getDiscountRate();
//		drink1.taste();		업캐스팅한 drink 변수로는 ade 자체 메소드 호출 x
//		drink1.zero();
		System.out.println(System.identityHashCode(drink1)); 	//ade 주소값 참조
		
		System.out.println("===================");
		
		Drink drink2 = ionicDrink;
		drink2.getinfo();
		drink2.getDiscountRate();
		System.out.println(System.identityHashCode(drink2)); 	//ionicDrink 주소값 참조

		System.out.println("===================");
		
		drink1.name = "나나나";
		ade.brand = "ss";	//ade 자체 변수 brand 바꿔도 drink1에 반영된다.
		
		drink1.getinfo();
		System.out.println("=====");
		ade.getinfo();
		
		System.out.println("===================");
		
		System.out.println("Drink: " + (drink instanceof Drink));
		System.out.println("Ade: " + (drink instanceof Ade));
		System.out.println("Ionic: " + (drink instanceof IonicDrink));
		
		System.out.println("========");
		
		System.out.println("Drink: " + (drink1 instanceof Drink));
		System.out.println("Ade: " + (drink1 instanceof Ade));
		System.out.println("Ionic: " + (drink1 instanceof IonicDrink));
		
		System.out.println("========");
		
		System.out.println("Drink: " + (drink2 instanceof Drink));
		System.out.println("Ade: " + (drink2 instanceof Ade));
		System.out.println("Ionic: " + (drink2 instanceof IonicDrink));
		
		System.out.println("========");
		
		System.out.println("Drink: " + (ade instanceof Drink));
		System.out.println("Ade: " + (ade instanceof Ade));
//		System.out.println("Ionic: " + (ade instanceof IonicDrink));
//Incompatible conditional operand types Ade and IonicDrink		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
