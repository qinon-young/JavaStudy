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
		//��Excutors �߳�ִ�����ഴ������չ���̳߳�
		ExecutorService executor=Executors.newCachedThreadPool();
		//��ʵ��������ύ���̳߳ؽ��й���
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
			System.out.println(Thread.currentThread().getName()+" call����runing");
		}
		return i;
	}
	
	
}
