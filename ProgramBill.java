package aplicativos;

import java.util.Locale;
import java.util.Scanner;

import desafios_propostos.Bill;

public class ProgramBill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Bill bill;
		bill = new Bill();
		
		System.out.print("Sexo: ");
		bill.gender = sc.next().charAt(0);
		
		double ticketCost = bill.ticket(bill.gender);
				
		System.out.print("Quantidade de cervejas: ");
		bill.beer = sc.nextInt();
		
		System.out.print("Quantidade de refrigerantes: ");
		bill.softDrink = sc.nextInt();
		
		System.out.print("Quantidade de espetinhos: ");
		bill.barbecue = sc.nextInt();
		
		double feedingCost = bill.feeding(); 
		double couverCost = bill.cover(feedingCost);
		double totalCost = bill.total(couverCost, ticketCost, feedingCost);
		
		System.out.println("\nRELATÓRIO \n");
		System.out.printf("Consumo = R$ %.2f \n", feedingCost);
		
		if(couverCost == 0.00) {
			System.out.println("Insento de Couvert");
		}
		else {
			System.out.printf("Couvert = R$ %.2f \n", bill.cover(feedingCost));
		}
		System.out.printf("Ingresso = R$ %.2f \n", ticketCost);
		
		System.out.printf("\nValor a pagar = R$ %.2f \n", totalCost);
		
		sc.close();

	}

}
