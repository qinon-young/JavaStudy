package test01;

public class DeGuiTest {
	public static int getFeiBoNaQi(int n) {
	    if(n==1) return 1;
	    if(n==2) return 1;
	    return getFeiBoNaQi(n-1)+getFeiBoNaQi(n-2);
	    
	}
	
//    public static int testFibonacci3(int n) {
//        if (n == 1 || n == 2) {
//            return 1;
//        }else {
//            return test3(n-1) + test3(n-2);
//        }
//    }
	//int methodNumber=1;
//	public static int getFibonacciSequenceByNumber(int number){
//	       // System.out.println("方法调用次数："+methodNumber);
//	       // methodNumber++;
//	        if(number>0){
//	            if(number <2){
//	                return number;
//	            }
//	            return setReNum(number-1)+setReNum(number-2);
//	        }
//	        return 0;
//	    }
	  public static int Recursion(int n){

	        if(n==1){
	            return 0;
	        }

	        if(n==2){
	            return 1;
	        }
	        return Recursion(n-1)+Recursion(n-2);
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("斐波那契数列：");
		for(int i=1;i<10;i++) {
			//System.out.print(Recursion(i)+" ");
			System.out.print(getFeiBoNaQi(i)+" ");;
		}
	}

}
