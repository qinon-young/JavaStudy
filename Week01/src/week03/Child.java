package week03;

public class Child {
	private String name;
	private int age;
	private static int sum=0;
	
	public static int getSum() {
		return sum;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Child(String name, int age) {
		super();
		this.name = name;
		this.age = age;
		sum++;
	}
	public void joinGame() {
		System.out.println(name+"加入了游戏");
	}
	
}
