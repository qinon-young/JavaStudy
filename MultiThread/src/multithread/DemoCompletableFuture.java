package multithread;

import java.util.concurrent.*;

public class DemoCompletableFuture {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		// TODO Auto-generated method stub
		CompletableFuture<Integer> completableFuture1=
				CompletableFuture.supplyAsync(()->{
					int sum=0,i=0;
					while(i++<5) {
						sum+=i;
						System.out.println(Thread.currentThread().getName()+" "+i);
					}
					return sum;
				});
		CompletableFuture<Integer> completableFuture2=
				CompletableFuture.supplyAsync(()->{
					int sum=0,i=5;
					while(i++<10) {
						sum+=i;
						System.out.println(Thread.currentThread().getName()+" "+i);
					}
					return sum;
				});
		CompletableFuture<Integer> completableFuture3=completableFuture1.
				thenCombine(completableFuture2, (resule1,resule2)->resule1+resule2);
		System.out.println("1 to 10 sum="+completableFuture3.get());
	}

}
