package section15;

import java.util.Random;

public class JavaUtilClass02 {
	public static void main(String[] args) {
		//45크기 배열 생성
		int[] Num = new int[45];
		
		//1부터 45까지 배열에 저장
		for(int i = 0; i < Num.length; i++) {
			Num[i] = i+1;
		}
	
		Random ran = new Random();
		for(int i = 0; i < Num.length; i++) {	//셔플
			//0~44까지 숫자 중 임의 값 반환
			int changeIndex = ran.nextInt(45);
			
			int tmp = Num[i];
			Num[i] = Num[changeIndex];
			Num[changeIndex] = tmp;
		}
		
		for(int i = 0; i < 6; i++) {
			System.out.println(Num[i] + " / ");
		}
		
	}
}
