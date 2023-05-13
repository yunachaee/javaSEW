package section10;

public class SmartTV extends SmartPhone {
	int countChannel;
	
	public SmartTV() {
		System.out.println("SmartTV() 생성자 입니다.");
		
	}
	
	public SmartTV(String brand) {
		super(brand);
		System.out.println();
	}
}
