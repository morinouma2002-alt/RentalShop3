package Manager;

public class Manager {

	private long assets=0;//資産
	
	private int[] price = { 150, 100, 50 };
	
	public void setAssets(int money) {
		assets+=money;
	}
	
	public void postAssets() {
		assets+=500;
	}

	public void cal(int value,boolean register) {
		
		if(register) {
			System.out.println("会員なので、新作は20%オフ");
		}else {
			System.out.println("非会員なので、旧作は20&オフ");
		}
		
		int money=0;
		if(value==1) {
			
			if(register) {
				money=(int)(price[0]*0.8);
			}else {
				money=price[0];
			}
			
		}else if(value==2) {
			money=price[1];
			
		}else {
			
			if(register) {
				money=price[2];
			}else {
				money=(int)(price[2]*0.8);
			}
		}
		
		setAssets(money);
		
		System.out.println("商品の値段は"+money+"円です");
		
	
	}
}
