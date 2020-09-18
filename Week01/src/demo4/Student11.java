package demo4;

public class Student11 {
	private String name11;
	public String getName11() {
		return name11;
	}
	public void setName11(String name11) {
		this.name11 = name11;
	}
	public int getAge11() {
		return age11;
	}
	public void setAge11(int age11) throws Exception{
		if(age11<0) {
			throw new Exception("输入的年龄有误！");
		}
		else {
			this.age11 = age11;
		}
		
	}
	private int age11;
	public Student11(String name11,int age11) {
		this.age11=age11;
		this.name11=name11;
	}
	public Student11() {
		
	}
	public void show() {
		System.out.println("My name is "+this.getName11()+",I'm "+this.getAge11()+" years old.");
	}
}
