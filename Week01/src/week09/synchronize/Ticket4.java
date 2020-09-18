package week09.synchronize;

public class Ticket4 implements Runnable{
	private int count=100;
	private boolean flag;
    static	Object lockObject1=new Object();
    static Object lockObject2=new Object();
	public Ticket4(boolean flag) {
		super();
		this.flag = flag;
	}	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		if (flag) {
			while (true) {
				synchronized (lockObject1) {
					System.out.println(Thread.currentThread().getName()+"我有钥匙1");
					System.out.println(Thread.currentThread().getName()+"如果我有钥匙2"+"我就可以卖票了");
					
					synchronized (lockObject2) {
						System.out.println("窗口：" + Thread.currentThread().getName() + "正在卖票号" + count--);
					}
				}			
			}
		}
		else {
			while (true) {
				synchronized (lockObject2) {
					System.out.println(Thread.currentThread().getName()+"我有钥匙2");
					System.out.println(Thread.currentThread().getName()+"如果我有钥匙1我就可以卖票了");
					
					synchronized (lockObject1) {
						System.out.println("窗口：" + Thread.currentThread().getName() + "正在卖票号" + count--);
					}
				}
				
			}
		}
	}

}
