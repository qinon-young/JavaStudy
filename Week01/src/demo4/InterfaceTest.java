package demo4;

interface Shape{
	double area(double bianChang);
}
class Square implements Shape{

	@Override
	public double area(double bianChang) {
		// TODO Auto-generated method stub
		
		return bianChang*bianChang;
	}
	
}
class Circle implements Shape{

	@Override
	public double area(double bianChang) {
		// TODO Auto-generated method stub
		return 3.14*bianChang*bianChang;
	}
	
}
public class InterfaceTest {
	public static void main(String[] args) {
		Shape s1=new Square();
		Circle c1=new Circle();
		System.out.println(s1.area(2));
		System.out.println(c1.area(3));
	}
}
