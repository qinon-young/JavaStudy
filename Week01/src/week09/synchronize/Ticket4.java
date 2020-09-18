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
					System.out.println(Thread.currentThread().getName()+"����Կ��1");
					System.out.println(Thread.currentThread().getName()+"�������Կ��2"+"�ҾͿ�����Ʊ��");
					
					synchronized (lockObject2) {
						System.out.println("���ڣ�" + Thread.currentThread().getName() + "������Ʊ��" + count--);
					}
				}			
			}
		}
		else {
			while (true) {
				synchronized (lockObject2) {
					System.out.println(Thread.currentThread().getName()+"����Կ��2");
					System.out.println(Thread.currentThread().getName()+"�������Կ��1�ҾͿ�����Ʊ��");
					
					synchronized (lockObject1) {
						System.out.println("���ڣ�" + Thread.currentThread().getName() + "������Ʊ��" + count--);
					}
				}
				
			}
		}
	}

}
