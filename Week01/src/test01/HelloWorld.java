package test01;

public class HelloWorld {
	
		public static void main(String[] args) {
//			System.out.println("aa");
			int [] int1=new int[10];
//			System.out .println(int1[0]);
//			int1[0]=23;
			System.out.println(int1[0]);
			for(int i=0;i<int1.length;i++) {
				int1[i]=1+(int)(Math.random()*100);
//				System.out.println(int1[i]);
			}
			for(int i=0;i<int1.length;i++) {
				System.out.print(int1[i]+" ");
			}
			for(int i=0;i<int1.length;i++) {
				for(int j=i+1;j<int1.length;j++) {
					if(int1[i]>int1[j]) {
						int t =int1[i];
						int1[i]=int1[j];
						int1[j]=t;
					}
				}
			}
			System.out.println("≈≈–Ú∫Û");
			for(int i=0;i<int1.length;i++) {
				
				System.out.print(int1[i]+" ");
			}
			
			
//			System.out.println(int1[100]);
		}
//		publ
}
 
/*
 * public static void main(String args[])
 
{
	System.out.println("223");
}
*/ 