package section13;
/*
 * 내부 클래스(Inner Class)
 *  클래스 내부에서 선언되고 사용되는 클래스를 의미한다.
 *  내부 클래스는 외부 클래스의 멤버로 간주되며, 외부 클래스의 인스턴스와 밀접한 관계를 가진다.
 */
public class InnerClass01 {
	public static void main(String[] args) {
		//static 내부 클래스 - 객체 생성없이 외부클래스를 통해 접근할 수 있다.
		InnerClass01.InnerClass.info();
		//같은 클래스 안에서 바로 접근 가능
		InnerClass.info();
		
	}
	
	static class InnerClass{
		public static void info() {
			System.out.println("static 내부 클래스 입니다.");
		}
	}

}
