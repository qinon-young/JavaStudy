package week02;

public class Person {
	private String name;
	private int age;
	private int tel;
	public int getTel() {
		return tel;
	}
	public void setTel(int tel) {
		this.tel = tel;
	}
	public Person() {
		
	}
	public Person(String name,int age) {
		this.name=name;
		this.age=age;
	}
	public String getName() {
		return this.name ;
	}
	public void setName(String name) {
		this.name =name;
	}
	public int getAge() {
		return this.age ;
	}
	public void setAge(int age) {
		this.age =age;
	}
	public void sayHello() {
		System.out.println("我叫"+this.getName()+",我今年"+this.getAge()+"岁了。");
	}
	
}
