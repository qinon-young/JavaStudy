package week05.duotai;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LifeDuck d1=new LifeDuck();
		MuTouDuck d2=new MuTouDuck();
		XiangPiDuck d3=new XiangPiDuck();
		shou(d3);
		shou(d2);
		shou(d1);
	}
	public static  void shou(Duck d) {
		d.shot();
}
}
