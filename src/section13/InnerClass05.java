package section13;

import section13.access2.Bird;

public class InnerClass05 {
	public static void main(String[] args) {

		String name = new Bird() {
			
			private String name = "비둘기";
			
			@Override
			public void sing() {
				System.out.println("노래를 해요~");
			}
			
			@Override
			public void fly() {
				System.out.println("하늘을 날아요~");
			}
			
			public String getName() {
				return name;
			}
		}.getName();	//.getName(); 은 왜 하는거야..?
		
		System.out.println("name: " + name);
		
	}
}
