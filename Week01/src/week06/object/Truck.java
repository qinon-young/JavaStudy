package week06.object;

import week05.jiekou.Equipment11;

public class Truck extends Vehicle implements Upkeepable {
	
	GPSEquipment Equipment11=new GPSEquipment();
	@Override
	public void upkeepVehicle() {
		// TODO Auto-generated method stub
		System.out.println("货物运输车辆保养完成！");
	}

	@Override
	public void transport() {
		// TODO Auto-generated method stub
		System.out.println("运货人"+this.agent+"正在驾驶编号为"+this.num+"的"+this.type+"发送货物！");
		System.out.println("运输进行中。。。");
		System.out.println("货物当前的坐标为："+Equipment11.getPosition());
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
