package week08.thread;

public class ThreadDemo {

	public static void main(String[] args) throws InterruptedException {
//		Ticket t=new Ticket();
//		new Thread(t,"����1").start();
//		new Thread(t,"����2").start();
//		new Thread(t,"����3").start();
//		new Thread(t,"����4").start();
		NoteDistribute note=new NoteDistribute();
		new Thread(note,"����ʦ").start();
		new Thread(note,"����ʦ").start();
		new Thread(note,"Τ��ʦ").start();
		
	}

}

