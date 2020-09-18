package shape.duotai;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c1=new Circle(1.7);
		Rectangle r1=new Rectangle(3, 4);
		System.out.printf("%2.2f\n",c1.getArea());
		System.out.printf("%2.2f\n",c1.getPerimeter());
		
		System.out.printf("%2.2f\n",r1.getArea());
		
		System.out.printf("%2.2f\n",r1.getPerimeter());
		
	}

}
