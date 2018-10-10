package anurag;

import java.util.Vector;

public class Checkout {
	Vector<DessertItem> d;
	int numberofItems;
	int reciept_length = 40;
	
	public Checkout() {
		d=new Vector<DessertItem>();
		numberofItems = 0;
	}
	
	public int numberOfItems() {
		return numberofItems;
		}
	
	public void enterItem(DessertItem item) {
		this.d.add(item);
		numberofItems++;
	}
	
	public int totalCost() {
		int total = 0;
		for(int i = 0; i < numberofItems; i++) {
				total+=d.get(i).getCost();
		}
		return total;
	}
	
	public int totalTax() {
		return (int)Math.round(this.totalCost() * DessertShoppe.TAX_RATE / 100.00);
	}
	
	public void clear() {
		this.d.clear();
		numberofItems = 0;
	}
	
	public String toString() {
        String s = "";		
		
		
		s += "    " + DessertShoppe.STORE_NAME + "\n";
		s += "    " + "--------------------" + "\n";

		for(int i = 0; i < numberofItems; i++){
			
			// items of every line
			String m= d.get(i).getName();

			String n = DessertShoppe.cents2dollarsAndCents(d.get(i).getCost());
			if(n.length() > DessertShoppe.COST_WIDTH)
				n = n.substring(0, DessertShoppe.COST_WIDTH);
			
			if(d.get(i) instanceof IceCream) {
				s+=(((IceCream) d.get(i)).IceCreamName());
				while(m.length() < reciept_length - n.length()){
					m += " ";
				}
				s += m  + "\t" + n + "\n";	
			}
			else if(d.get(i) instanceof Sundae) {
				
				s+= (((Sundae)d.get(i)).getTopping());
				while(m.length() < reciept_length - n.length()){
					m += " ";
				}
				s += m  + "\t" + "\n";
			}
													// print if Candy
			else if(d.get(i)instanceof Candy) {
				s += (((Candy)d.get(i)).getWeight()) +"lbs @" + DessertShoppe.cents2dollarsAndCents(((Candy)d.get(i)).getPricePerPound())+"/lb.\n";
				
				while(m.length() < reciept_length - n.length()){
					m += " ";
				}
				s += m  + "\t" + n + "\n";	
			}
			// print if Cookie
			else {
					s += (((Cookie)d.get(i)).getNumber())+"@"+ DessertShoppe.cents2dollarsAndCents(((Cookie)d.get(i)).getPricePerDozen())+ " /dz\n";
				while(m.length() < reciept_length - n.length()){
					m += " ";
				}
				s += m  + "\t" + n + "\n";			
			}	
			}
		String line = "\nTax";
		String Tax = DessertShoppe.cents2dollarsAndCents(this.totalTax());
		while(line.length() <= reciept_length - Tax.length())
			line += " ";
		s += line + "\t" + Tax;
		
		String overallCost = DessertShoppe.cents2dollarsAndCents(this.totalCost() + this.totalTax());
		line = "\nTotal Cost";
		while(line.length() <= reciept_length - overallCost.length())
			line += " ";
		s += line + "\t" + overallCost; 
	
		return s;
	}
}
