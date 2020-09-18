package multithread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class DemoExecutor {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		// TODO Auto-generated method stub
		MyThread myThread=new MyThread();
		//用Excutors 线程执行器类创建可扩展的线程池
		ExecutorService executor=Executors.newCachedThreadPool();
		//将实现类对象提交到线程池进行管理
		Future<Object> result1=executor.submit(myThread);
		Future<Object> result2=executor.submit(myThread);
		executor.shutdown();
		System.out.println(result1.get());
		System.out.println(result2.get());
	}

}
class MyThread implements Callable<Object>{

	@Override
	public Object call() throws Exception {
		// TODO Auto-generated method stub
		int i=0;
		while(i++<5) {
			System.out.println(Thread.currentThread().getName()+" call（）runing");
		}
		return i;
	}
	
	
}
