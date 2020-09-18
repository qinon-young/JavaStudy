package week03.jicheng;

public class Reporter extends Person {
	public Reporter(String name, String sex, int age, String profession, String hobby) {
		super(name, sex, age, profession);
		this.hobby=hobby;
		// TODO Auto-generated constructor stub
	}

	private String hobby;
	
	public String getHobby() {
		return hobby;
	}

	public void setHobby(String hobby) {
		this.hobby = hobby;
	}

	public void introduce() {
		super.introduce();
		System.out.println("我是"+this.getProfession()+this.getName()+",我的爱好是"+this.getHobby()+",我的年龄是"+this.getAge()+"岁，我是一个男狗仔");
	}

	
	
}
