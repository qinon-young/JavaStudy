package week09.synchronize;

public class Note1 {
	private int count=80;
	//@Override
	Object lockObject=new Object();
	public void  run() {
		// TODO Auto-generated method stub
		while (true) {
			synchronized (lockObject) {
				if(count>0) {
					System.out.println(Thread.currentThread().getName()+"�ڷ���"+count--+"�ݱʼ�");
					try {
						Thread.sleep(100);
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
