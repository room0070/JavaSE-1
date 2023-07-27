package section14;
/*
 * Exception 종류
 * 1. Checked Exception
 *  반드시 try ~ catch 또는 throws 예약어로 예외 처리 해야한다.
 *  예외처리 하지 않을 시 컴파일 에러 발생!
 *  
 * 2. Unchecked Exception
 *  예외 처리를 하지 않아도 컴파일시 에러 발생하지 않는다.
 *  
 *  
 * 자바에서 제공하는 예외 객체로는 모든 예외를 처리할 수 없으므로 개발자가 직접 예외를 생서하여 처리해야 한다.
 *  사용자가 만든 클래스에 Exception 또는 RuntimeException을 상속하면 해당 클래스를 예외 처리 객체로 사용 가능.
 *  public class CustomException extends Exception{} : 체크 예외를 만들고 싶을 때
 *  public class CustomException extends RuntimeException{} : 비체크 예외 만들고 싶을 때
 * 
 */
public class ExceptionClass04 {
	public static void main(String[] args) {
		
		for(int i=0; i<10; i++) {
			System.out.println(i);
			
			try{
				Thread.sleep(1000); //1초 일시정지
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}

}
