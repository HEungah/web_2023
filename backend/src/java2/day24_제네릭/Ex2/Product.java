package java2.day24_제네릭.Ex2;

public class Product <K, M>{ // 제품 [Product] 클래스 안에 자동차객체와 티비객체도 넣어주는 객체
							// 제네릭 : 클래스 안으로 들어오는 파라미터/변수 가 정해져있지 않은 타입
							// 제네릭 타입 여러개 이면 <A~Z, A~Z, A~Z>
							// 장점 : 클래스 설계시 필드에 다양한 타입으로 선언
	// 필드
	private K kind;
	private M model;
	
	public K getKind() {
		return kind;
	}
	public void setKind(K kind) {
		this.kind = kind;
	}
	public M getModel() {
		return model;
	}
	public void setModel(M model) {
		this.model = model;
	}

	
}
