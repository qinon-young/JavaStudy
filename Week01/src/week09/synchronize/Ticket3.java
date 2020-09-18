package week09.synchronize;

public class Ticket3 implements Runnable{
	private int count=100;
	static boolean flag=true;
	
	public synchronized void sale() {
		
		if (count > 0) {
			try {
				Thread.sleep(10);
				System.out.println("同步函数：" + Thread.currentThread().getName() + "正在卖票号" + count--);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} 
	
}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		if (flag) {
			while (true) {
				sale();
				if (count<1) {
					break;
				}
			}
		}
		else {
			while (true) {
				synchronized (this) {
					if (count > 0) {
						try {
							Thread.sleep(10);
							System.out.println("同步代码块：" + Thread.currentThread().getName() + "正在卖票号" + count--);
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

}
