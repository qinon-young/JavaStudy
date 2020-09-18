package week02;

public class Student11 {
	private String name11;
	private double score11;
	public Student11(String name11) {
		super();
		this.name11 = name11;
	}
	public String getName11() {
		return name11;
	}
	public void setName11(String name11) {
		this.name11 = name11;
	}
	public double getScore11() {
		return score11;
	}
	public void setScore11(double score11) {
		if(score11<0||score11>100)
			this.score11=0;
		else
			this.score11 = score11;
	}
	public Student11() {
		
	}
	public Student11(String name11, double score11) {
		this.name11=name11;
		this.score11=score11;
	}
	public void sayHello() {
		System.out.println("我叫"+this.getName11()+",我考了"+this.getScore11()+"分。");
	}
	public void run() {
		// TODO Auto-generated method stub
		
	}
	public void talk(int i, String string, long l) {
		// TODO Auto-generated method stub
		
	}
}
