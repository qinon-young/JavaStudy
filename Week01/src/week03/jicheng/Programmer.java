package week03.jicheng;

public class Programmer extends Person {
	public Programmer(String name, String sex, int age, String profession,int workingAge) {
		super(name, sex, age, profession);
		this.workingAge=workingAge;
		// TODO Auto-generated constructor stub
	}


	private int workingAge;

	
	public int getWorkingAge() {
		return workingAge;
	}


	public void setWorkingAge(int workingAge) {
		this.workingAge = workingAge;
	}


	public void introduce() {
		super.introduce();
		System.out.print("我叫"+this.getName()+",我今年"+this.getAge()+"岁，是一个");
		System.out.println(this.getSex()+this.getProfession()+",我工作"+this.getWorkingAge()+"年");
	}
}
