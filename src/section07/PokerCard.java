package section07;

public class PokerCard {
	public static int width = 62;	//static 예약어 사용 > static 영역에 저장
	public static int height = 88;
	
	public String type = "Spade";
	public String number = "A";

	//카드 게임 시, 카드의 타입이나 숫자는 바뀔 수 있지만 카드의 크기는 변하면 안된다.
	//이처럼 같은 타입의 동일한 객체가 공통으로 사용하는 값은 static 으로 생성!
	//static : 같은 타입의 객체가 공통으로 쓰는 변수
	
	public Car backgroundCar = new Car(); //객체 안에 객체 가능
}
