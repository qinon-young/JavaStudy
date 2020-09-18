
/*
��������ʦ�õ����ϿΡ�

�����������⡣
���Գ����⡣
������ð�̡�


*/
//�������⡣
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
			throw new LanPingException("��������");
		if(state==2)
			throw new MaoYanException("ð���ˣ����ˣ�");
		System.out.println("��������");
	}
	void reset()
	{
		System.out.println("����������");
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
			System.out.println("����");
			
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
         		//throw e;//��������˵���������׳���
			throw new NoPlanException("��ʱ�����޷�����");
			
		}
	}
	public void test()
	{
		System.out.println("����ϰ");	
	}
}

class ExceptionTest 
{
	public static void main(String[] args) 
	{
		Teacher t = new Teacher("����ʦ");
		try
		{
			t.prelect();
		}
		catch (NoPlanException e)
		{
			System.out.println("����");
		}
	}
}
