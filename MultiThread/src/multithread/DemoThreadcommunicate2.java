package multithread;


import java.util.ArrayList;
import java.util.List;

public class DemoThreadcommunicate2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Object> goods=new ArrayList<Object>();
		long start=System.currentTimeMillis();
		Thread thread1=new Thread(()->{
			int num=0;
			while(System.currentTimeMillis()-start<=100) {
				synchronized (goods) {
					if(goods.size()>0) {
						try {
							goods.wait();
						} catch (Exception e) {
						// TODO: handle exception
						}
					}
					else {
						goods.add("good"+(++num));
						System.out.println("produce good"+num);
					}
			}	
			}
			
		},"生产者") ;
		
		Thread thread2=new Thread(()->{
			int num=0;
			while(System.currentTimeMillis()-start<=100) {
				synchronized (goods) {
					if(goods.size()<=0) {
						try {
							goods.notify();;
						} catch (Exception e) {
						// TODO: handle exception
						}
					}
					else {
						goods.remove("good"+(++num));
						System.out.println("consume good"+num);
					}
			}	
			}
			
		},"消费者") ;

		thread1.start();
		thread2.start();
	}

}
