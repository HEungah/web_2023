package java2.day24_제네릭.Ex2;

public class Ex2_제네릭 {
	public static void main(String[] args) {
		
		// 1. Product 객체 (Tv객체를 가지고 있는)
			// 1. product 객체를 만들때 필드에 사용할 타입을 구체적으로 대입
		Product<Tv, String> product1 = new Product<>();
			// 2. product 객체[ Tv kind, String model ]
		product1.setKind(new Tv());
		product1.setModel("스마트Tv");
		
		Tv tv = product1.getKind();
		String tvModel = product1.getModel();
		
		// 2. Product 객체 (Car객체를 가지고 있는)
		Product<Car, String> product2 = new Product<>();
		product2.setKind(new Car());
		product2.setModel("SUV자동차");
		
		Car car = product2.getKind();
		String carModel = product2.getModel();
	}

}
