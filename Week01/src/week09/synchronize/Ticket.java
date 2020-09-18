package week09.synchronize;

public class Ticket  implements Runnable{
	private int count=100;
	Object lockObject=new Object();
	@Override
	
	public void run() {
		// TODO Auto-generated method stub
			while (true) {
				synchronized (lockObject) {
					if (count > 0) {
						try {
							Thread.sleep(100);
							System.out.println("´°¿Ú£º" + Thread.currentThread().getName() + "ÕıÔÚÂôÆ±ºÅ" + count--);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					} 
					else {
						break;
					}
				}
			}
		
	}

}
