package week03;

public class GameDemo {
	//需要完全封装
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int sum=0;
		Child c1=new Child("Tim", 11);
		c1.joinGame();
		//sum++;
		Child c2=new Child("Jim", 12);
		c2.joinGame();
		//sum++;
		//System.out.println("现在有"+sum+"人参加游戏");
		System.out.println("现在有"+Child.getSum()+"人参加游戏");
	}

}
