package week03;

public class GameDemo {
	//��Ҫ��ȫ��װ
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int sum=0;
		Child c1=new Child("Tim", 11);
		c1.joinGame();
		//sum++;
		Child c2=new Child("Jim", 12);
		c2.joinGame();
		//sum++;
		//System.out.println("������"+sum+"�˲μ���Ϸ");
		System.out.println("������"+Child.getSum()+"�˲μ���Ϸ");
	}

}
