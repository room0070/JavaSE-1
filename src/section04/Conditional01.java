package section04;
/*
 * 조건문
 *  주어진 조건식의 결과에 따라 별도의 명령을 수행하도록 하는 제어문
 *  
 * 1. if문
 *  if(조건식) {
 * 		조건식이 true일 때 실행 명령문
 *  }
 *  
 *  if(조건식)
 *  	조건식이 true일 때 실행 명령문(명령문이 한줄(;) 일때 중괄호 생략 가능)
 */

public class Conditional01 {
	public static void main(String[] args) {
		int num = 11;
		if(num % 2 ==0) {
			System.out.println("num은 짝수");
			System.out.println("num은 짝수");
			System.out.println("num은 짝수");
		}
		if(num % 2 !=0) {
			System.out.println("num은 홀수");
		}
		
		if(num % 2 ==0) 
			System.out.println("num은 짝수1 입니다");
		
		if(num % 2 !=0) 
			System.out.println("num은 홀수1 입니다");
		
	}

}
