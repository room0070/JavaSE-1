package section05;
/*
 * 중첩 for문
 *  for문 안에 for문
 */

public class Loop05 {
	public static void main(String[] args) {
		for(int i=0; i<7; i++) {
			for(int j=0; j<i+1; j++) {
				System.out.println("*");
			}
			System.out.println(); //v
		}
	}
}
//➀i=0 -> ➁(i<7): T -> ➂{j=0 -> (j<1): T -> "*" -> j=1 -> (j<1): F} -> v
//➃i=1 -> ➄(i<7): T -> ➅{j=0 -> (j<2): T -> "*" -> j=1 -> (j<2): T -> "*" -> j=3 -> (j<2): F} -> v
//...

/*결론
 * i=0 > "*" 1개(j=0)
 * i=1 > "*" 2개(j=0, 1)
 * i=2 > "*" 3개(j=0, 1, 2)
 * ...
 * i=6 > "*" 7개(j=0,1,2,3,4,5,6)
 */