package week07.exception;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle11 circle11=new Circle11(11);
		Rectangle11 rectangle11=new Rectangle11(2, 3);
		System.out.println(circle11.area11());
		System.out.println(rectangle11.area11());
		//rectangle11.setHeight11(-1);
		System.out.println(rectangle11.area11());
		
	}

}
