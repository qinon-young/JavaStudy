package week03.jicheng;
/**
 * �������ǵģ������ĵ�
 * @author yqw
 *@version V1.0
 */
public class Demo {

	public static void main(String[] args) {
		Reporter r1=new Reporter("�ۿ�˺","��", 34, "����", "͵��");
		Programmer p1=new Programmer("Τ����", "��", 25, "����Ա", 3);
		Driver d1=new Driver("���", "��", 42, "˾��", 22);
		r1.introduce();
		p1.introduce();
		d1.introduce();
	}

}
