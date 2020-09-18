package week03;

public class Shoping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Markket11 markket11=new Markket11("永辉");
		Goods11[] s1=new Goods11[] {new Goods11("洗衣机"),new Goods11("水果")};
//		s1[1].setName("洗衣机");
//		s1[2].setName("洗衣机");
//		s1[3].setName("洗衣机");
//		s1[4].setName("洗衣机");
		
		//没改完   字符数组改成goods数组
		//////
		markket11.setStoreHouse11(s1);
		Customer11 customer11=new Customer11("小吴");
		//markket11.sell(customer11, "水果");
		//System.out.println(customer11.buy());
		markket11.show();
		markket11.sell(customer11, customer11.buy());
		markket11.sell(customer11, customer11.buy());
	}

}
