package section09;

public class Movie {
	public String title;
	public int price;
	public String director;
	
	//static 초기화 블럭
	static{
		System.out.println("Movie() static 초기화 블럭");
	}
	
	//초기화 블록
	{
		this.title = "매트릭스";
		this.price = 14000;
		this.director = "워쇼스키 자매";
		System.out.println("Movie() 초기화 블럭");
	}
	//생성자
	public Movie() {
		this.title = "기생충";
		this.price = 14000;
		this.director = "봉준호";
		System.out.println("Movie() 생성자");
	}
	
//static 초기화 블럭 -> 초기화 블럭 -> 생성자 실행	
	
	//최상위 클래스 Object 상속받음
	@Override //상속받아 재정의
	public String toString() {//Movie class 에 대한 값을 string으로 리턴해주는 메소드
		return title + "/" + price + "/" + director;
	}
}
