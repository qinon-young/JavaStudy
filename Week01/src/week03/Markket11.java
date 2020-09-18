package week03;

public class Markket11 {
	private String name11;
	private  Goods11 [] storeHouse11=new Goods11[100];
	//学完再回头看，这里用list会更好，数目不确定
	public String getName11() {
		return name11;
	}
	public void setName11(String name11) {
		this.name11 = name11;
	}

	public Goods11[] getStoreHouse11() {
		return storeHouse11;
	}
	public void setStoreHouse11(Goods11[] storeHouse11) {
		this.storeHouse11 = storeHouse11;
	}
	public Markket11(String name11) {
		super();
		this.name11 = name11;
	}
	public void show() {
		System.out.println("-------"+this.getName11()+"--------");
		for(int i=0;i<this.storeHouse11.length;i++) {
			System.out.println("       "+this.storeHouse11[i]);
		}
	}
	public void  sell(Customer11 c11,String buyGoods) {
		int flag=0;
		
		//如果用的是list，这里可用contains来判断是否有该商品
		for(int i=0;i<this.storeHouse11.length;i++) {
			//System.out.println(this.storeHouse11[i]);
			if(buyGoods.equals(this.storeHouse11[i].toString()))
				flag=1;
		}
		if(flag==1) {
			System.out.println(c11.getName()+"在"+this.name11+"买到了"+buyGoods);
		}
		else {
			System.out.println(c11.getName()+"在"+this.name11+"没找到"+buyGoods);
			System.out.println(c11.getName()+"失望地离开了");
		}
	}
}
