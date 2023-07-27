package section10;

public class LoafBread extends Bread{
	public boolean isSlice;
	
	@Override
	public void getInfo() {
		super.getInfo();	//super = Bread
//	Bread의 getInfo 내용을 super.gerInfo에 담는다.(아래 내용을 한줄로 적은것)
//		System.out.println("breadName: " + breadName);
//		System.out.println("breadSize: " + breadSize);
//		System.out.println("breadType: " + breadType);
//		System.out.println("breadPrice: " + breadPrice);
//		System.out.println("brand: " + brand);
		
		System.out.println("isSlice: " + isSlice);
	}

}
