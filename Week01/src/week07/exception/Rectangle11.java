package week07.exception;

public class Rectangle11 implements Shape11 {
	private double wide11;
	private double height11;
	
	public Rectangle11(double wide11, double height11) {
		super();
		this.wide11 = wide11;
		this.height11 = height11;
	}
	
	public double getWide11() {
		return wide11;
	}

	public void setWide11(double wide11) {
		this.wide11 = wide11;
	}

	public double getHeight11() {
		return height11;
	}

	public void setHeight11(double height11) {
		this.height11 = height11;
	}

	@Override
	public double area11() {
		// TODO Auto-generated method stub
		if (this.wide11<=0||this.height11<=0) {
			throw new LawlessValueException("这个数值是非法的！");
		}
		return this.height11*this.wide11;
	}

}
