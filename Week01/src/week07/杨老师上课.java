
/*
需求：杨老师用电脑上课。

所产生的问题。
电脑出问题。
蓝屏，冒烟。


*/
//描述问题。
class LanPingException extends Exception
{
	LanPingException(String msg)
	{
		super(msg);
	}
}

class MaoYanException extends Exception
{
	MaoYanException(String msg)
	{
		super(msg);
	}
}

class NoPlanException extends Exception
{
	NoPlanException(String msg)
	{
		super(msg);
	}
}
//
class Computer
{
	int state = 1;
	void run()throws LanPingException,MaoYanException
	{
		if(state==1)
			throw new LanPingException("蓝屏啦！");
		if(state==2)
			throw new MaoYanException("冒烟了，废了！");
		System.out.println("电脑运行");
	}
	void reset()
	{
		System.out.println("电脑重启！");
		state = 0;
	}
}
//
class Teacher
{
	private String name;
	private Computer cmpt;
	Teacher(String name)
	{
		this.name = name;
		cmpt = new Computer();
	}

	public void prelect()throws NoPlanException
	{
		try
		{
			cmpt.run();
			System.out.println("讲课");
			
		}
		catch (LanPingException e)
		{
			System.out.println(e.toString());
			cmpt.reset();
			prelect();
		}
		catch (MaoYanException e)//MaoYanException e = new MaoYanException("");
		{
			System.out.println(e.toString());
			test();
         		//throw e;//将解决不了的问题继续抛出。
			throw new NoPlanException("课时进度无法继续");
			
		}
	}
	public void test()
	{
		System.out.println("做练习");	
	}
}

class ExceptionTest 
{
	public static void main(String[] args) 
	{
		Teacher t = new Teacher("杨老师");
		try
		{
			t.prelect();
		}
		catch (NoPlanException e)
		{
			System.out.println("换人");
		}
	}
}
