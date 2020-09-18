package week03.jicheng;

public class Person {
	private String name;
	private String sex;
	private int age;
	private String profession;
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getSex() {
		return sex;
	}


	public void setSex(String sex) {
		this.sex = sex;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getProfession() {
		return profession;
	}


	public void setProfession(String profession) {
		this.profession = profession;
	}


	public void introduce() {
		System.out.print(this.getProfession()+":");
	}


	public Person(String name, String sex, int age, String profession) {
		super();
		this.name = name;
		this.sex = sex;
		this.age = age;
		this.profession = profession;
	}
	
}
