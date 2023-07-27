package section09;

public class Food {
	public String name; 
	public int price; 
	public int type; 
	/**
	 * type
	 * 1 - 한식
	 * 2 - 중식
	 * 3 - 일식
	 * 4 - 양식
	 * 5 - 디저트
	 */
	public int count;
	
	public Food() {					//생성자			//★☆★
		name = "마라탕";
		price = 12000;
		type = 2;
	}
	//오버로딩
	public Food(String name, int price, int type) {	// ※※※
		this.name = name;	//전역변수명과 지역변수명이 같을 때 this.전역변수 로 구분
		this.price = price;
		this.type = type;
	}
	
	public Food(int count) {		//생성자(매개변수 count 받음) ＃＃＃
		this();					//여기 this 생성자는 ★☆★를 의미
		this.price = price * count;
		this.count = count;
	}
	
	public Food(String name, int price, int type, int count) {
		this(name,price * count, type);	//여기 this 생성자는 ※※※를 의미
		this.count = count;
	}
	
	public void getInfo() {
		System.out.println("name: " + name);
		System.out.println("price: " + price);
		System.out.println("type: " + getTypeName(type));
		System.out.println("count: " + count);
	}
	
	public String getTypeName(int type) {
		String typeName = "";
		switch (type) {
		case 1: 
			typeName = "한식";
			break;
		case 2: 
			typeName = "중식";
			break;
		case 3: 
			typeName = "일식";
			break;
		case 4: 
			typeName = "양식";
			break;
		case 5: 
			typeName = "디저트";
			break;
		case 6: 
			typeName = "기타";
			break;
		}
		return typeName;
		
	}

}
