package desafios_propostos;

public class Bill {
	
	public char gender;
	public int beer;
	public int barbecue;
	public int softDrink;
	
	
	public double cover(double consumptionValue) {
		double coverCost;
		if(consumptionValue > 30.00) {
			coverCost = 0.00;
		}
		else {
			coverCost = 4.00;
		}
		return coverCost;
		
	}
	
	public double ticket(char gender) {
		if(gender == 'F') {
			double ticketCost = 8.00;
			return ticketCost;
		}
		else {
			double ticketCost = 10.00;
			return ticketCost;
		}
	}
	
	public double feeding() {
		double feedingCost = beer*5.00 + softDrink*3.00 + barbecue*7.00;
		return feedingCost;
	}
	
	public double total(double coverCost, double ticketCost, double feedingCost) {
		return coverCost + ticketCost + feedingCost;
	}


}
