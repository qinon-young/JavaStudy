package week03.jicheng;
/**
 * 两个星星的，帮助文档
 * @author yqw
 *@version V1.0
 */
public class Demo {

	public static void main(String[] args) {
		Reporter r1=new Reporter("邵开撕","男", 34, "记者", "偷拍");
		Programmer p1=new Programmer("韦东庆", "男", 25, "程序员", 3);
		Driver d1=new Driver("朱金波", "男", 42, "司机", 22);
		r1.introduce();
		p1.introduce();
		d1.introduce();
	}

}
