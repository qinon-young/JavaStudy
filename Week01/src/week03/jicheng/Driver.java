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
		System.out.print("����"+this.getSex()+this.getProfession()+this.getName());
		System.out.println(",�ҽ���"+this.getAge()+"�꣬�ҵļ�����"+this.getDriveringAge()+"��");
	}
}
