package demo4;

public class Undergraduate11 extends Student11 {
	private String degree11;

	public String getDegree11() {
		return degree11;
	}

	public void setDegree11(String degree11) {
		this.degree11 = degree11;
	}
	public Undergraduate11(String name11,int age11,String degree11) {
		super(name11,age11);
		this.degree11=degree11;
	}
	public void show() {
		System.out.println("My name is "+this.getName11()+",my major is "+getDegree11()+",I'm "+this.getAge11()+" years old.");
	}
}
