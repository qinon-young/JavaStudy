package week08.thread;

public class Ticket implements Runnable{
	private int count=100;
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while (true) {
			if(count>0) {
				System.out.println(Thread.currentThread().getName()+":"+"Æ±ºÅ£º"+count--);
			}
			else {
				break;
			}
		}
	}
}
