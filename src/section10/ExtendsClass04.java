package section10;

import section10.access3.Jindo;

/*
 * final 클래스
 *  클래스 앞에 final 키워드 추가할 경우, 클래스 상속의 마지막 클래스임을 뜻한다.
 *  상속 불가
 *  
 * final 메소드
 *  메소드에 final 선언하면 해당 메소드는 하위클래스에서 오버라이드 할 수 없다.
 *  오버라이딩 금지
 */

public class ExtendsClass04 {
	public static void main(String[] args) {
		Jindo jindo = new Jindo();
		jindo.name = "백구";
		jindo.bark(); 		//오버라이딩 금지일 뿐 Jindo는 Dog 상속받아서 bark() 정보가 있다.
	}

}
