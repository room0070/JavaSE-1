package section04;
/*
 * 2. switch ~ case 문 (if문이랑 비슷)
 */

public class Conditional03 {
	public static void main(String[] args) {
		int num = 1;
		
		switch (num) {
		case 0:
			System.out.println("num은 0 입니다.");
			break;
		case 1 :
			System.out.println("num은 1 입니다.");
			break;
		case 2 :
			System.out.println("num은 2 입니다.");
			break;
		case 3 :
			System.out.println("num은 3 입니다.");
			break;
		default:
			System.out.println("num은 0~3이 아닙니다.");
			break;
		}
		
		System.out.println("====================");
		
		switch (num) {
		case 0:
			System.out.println("num은 0 입니다.");
		case 1 :
			System.out.println("num은 1 입니다.");
		case 2 :
			System.out.println("num은 2 입니다.");
		case 3 :
			System.out.println("num은 3 입니다.");
		default:
			System.out.println("num은 0~3이 아닙니다.");
		}
		//break 없으면 true인 조건의 실행문 실행 후 뒤의 다른 조건문의 실행문까지(끝까지) 실행한다.
	}
}



