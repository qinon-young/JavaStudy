package demo3_11;

public class Bank11 {
	private static String bankName11="��������";
	private String userName11;
	private String password11;
	private double balance11;
	public static String getBankName11() {
		return bankName11;
	}
	public String getUserName11() {
		return userName11;
	}
	public String getPassword11() {
		return password11;
	}
	public double getBalance11() {
		return balance11;
	}
	//���캯������
	public Bank11(String userName11, String password11, double money) {
		super();
		this.userName11 = userName11;
		this.password11 = password11;
		this.balance11 = money-10;
		System.out.println(this.userName11+"�����ɹ����˻���"+this.balance11);
	}
	//���
	public void deposit11(double money) {
		this.balance11+=money;
		System.out.println(this.userName11+"���ã����Ѵ���"+money+"Ԫ,�˺ŵ�ǰ��"+this.getBalance11());
	}
	//ȡ
	public  void withdrawals11(String password,double money) {
		if(this.checkPassword(password)) {
			if(this.getBalance11()<money) {
				System.out.println("�����˻����㣡");
				return;
			}
			else {
				this.balance11-=money;
				System.out.println(this.userName11+"���ã�����ȡ��"+money+"Ԫ����ǰ��"+this.getBalance11());
			}
		}
		else {
			System.out.println("���������������");
		}
	}
	
	public  boolean checkPassword(String password) {
		if(password.equals(this.password11)) {
			return true;
		}
		else 
			return false;
	}
	public static void sayHello() {
		System.out.println("��ӭ����"+bankName11+"!----------");
	}
	public static void sayGoodbay() {
		System.out.println("��Я����������Ʒ����ӭ�´ι���"+bankName11+"!----------");
	}
}
