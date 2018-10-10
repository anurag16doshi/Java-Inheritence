package anurag;

public class Candy extends DessertItem{
	double weight;
	int ppd;
	String candi;

	public Candy(String candi,double weight,int ppd) {
		this.weight=weight;
		this.ppd=ppd;
		this.candi=candi;
	}
	
	public int getCost() {
	return (int) Math.round(ppd*weight);
	}
	
	public String getWeight() {
		return candi + " " + weight;
	}

	public int getPricePerPound() {
		// TODO Auto-generated method stub
		return ppd;
	}
	
}
