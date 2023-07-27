package section06;

public class Array05 {
	public static void main(String[] args) {
		//new 연산자를 사용하지 않고 2중 배열 선언 및 대입 생성
		int[][] nums =  //2중 배열: 배열 안에 배열이라서 {}*2개
				{
					//{     3중 배열이면 {}*3개	
						{1,2,3},
						{4,5,6},
						{7,8,9},
						{10,11,12}
					//}
				};
		
		for(int i=0; i<nums.length; i++) { //nums.length = 4 : 첫번째 배열{} 안에 4줄
			
			// i : 0 -> nums[0] : {1,2,3}    nums[0].length : 3 : 두번쨰 배열{} 안에 3개
			// i : 1 -> nums[1] : {4,5,6}    nums[1].length : 3
			
			for(int j=0; j<nums[i].length; j++) {
				System.out.print(nums[i][j] + " ");
			}
			System.out.println();  //개행
		}
		
		System.out.println("===============================");
		
		nums[1][1] = 15;  //값 변경
		
		for(int i=0; i<nums.length; i++) {
			for(int j=0; j<nums[i].length; j++) {
				System.out.print(nums[i][j] + " ");
			}
			System.out.println();  //개행
		}
	}

}
