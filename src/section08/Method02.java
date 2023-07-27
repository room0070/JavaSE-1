package section08;

public class Method02 {
	public static void main(String[] args) {
		
		printName("피카츄"); //인자값을 넣으면 대입된다.
	//	printName(); ()안에 인자타입(String)에 맞는 내용(인자값(name))을 넣지 않으면 오류난다.
		
	}
	
	// 2. 인자 o 리턴 x -> 인자값을 받아 실행하고 끝나는 메소드
	public static void printName(String name) { //String name = "피카츄"; //지역변수
		System.out.println("name: " + name);
	}
}
