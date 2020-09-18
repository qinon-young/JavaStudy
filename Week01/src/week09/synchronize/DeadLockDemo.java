package week09.synchronize;

public class DeadLockDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DeadLock d1=new DeadLock(true);
		DeadLock d2=new DeadLock(false);
		new Thread(d1).start();
		new Thread(d2).start();
	}

}

class MyLock{
public static final Object A=new Object();
public static final Object B=new Object();
}
class DeadLock implements Runnable{
	private boolean flag;

	public DeadLock(boolean flag) {
		super();
		this.flag = flag;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		if(flag) {
			while (true) {
				synchronized (MyLock.A) {
					System.out.println("if...A");
					synchronized (MyLock.B) {
						System.out.println("if..b=B");
					}
				}
			}
		}
		else {
			while (true) {
				synchronized (MyLock.B) {
					System.out.println("else...B");
					synchronized (MyLock.A) {
						System.out.println("else..A");
					}
				}
			}
		}
	}
	
}
