package week06.object;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		Expressage expressage=new Expressage(12.5);
		Truck truck=new Truck("��C5B118","��", "����");
		expressage.beforTransport();
		expressage.duringTransport(truck);
		expressage.afterArrive(truck);
	}

}
