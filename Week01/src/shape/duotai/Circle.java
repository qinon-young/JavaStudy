package shape.duotai;

public class Circle extends Shape {
	double r;
	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return 2*3.14*r;
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return 3.14*r*r;
	}

	public Circle(double r) {
		super();
		this.r = r;
	}

}
