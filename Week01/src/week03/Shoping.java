package week03;

public class Shoping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Markket11 markket11=new Markket11("����");
		Goods11[] s1=new Goods11[] {new Goods11("ϴ�»�"),new Goods11("ˮ��")};
//		s1[1].setName("ϴ�»�");
//		s1[2].setName("ϴ�»�");
//		s1[3].setName("ϴ�»�");
//		s1[4].setName("ϴ�»�");
		
		//û����   �ַ�����ĳ�goods����
		//////
		markket11.setStoreHouse11(s1);
		Customer11 customer11=new Customer11("С��");
		//markket11.sell(customer11, "ˮ��");
		//System.out.println(customer11.buy());
		markket11.show();
		markket11.sell(customer11, customer11.buy());
		markket11.sell(customer11, customer11.buy());
	}

}
