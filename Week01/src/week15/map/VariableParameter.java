package week15.map;

public class VariableParameter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//实现任意整数相加
		System.out.println(Character.hashCode('a'));
	}
	//方法的参数不确定
	public static int addInt(int... arr) {//可变长，实际为数组，  大于等于0
		int sum=0;
		for (int i = 0; i < arr.length; i++) {
			sum+=arr[i];
		}
		return sum;
	}
	public static int addInt(int a ,int b,int... arr) {//大于等于2  
		int sum=0;
		for (int i = 0; i < arr.length; i++) {
			sum+=arr[i];
		}
		
		return sum;
	}
}
