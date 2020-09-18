package week05.jiekou;

public class Computer11 {
	final static int MAX_SIZE =4;
	
	 Equipment11[]  usbSlot=new Equipment11[MAX_SIZE];//usb插槽
	
	void installUSB(Equipment11 equipment11) {
		try {
			int i=0;
			while (this.usbSlot[i]!=null) {
				i++;
			}
			this.usbSlot[i]=equipment11;
		} catch (Exception e1) {		
			System.out.println("接口设备已满，不能再插入新的设备！");
		}		
	}
	
	
	public  void turnOn11()
	{		
		for (int i = 0; i <MAX_SIZE; i++) {
			if(this.usbSlot[i]!=null)
				this.usbSlot[i].turnOn11();
				
		}
		System.out.println("电脑开机成功\n");
	}
	
	public  void turnOff11()
	{
		for (int i = 0; i <MAX_SIZE; i++) {
			if(this.usbSlot[i]!=null)
				this.usbSlot[i].turnOff11();
				
		}
		System.out.println("电脑关机成功");		
	}
}
