package section07;

public class OOP02 {
	public static void main(String[] args) {
		PokerCard card1 = new PokerCard();	//객체 생성
		PokerCard card2 = new PokerCard();
		
		System.out.println("card1 type: " + card1.type);
		System.out.println("card1 number: " + card1.number);
		System.out.println("card1 width: " + card1.width);
		System.out.println("card1 height: " + card1.height);

		System.out.println("card2 type: " + card2.type);
		System.out.println("card2 number: " + card2.number);
		System.out.println("card2 width: " + card2.width);
		System.out.println("card2 height: " + card2.height);
		
		System.out.println("===================================");
		
		card1.number = "K"; //메모리의 card1 영역에 저장된 number > card2에 영향 x	//객체로 접근
		
		System.out.println("card1 number: " + card1.number);	//K
		System.out.println("card2 number: " + card2.number);	//A
		
		PokerCard.width = 70; //main 실행 전에 이미 static 영역에 올라가 있으므로 객체 생성 후 객체로 접근하지 않아도 된다.(Var의 전역변수 참조)
		
		
		System.out.println("card1 width: " + PokerCard.width);	//70
		System.out.println("card2 width: " + card2.width);	//62
		//static 영역의 주소값을 저장(참조)한다. > public static int width 주소= card1의 width = card2의 width > 서로 영향 o
	}
}

