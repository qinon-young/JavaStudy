package week06.object;

public class Expressage {
	String expressID;
	double weight ;
	
	public Expressage(double weight) {
		super();	
		this.weight = weight;
	}
	public void beforTransport() {
	System.out.println("������ʼ�����ֿ�����С�����");	
	System.out.println("����������"+this.weight+"kg")	;
	System.out.println("���������ϣ�");
	this.expressID=getExpressID();
	System.out.println("����װ����ϣ�");
	System.out.println("�˻�����֪ͨ��");
	System.out.println("��ݵ��ţ�"+this.expressID);
	System.out.println("=================");
	}
	public String getExpressID() {
		return "ZRH245426";
	}
	public void duringTransport(Truck truck) {
		truck.transport();
		System.out.println("=================");
	}
	public void afterArrive(Truck truck) {
		System.out.println("����������������ɣ�");
		System.out.println("�˻���"+truck.agent+"����ʻ�ı��Ϊ"+truck.num+"��"+truck.type+"�ѹ黹��");
		truck.upkeepVehicle();
	
	}
	
}
