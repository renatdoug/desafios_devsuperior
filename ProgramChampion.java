package aplicativos;

import java.util.Locale;
import java.util.Scanner;

import desafios_propostos.Champion;

public class ProgramChampion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Champion champion1, champion2;
		
		System.out.println("Digite os dados do primeiro campeão:");
		System.out.print("Nome: ");
		String name = sc.nextLine();
		System.out.print("Vida inicial: ");
		int life = sc.nextInt();
		
		System.out.print("Ataque: ");
		int attack = sc.nextInt();
		
		System.out.print("Armadura: ");
		int armor = sc.nextInt();
		
		sc.nextLine();
		
		champion1 = new Champion(name, life, attack, armor);
		
		System.out.println("\nDigite os dados do segundo campeão:");
		System.out.print("Nome: ");
		String name2 = sc.nextLine();
		System.out.print("Vida inicial: ");
		int life2 = sc.nextInt();
		System.out.print("Ataque: ");
		int attack2 = sc.nextInt();
		System.out.print("Armadura: ");
		int armor2 = sc.nextInt();
		
		champion2 = new Champion(name2, life2, attack2, armor2);
		
		System.out.print("Quantos turnos você deseja executar? ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
		    champion1.takeDamage(champion2);
		    champion2.takeDamage(champion1);

		    System.out.println("\nResultado do turno " + i + ":");
		    System.out.println(champion1.status());
		    System.out.println(champion2.status());

		    if (champion1.getLife() == 0 || champion2.getLife() == 0) {
		        break;
		    }
		}


		System.out.println("\nFIM DO COMBATE");

			
		
		sc.close();

	}

}
