package exercises.subject1;

public class Person {
	private String name;
	private int age;
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
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
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	@Override
	public int hashCode() {	
		return this.name.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Person)) 
			throw new ClassCastException("¿‡–Õ¥ÌŒÛ£°");
		return this.name.equals(((Person)obj).name)?true:false;
	}
	
}
