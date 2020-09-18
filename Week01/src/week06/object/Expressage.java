package week06.object;

public class Expressage {
	String expressID;
	double weight ;
	
	public Expressage(double weight) {
		super();	
		this.weight = weight;
	}
	public void beforTransport() {
	System.out.println("订单开始处理，仓库验货中。。。");	
	System.out.println("货物重量："+this.weight+"kg")	;
	System.out.println("货物检验完毕！");
	this.expressID=getExpressID();
	System.out.println("货物装填完毕！");
	System.out.println("运货人已通知！");
	System.out.println("快递单号："+this.expressID);
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
		System.out.println("货物运输任务已完成！");
		System.out.println("运货人"+truck.agent+"所驾驶的编号为"+truck.num+"的"+truck.type+"已归还！");
		truck.upkeepVehicle();
	
	}
	
}
