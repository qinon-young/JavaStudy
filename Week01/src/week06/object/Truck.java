package week06.object;

import week05.jiekou.Equipment11;

public class Truck extends Vehicle implements Upkeepable {
	
	GPSEquipment Equipment11=new GPSEquipment();
	@Override
	public void upkeepVehicle() {
		// TODO Auto-generated method stub
		System.out.println("�������䳵��������ɣ�");
	}

	@Override
	public void transport() {
		// TODO Auto-generated method stub
		System.out.println("�˻���"+this.agent+"���ڼ�ʻ���Ϊ"+this.num+"��"+this.type+"���ͻ��");
		System.out.println("��������С�����");
		System.out.println("���ﵱǰ������Ϊ��"+Equipment11.getPosition());
	}

	public Truck() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Truck(String num, String type,String agent) {
		super();
		this.num = num;
		this.type = type;
		this.agent = agent;
	}

}
