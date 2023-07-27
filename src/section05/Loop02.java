package section05;
/*
 * 2. do ~ while 문
 *  while문과 비슷하지만, 최소 한번은 실행되는 반복문
 *  
 *  do {
 *  	반복 수행할 코드
 *  } while(조건문);
 *  
 */

public class Loop02 {
	public static void main(String[] args) {
		int count = 0;
		do {
			System.out.println(count);
			count++;
		}while(count < 100);
	}

}
