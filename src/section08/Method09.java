package section08;
/*
 * VO(Value Object), DTO(Data Transfer Object)
 *  값 오브젝트로써 목적의 맞는 변수의 집합.
 *  예) DataBase 또는 네트워크 통신 값 운반용으로 사용.
 *  
 * 캡슐화(정보은닉) - 객체의 속성과 행위를 하나로 묶고
 * 				외부로부터 내부를 감싸 숨겨 은닉한다.
 * 
 * 
 */

public class Method09 {
	public static void main(String[] args) {
		MemberVO memberVO = new MemberVO();
		
//		System.out.println(memberVO.id);	오류		
//		memberVO.id = "025";
//		memberVO.name = "피카츄";
		
		memberVO.setId("025");		//인수값 넣어서 세팅하고
		memberVO.setName("피카츄");
		
		String id = memberVO.getId();	//변수에 값 받아서
		String name = memberVO.getName();
		
		System.out.println(id);			//호출
		System.out.println(name);
	}

}
