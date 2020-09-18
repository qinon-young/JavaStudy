package week08.thread;

public class ThreadDemo {

	public static void main(String[] args) throws InterruptedException {
//		Ticket t=new Ticket();
//		new Thread(t,"窗口1").start();
//		new Thread(t,"窗口2").start();
//		new Thread(t,"窗口3").start();
//		new Thread(t,"窗口4").start();
		NoteDistribute note=new NoteDistribute();
		new Thread(note,"杨老师").start();
		new Thread(note,"朱老师").start();
		new Thread(note,"韦老师").start();
		
	}

}

