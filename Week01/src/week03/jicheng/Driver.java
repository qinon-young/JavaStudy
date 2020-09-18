package week03.jicheng;

public class Driver extends Person{
	public Driver(String name, String sex, int age, String profession, int driveringAge) {
		super(name, sex, age, profession);
		this.driveringAge=driveringAge;
		// TODO Auto-generated constructor stub
	}

	private int driveringAge;

	public int getDriveringAge() {
		return driveringAge;
	}

	public void setDriveringAge(int driveringAge) {
		this.driveringAge = driveringAge;
	}
	
	public void introduce() {
		super.introduce();
		System.out.print("我是"+this.getSex()+this.getProfession()+this.getName());
		System.out.println(",我今年"+this.getAge()+"岁，我的驾龄有"+this.getDriveringAge()+"年");
	}
}
