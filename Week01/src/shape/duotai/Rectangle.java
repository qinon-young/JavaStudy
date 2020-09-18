package shape.duotai;

public class Rectangle extends Shape{
	double wide;
	double high;
	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return 2*wide*high;
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return wide*high;
	}

	public Rectangle(double wide, double high) {
		super();
		this.wide = wide;
		this.high = high;
	}

}
