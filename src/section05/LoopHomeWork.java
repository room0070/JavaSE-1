package section05;

public class LoopHomeWork {
	public static void main(String[] args) {
/*1번 분석하고 연습해보기

*
**
***
****
*****
******
*******

반복문 조건문 연습
 주말숙제 2중for문 코드 분석하기 
 
*/
		System.out.println("1번 문제.");
		
		for(int i=0; i<7; i++) {          //줄
			for(int j=0; j<i+1; j++) {    //칸
				System.out.print("*");
			}
			System.out.println();  //개행
		}
		
		System.out.println("===========================");
		

/* 2번

   *
  **
 ***
****

*/
		
		System.out.println("2번 문제.");
		
		for(int i=0; i<4; i++) {
			switch (i) {
			case 0:
				System.out.print("   ");
				break;
			case 1:
				System.out.print("  ");
				break;
			case 2:
				System.out.print(" ");
				break;
			default:
				break;
			}
			for(int j=0; j<i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("=============================");
		
/* 3번.
 
   *      i=0 -> j=0,1,2 / 3  / 4,5,6
  ***     i=1 -> j=0,1  /2,3,4/ 5,6
 *****    i=2 -> j=0  /1,2,3,4,5/ 6         
*******   i=3 -> j= - /1,2,3,4,5,6/ -
 
 */
		System.out.println("3번 문제.");
		
		for(int i=0; i<4; i++) {
			switch (i) {
			case 0:
				System.out.print("   ");
				break;
			case 1:
				System.out.print("  ");
				break;
			case 2:
				System.out.print(" ");
				break;
			default:
				break;
			}
			for(int j=0; j<i+4; j++) {
				System.out.print("*");					
				if(j == i*2) {
					break;
				}
			}
			System.out.println();
		}
		
		System.out.println("==============================");
		
/* 4번.
					
   *   		i=0 > j=0,1,2/      3      / 4,5,6	:	i+j < 3 /   / j-i > 3
  ***		i=1 > j=0,1  /    2,3,4    /   5,6	:	i+j < 3
 *****		i=2 > j=0    /  1,2,3,4,5  /     6	:	i+j < 3
*******		i=3 > j=  -  /0,1,2,3,4,5,6/   -		
 *****		i=4 > j=0    /  1,2,3,4,5  /     6	:	i-j > 3 /   / i+j > 9
  ***		i=5 > j=0,1  /    2,3,4    /   5,6	:	i-j > 3 /   / i+j > 9
   *		i=6 > j=0,1,2/      3      / 4,5,6	:	i-j > 3 /   / i+j > 9

 */
		System.out.println("4번 문제.");
		
		for(int i=0; i<7; i++) {
			for(int j=0; j<7; j++) {
				if(i+j < 3) {					//3번 문제 동일
					System.out.print(" ");		//
				}else if(j-i > 3){				//
					System.out.print(" ");		//여기까지
				}else if(i-j > 3) {
					System.out.print(" ");
				}else if(i+j > 9) {
					System.out.print(" ");
				}else {
					System.out.print("*");
				}
			}
			System.out.println();  //개행
		}
		
		System.out.println("==============================");
		
/* 5번.

   ☆
   *		i=1 > j=0,1,2 /3/ 4,5,6		i+j < 4 /  /  j-i > 3
  ***		i=2 > j=0,1 /2,3,4/ 5,6
 *****		i=3 > j=0 /1,2,3,4,5/ 6
******* 
  | | Merry Christmas~*

 */
		System.out.println("5번 문제.");
		
		for(int i=0; i<5; i++) {
			for(int j=0; j<7; j++) {
				if(i == 0) {
					if(j == 3) {
						System.out.print("☆");
					}else {
						System.out.print(" ");
						continue;
					}
				}
				if(0 < i && i < 5) {  //0<i<5 아니고 0<5도 가능(왜?)
					if(i+j < 4) {
						System.out.print(" ");
					}else if(j-i > 2) {
						System.out.print(" ");
					}else {
						System.out.print("*");
					}
				}
				
			}
			System.out.println();
		}
		System.out.print("  | | Merry Christmas~*");	
		System.out.println();
		
		
		System.out.println("==============================");
		
/* 6번.

 구구단
  2 x 1 = 2		3 x 1 = 3	 4 x 1 = 4
  2 x 2 = 4
  ...
  2 x 9 = 18
  
  5 x 1 = 5 	6 x 1 = 6	 7 x 1 = 7
  ...
  5 x 9 = 45 	6 x ...
  
  8 x 1 = 1		9 x 1 = 9
  
  ....			9 x 9 = 81

 */
		System.out.println("6번(구구단) 문제.");
			
//		for(int i=1; i<10; i++) {
//			for(int j=2; j<10; j++) {
//				System.out.print(j + "x" + i + "=" + (i*j)+"\t");
//			}
//			System.out.println();
//		}
		for(int x=0; x<3; x++) {			//크게 3개
			for(int i=0; i<9; i++) {		//9줄
				for(int j=0; j<3; j++) {	//3칸
					int dan = j + 2 + x*3;
					if(dan < 10) {
						System.out.printf("%d x %d = %d\t",dan, i+1, dan*(i+1));						
					}
				}
				System.out.println();
			}
			System.out.println();
		}
	}
}
	





















