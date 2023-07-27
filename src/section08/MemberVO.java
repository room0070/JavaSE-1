package section08;

public class MemberVO {

	private String id;	//전역변수 id
	
	//MemberVO 의 id 값에 접근하고 싶으면 바로 접근 x, get/set 메소드를 통해 접근하라.
	
	private String password;
	private String name;
	private String mobile;
	private String email;
	private String address;
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {	//매개변수 id
		this.id = id;	//this : 스스로를 참조하는 예약어. 전역변수와 매개변수 구분 위해 사용
		//매개변수의 값을 전역변수에 넣겠다!
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	

}
