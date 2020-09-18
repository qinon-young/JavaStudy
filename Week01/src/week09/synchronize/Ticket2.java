package week09.synchronize;

public class Ticket2 implements Runnable{
	private int count=100;
	public synchronized void sale() {
		
			if (count > 0) {
				try {
					Thread.sleep(100);
					System.out.println("´°¿Ú£º" + Thread.currentThread().getName() + "ÕıÔÚÂôÆ±ºÅ" + count--);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} 
		
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while (true) {
			sale();
			if(count<1) {
				break;
			}
		}
		
	}

}
