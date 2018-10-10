package anurag;

public class Sundae extends IceCream {
	String sundae;
	int val1;
	String top;
	int val2;
	
	public Sundae (String sundae, int val1, String top,int val2) {
		//super();
		
		
		super(top +" sundae with "+ sundae,val1+val2);
		
		this.sundae= sundae;
		this.val1=val1;
		this.top= top;
		this.val2=val2;
		
		}
	
public int getCost() {
	int cost= val1+val2;
	return cost;
}
	
	public String getTopping() {
		// TODO Auto-generated method stub
		
		return sundae;
	}
	
	public String getsundaename() {
		return sundae;
	}

}
