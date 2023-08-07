package java1.day18.Ex1;

// 클래스에서 인터페이스를 구현하기 
public class Television implements RemoteControl/*, 인터페이스2*/{	// 다중인터페이스 가능
	// 클래스명 implements 인터페이스명
	// 인터페이스가 선언한 추상메소드를 해당 클래스가 구현 대신하기.
	private int volume;
	
	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다.");	
	}
	
	@Override
		public void turnOff() {
			System.out.println("TV를 끕니다.");
	}
	
	@Override
		public void setVolume(int volume) {
			if(volume > RemoteControl.MAX_VOLUME) {
				this.volume = RemoteControl.MAX_VOLUME;	// this : 해당메소드를 호출한 객체
			}else if(volume < RemoteControl.MIN_VOLUME) {
				this.volume = RemoteControl.MIN_VOLUME;
			}else {
				this.volume = this.volume;
			}
			System.out.println("현재 TV 볼륨 : " + this.volume);
		}
	// !!!! : implements 키워드를 사용했으면 추상메소드를 꼭 구현해야한다
}
