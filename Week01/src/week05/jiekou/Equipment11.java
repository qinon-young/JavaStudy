package week05.jiekou;

public class Equipment11 implements USB11{
	
	private String name;
	
	public Equipment11(String name) {
		super();
		this.name = name;
	}

	@Override
	public void turnOn11() {
		// TODO Auto-generated method stub
		System.out.println(this.name+"������");
	}

	@Override
	public void turnOff11() {
		// TODO Auto-generated method stub
		System.out.println(this.name+"�ر���");
	}

}
interface USB11{
	 public abstract void turnOn11();
	 void turnOff11();	
}