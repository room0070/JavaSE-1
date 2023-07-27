package section06;

public class Array03 {
	public static void main(String[] args) {
		//new 연산자를 사용하지 않고 직접 배열 값 대입 생성
		String[] names = {"피카츄", "라이츄", "파이리", "꼬부기", "버터플", "야도란"};
		
		//배열 내용 출력해보기
		for(int i=0; i<names.length; i++) {
			System.out.println(names[i]);
		}
		System.out.println("======================");
		
		//배열 값 수정하기
		names[5] = "잠만보";
		
		//확장 for문
		for(String name : names) {  // String name = names[0]
									// name = names[1]
									// name = names[2]
									//...(중략)...
									// name = names[5]
			System.out.println(name);						
		}
	}

}

// 확장 for문
//for(변수 선언 : x) 
//	 for문이 한 번 씩 돌 때마다 x의 0번부터 끝번까지(길이만큼) 선언한 변수에 대입된다.
//	 x는 배열성 변수여야 한다.