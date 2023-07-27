package section02;
/*
 *  2. 문자형(char)
 *   문자 한 글자 저장 가능 - 전세계 쓰이는 대부분의 문자 표현 가능!
 *   2byte
 *   
 *  선언방법
 *  	char 변수명;
 *  
 *  변수 초기화
 *  	변수를 사용하기 전에 값을 할당하는 것을 의미한다.
 *  
 */
public class Variable02 {
	public static void main(String[] args) {
		// char 형 변수 선언과 동시에 값 대입하기(초기화)
		char ch1 = 'A';
		System.out.println("char 형 변수에 저장된 문자: " + ch1);
		
		char ch2, ch3;
		ch2 = '金';
		ch3 = '쀍';
		System.out.println("ch2에 저장된 문자: " + ch2);
		System.out.println("ch3에 저장된 문자: " + ch3);
		
		int num = ch1; //char 형은 int 정수형으로 형변환
		System.out.println("대문자 A에 해당하는 숫자코드: " + num);
		
		char ch4 = 66;
		System.out.println("숫자 66에 해당하는 문자코드: " + ch4);
		
		int num2 = 110;
		char ch5 = (char)num2; //int 형을 char 형으로 강제 형변환
		System.out.println(ch5);
	}
}
