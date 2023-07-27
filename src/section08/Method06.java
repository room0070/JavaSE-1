package section08;

public class Method06 {
	public static void main(String[] args) {
		
	//	getName(); 는 값("피카츄")을 가지고 있음.
		
		String name = getName(); //String name 변수로 받아서
		System.out.println("name: " + name); //출력
		
		System.out.println("name: " + getName());	//getName() = "피카츄"
		//메소드 안에서 메소드 출력 가능
		//getName(); 실행 후 반환값을 가지고 sysout.print 실행
		
	}
	
	// 6. 인자 x 리턴 o -> 메소드 실행하여 값은 반환한다.
	public static String  getName() {  //String 타입으로 반환하겠다.
		String name = "피카츄";
		
		return name;  
	
	//void : 반환값이 없다
	//return name: name값을 반환하겠다.
	}
}
