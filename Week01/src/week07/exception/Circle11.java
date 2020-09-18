package week07.exception;

public class Circle11 implements Shape11{
	private double radius11;
	
	public Circle11(double radius11) {
		super();
		this.radius11 = radius11;
	}
	
	public double getRadius11() {
		return radius11;
	}

	public void setRadius11(double radius11) {
		this.radius11 = radius11;
	}

	@Override
	public double area11() {
		// TODO Auto-generated method stub
		if(radius11<=0) {
			throw new LawlessValueException("这个数值是非法的！");
		}
		return 3.14*radius11*radius11;
	}

}
