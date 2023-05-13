package section10;

import section10.access1.Car;
import section10.access1.Car2;
/*
 * 싱글톤(Singleton) 디자인패턴
 * 	Application 에서 단 하나의 인스턴스(객체)만
 *  존재하도록 보장하는 패턴
 *  
 * 팩토리(Factory) 디자인패턴
 * 	캡슐화 하여 클라이언트 코드로부터 분리, 객체의 유연한 생성과 확장하는 패턴
 * 
 */

public class ExtendsClass04 {
	public static void main(String[] args) {
		Car car = Car.getInstance();
		
		Car2 car2 = Car2.createCar();
		Car2 car3 = Car2.createCar();
		Car2 car4 = Car2.createCar();

	}

}
