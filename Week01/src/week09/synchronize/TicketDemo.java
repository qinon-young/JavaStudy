package week09.synchronize;

public class TicketDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		{//Ticket taskTicket=new Ticket();  //ͬ�������
//		Ticket2 taskTicket=new Ticket2();//ͬ������
//		Thread thread1=new Thread(taskTicket,"����1");
//		Thread thread2=new Thread(taskTicket,"����2");
//		Thread thread3=new Thread(taskTicket,"����3");
//		Thread thread4=new Thread(taskTicket,"����4");
//		thread1.start();
//		thread2.start();
//		thread3.start();
//		thread4.start();
		}
		//֤��ͬ������������this
		{
//			Ticket3 taskTicket=new Ticket3();
//			Thread thread1=new Thread(taskTicket,"����1");
//			Thread thread2=new Thread(taskTicket,"����2");
//			thread1.start();
//			try {
//				Thread.sleep(10);
//			} catch (InterruptedException e) {
//				// TODO: handle exception
//			}
//			taskTicket.flag=false;
//			thread2.start();
		}
		//��������
		{
			Ticket4 taskTicket=new Ticket4(true);
			Ticket4 taskTicket2=new Ticket4(false);
			new Thread(taskTicket,"����1").start();
			new Thread(taskTicket2,"����2").start();
		}
	}

}
