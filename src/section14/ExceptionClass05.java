package section14;

import section14.access1.NumberPrinter;

/*
 * throws
 *  자바에서 메소드나 생성자가 예외를 던질 수 있음을 선언하는 키워드
 *  메소드가 예외를 처리하지 않고 해당 예외를 호출한 곳으로 넘기고자 할 때 사용.	//호출한 곳이 어디야?
 *  
 *  368p 참고
 */
public class ExceptionClass05 {
	public static void main(String[] args) throws InterruptedException {
		NumberPrinter np = new NumberPrinter();
		
		//첫번째 방법 try~catch
//		try {
//			np.printNumber();
//		}catch(InterruptedException e) {
//			e.printStackTrace();
//		}
		
		//두번째 방법 throws
		np.printNumber();
		
		//강제로 익셉션 발생시키기
		throw new NullPointerException();
	}

}
