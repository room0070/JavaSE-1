package section14;

import java.util.Scanner;

import section14.access2.InputErrorException;

public class ExceptionClass06 {
	public static void main(String[] args) {
		//스캐너 생성
		Scanner sc = new Scanner(System.in);
		
		try {
			//나입 입력
			System.out.println("당신의 나이를 입력하세요 >> ");
			int age = sc.nextInt();
			
			if(age<0) {
				//1살 미만인 경우 입력 실패
				throw new InputErrorException("입력이 잘못되었습니다.");
			}
			
			if (age>19) {
				System.out.println("성인");
			} else if(age>13){
				System.out.println("청소년");
			} else if(age>6){
				System.out.println("어린이");
			} else {
				System.out.println("아동");
			}
			
		} catch (InputErrorException e) { //InputErrorException e = new InputErrorException("입력이 잘못되었습니다.");
		System.out.println(e.getMessage());
		}finally {
			if(sc != null) sc.close();
		}
		
		
	}

}
