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
		player.setSong("远走高飞");
		player.setSong("世上只有妈妈好");
		player.setSong("呐喊");
		player.setSong("非你不可");
		player.setSong("奋斗");
		show(player);
		try {
			System.out.println("正在播放的歌曲是："+player.play(input()));
		} catch (Exception e) {
			System.out.println("异常信息为："+e.getMessage());
		}
	}

static void show(Player player) {
	for (int i = 0; i <5; i++) {
		System.out.println("\t\t"+(i+1)+":"+player.getSong().get(i));		
	}
	SimpleDateFormat sdf=new SimpleDateFormat("yyyy年MM月dd日 E");	
	System.out.println("\t\t\t\t今日："+sdf.format(new Date()));
	System.out.println("\t\t---------------------------");
	System.out.println("\t\t请输入歌号：");
}
static int input() {
	Scanner in=new Scanner(System.in);
	int index=in.nextInt();
	return index;
}
}
