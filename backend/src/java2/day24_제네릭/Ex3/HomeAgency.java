package java2.day24_제네릭.Ex3;

// 집 렌탈 해주는 대리점
public class HomeAgency implements Rentable<Home>{
	// 추상메소드 구현
	@Override
	public Home rent() {
		return new Home();
	}

}
