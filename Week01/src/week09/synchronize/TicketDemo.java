package week09.synchronize;

public class TicketDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		{//Ticket taskTicket=new Ticket();  //同步代码块
//		Ticket2 taskTicket=new Ticket2();//同步方法
//		Thread thread1=new Thread(taskTicket,"窗口1");
//		Thread thread2=new Thread(taskTicket,"窗口2");
//		Thread thread3=new Thread(taskTicket,"窗口3");
//		Thread thread4=new Thread(taskTicket,"窗口4");
//		thread1.start();
//		thread2.start();
//		thread3.start();
//		thread4.start();
		}
		//证明同步方法的锁是this
		{
//			Ticket3 taskTicket=new Ticket3();
//			Thread thread1=new Thread(taskTicket,"窗口1");
//			Thread thread2=new Thread(taskTicket,"窗口2");
//			thread1.start();
//			try {
//				Thread.sleep(10);
//			} catch (InterruptedException e) {
//				// TODO: handle exception
//			}
//			taskTicket.flag=false;
//			thread2.start();
		}
		//死锁测试
		{
			Ticket4 taskTicket=new Ticket4(true);
			Ticket4 taskTicket2=new Ticket4(false);
			new Thread(taskTicket,"窗口1").start();
			new Thread(taskTicket2,"窗口2").start();
		}
	}

}
