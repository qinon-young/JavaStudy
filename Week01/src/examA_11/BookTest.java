package examA_11;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Scanner;

public class BookTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Player player=new Player();
		player.setSong("Զ�߸߷�");
		player.setSong("����ֻ�������");
		player.setSong("�ź�");
		player.setSong("���㲻��");
		player.setSong("�ܶ�");
		show(player);
		try {
			System.out.println("���ڲ��ŵĸ����ǣ�"+player.play(input()));
		} catch (Exception e) {
			System.out.println("�쳣��ϢΪ��"+e.getMessage());
		}
	}

static void show(Player player) {
	for (int i = 0; i <5; i++) {
		System.out.println("\t\t"+(i+1)+":"+player.getSong().get(i));		
	}
	SimpleDateFormat sdf=new SimpleDateFormat("yyyy��MM��dd�� E");	
	System.out.println("\t\t\t\t���գ�"+sdf.format(new Date()));
	System.out.println("\t\t---------------------------");
	System.out.println("\t\t�������ţ�");
}
static int input() {
	Scanner in=new Scanner(System.in);
	int index=in.nextInt();
	return index;
}
}
