package demo3_11;

public class Bank11 {
	private static String bankName11="招商银行";
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
	//构造函数开户
	public Bank11(String userName11, String password11, double money) {
		super();
		this.userName11 = userName11;
		this.password11 = password11;
		this.balance11 = money-10;
		System.out.println(this.userName11+"开户成功！账户余额："+this.balance11);
	}
	//存款
	public void deposit11(double money) {
		this.balance11+=money;
		System.out.println(this.userName11+"您好！您已存入"+money+"元,账号当前余额："+this.getBalance11());
	}
	//取
	public  void withdrawals11(String password,double money) {
		if(this.checkPassword(password)) {
			if(this.getBalance11()<money) {
				System.out.println("您的账户余额不足！");
				return;
			}
			else {
				this.balance11-=money;
				System.out.println(this.userName11+"您好！您已取出"+money+"元，当前余额："+this.getBalance11());
			}
		}
		else {
			System.out.println("您输入的密码有误！");
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
		System.out.println("欢迎来到"+bankName11+"!----------");
	}
	public static void sayGoodbay() {
		System.out.println("请携带好随身物品，欢迎下次光临"+bankName11+"!----------");
	}
}
