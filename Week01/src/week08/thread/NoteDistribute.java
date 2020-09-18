package week08.thread;

public class NoteDistribute implements Runnable{
	private int count=80;
	//@Override
	Object lockObject=new Object();
	public void  run() {
		// TODO Auto-generated method stub
		while (true) {
			synchronized (lockObject) {
				if(count>0) {
					System.out.println(Thread.currentThread().getName()+"在发第"+count--+"份笔记");
					try {
						Thread.currentThread().sleep(100);
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
