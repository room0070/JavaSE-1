package section02;
/*
 *  4. 실수형
 *   소수부나 지수부가 있는 수를 가리킨다.
 *   실수를 저장할 수 있는 자료형
 *   
 *   float  (4byte) : 소수점 7자리 표현
 *   double (8byte) : 소수점 15자리 표현
 *   
 */
public class Variable04 {
	public static void main(String[] args) {
		float iFloat = 10.1f;     //float형은 값 대입 시 f 안붙이면 빨간줄 뜬다!
		double iDouble = 10.1d;
		double iDouble2 = 10.2;
		
		System.out.println("float 형 : " + iFloat);
		System.out.println("double 형 : " + iDouble);
		System.out.println("double 형 2번째 : " + iDouble2);
	}
}
