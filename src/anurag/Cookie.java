package anurag;

public class Cookie extends DessertItem{
	String cooki;
	int num;
	int dozen;

	public Cookie(String cooki, int num ,int dozen ) {
		this.cooki=cooki;
		this.num= num;
		this.dozen=dozen;
	}
	
	public int getCost() {
		/*double num1 = 0;
		if (num<=13)
		{
			num1=num/12;
		}*/
		int val1cokie = dozen/12;
		int z= num*val1cokie;
		
		return (int) z;
	}

	public String getNumber() {
		// TODO Auto-generated method stub
		return cooki  + " " + num;
	}

	public int getPricePerDozen() {
		// TODO Auto-generated method stub
		return dozen;
	}
}
