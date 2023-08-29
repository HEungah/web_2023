package java2.day28_컬렉션프레임워크.Ex4;

public class Coin {
	private int value;

	public Coin(int value) {
		super();
		this.value = value;
	}
	
	public int getValue() {
		return value;
	}

	@Override
	public String toString() {
		return "Coin [value=" + value + "]";
	}
	

}
