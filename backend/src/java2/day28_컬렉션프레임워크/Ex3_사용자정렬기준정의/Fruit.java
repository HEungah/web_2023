package java2.day28_컬렉션프레임워크.Ex3_사용자정렬기준정의;

public class Fruit {
	public String name;
	public int price;
	
	public Fruit(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Fruit [name=" + name + ", price=" + price + "]";
	}
	
	

}
