package test01;

public class D2arg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] yeji =new int[3][5];
		for(int i=0;i<yeji.length;i++) {
			for(int j=0;j<yeji[i].length;j++)
				yeji[i][j]=1+(int)(Math.random()*50);
		}
		for(int i=0;i<yeji.length;i++) {
			System.out.println();
			int sum=0;
			for(int j=0;j<yeji[i].length;j++) {
				sum+=yeji[i][j];
				System.out.print(yeji[i][j]+"\t");
			}
			System.out.print("sum="+sum);
		}
		int sum=0;
		for(int i=1;i<100;i++) {
			sum+=i;
		}
		System.out.print("sum="+sum);
		sum=0;
		
		for(int i=1;i<100;i++) {
			if(i%2==1)
			sum+=i;
		}
		System.out.print("sum="+sum);
	}

}
