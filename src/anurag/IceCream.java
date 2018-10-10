package anurag;

class IceCream extends DessertItem{

	int value;
	String IceCreamName;
	//private int Cost;
	/*public public IceCream() {
	}*/
	
	public IceCream(String IceCreamName, int value) {
		this.value = value;
		this.IceCreamName = IceCreamName;
	}
	@Override
	public int getCost() {
		
		return value;
	}
	
	public String IceCreamName() {
		return IceCreamName;
	}

}
