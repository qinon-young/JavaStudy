package week05.jiekou;

public class Computer11 {
	final static int MAX_SIZE =4;
	
	 Equipment11[]  usbSlot=new Equipment11[MAX_SIZE];//usb���
	
	void installUSB(Equipment11 equipment11) {
		try {
			int i=0;
			while (this.usbSlot[i]!=null) {
				i++;
			}
			this.usbSlot[i]=equipment11;
		} catch (Exception e1) {		
			System.out.println("�ӿ��豸�����������ٲ����µ��豸��");
		}		
	}
	
	
	public  void turnOn11()
	{		
		for (int i = 0; i <MAX_SIZE; i++) {
			if(this.usbSlot[i]!=null)
				this.usbSlot[i].turnOn11();
				
		}
		System.out.println("���Կ����ɹ�\n");
	}
	
	public  void turnOff11()
	{
		for (int i = 0; i <MAX_SIZE; i++) {
			if(this.usbSlot[i]!=null)
				this.usbSlot[i].turnOff11();
				
		}
		System.out.println("���Թػ��ɹ�");		
	}
}
