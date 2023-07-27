package section07;
/*1
 * 상수
 *  처음 값이 할당되면 그 값을 변경할 수 없다.
 *  final 키워드 사용
 *  통상적으로 보통 대문자로 선언한다.
 *  
 */

public class Constant {
	static final double PI = 3.141592;	//final 예약어(키워드)를 선언하는 순간, 오른쪽 값이 왼쪽 변수에 대입

	public static void main(String[] args) {
		// 원의 반지름
		int r = 10;

//		PI = 3.141592;  // 상수라서 변경 불가

		double area = getArea(r); //r=10 대입 후 값이 return되어
//		double area = 314.1592653589793 이 된다.
		
		System.out.println("원의 넓이: " + area);
	}

	private static double getArea(int r) { // int r =10;
		// 원의 넓이 = 2πr
		double area = Math.PI * Math.pow(r, 2); // pow(a,b) : a를 b만큼 제곱

		return area;
	}

}
//특정 목적의 이름(getArea)으로 묶는다
//메소드명(int r) > r 값을 넣을 수 있다. ex)int r = 10;
//r값을 메소드 내용에 담아 return 해준다.
//해당 메소드 호출 시 같은 타입으로 받는다.
//ex)double getArea 지정 > double area = getArea : 같은 double로 받는다.
//getArea에서 지정한 area 변수는 지역변수이므로,
//main메소드에서 getArea 호출 시 변수명 area 사용해도 상관없다.
