package section08;

public class Method07 {
	
	public static void main(String[] args) {
		
		int result = add(10,5);	//반환값 받아주기
		System.out.println("result: " + result);
		
	}

	// 7. 인자 o 리턴 o -> 인자값을 받아 실행한 뒤 반환값을 준다.
	public static int add(int a, int b) {
		return a+b;		//간단한 건 변수 선언 안하고 바로 return 해도 된다.
		
//		int result = a + b;		변수 선언
//		return result;
	}
	
	//오버로딩 메소드
	public static int add(int a, int b, int c) {
		return a+b+c;
	}
}
