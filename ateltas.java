package desafios_propostos;

import java.util.Locale;
import java.util.Scanner;

public class ateltas {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Qual a quantidade de atletas? ");
		int n = sc.nextInt();
		sc.nextLine();
		
		double pesoTotal = 0;
        double alturaTotalMulheres = 0;
        double alturaAtletaMaisAlto = 0;
        String nomeAtletaMaisAlto = "";
        int countHomens = 0;
		
		for(int i = 0; i < n; i++) {
			System.out.printf("Digite o dados do atleta numero %d:\n", i+1);
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			
			System.out.print("Sexo: ");
			char sexo = sc.nextLine().charAt(0);
			sexo = Character.toUpperCase(sexo);
			while (sexo != 'F' && sexo != 'M') {
				System.out.print("Valor invalido! Favor digitar F ou M:");
				sexo = sc.nextLine().charAt(0);
                sexo = Character.toUpperCase(sexo);
            } 
			
			System.out.print("Altura: ");
            double altura = sc.nextDouble();

            while (altura <= 0) {
                System.out.print("Valor invalido! Favor digitar um valor positivo:");
                altura = sc.nextDouble();
            }
            
            System.out.print("Peso: ");
            double peso = sc.nextDouble();

            while (peso <= 0) {
                System.out.print("Valor invalido! Favor digitar um valor positivo:");
                peso = sc.nextDouble();
            }
            
         // Atualizar variáveis para o relatório
            pesoTotal += peso;
            if (sexo == 'M') {
                countHomens++;
            } else if (sexo == 'F') {
                alturaTotalMulheres += altura;
            }

            // Verificar se este atleta é o mais alto
            if (altura > alturaAtletaMaisAlto) {
                alturaAtletaMaisAlto = altura;
                nomeAtletaMaisAlto = nome;
            }

            sc.nextLine(); // Consumir a quebra de linha
        }

        // Cálculos para o relatório
        double pesoMedio = pesoTotal / n;
        double percentualHomens = (countHomens * 100.0) / n;
        double alturaMediaMulheres = (countHomens == n) ? 0 : (alturaTotalMulheres / (n - countHomens));

        // Exibir o relatório
        System.out.println("\nRelatório dos Atletas:");
        System.out.printf("Peso médio dos atletas: %.2f kg\n", pesoMedio);

        if (alturaAtletaMaisAlto > 0) {
            System.out.println("Nome do atleta mais alto: " + nomeAtletaMaisAlto);
        } else {
            System.out.println("Não há atletas cadastrados.");
        }

        System.out.printf("Porcentagem de homens: %.2f%%\n", percentualHomens);

        if (countHomens < n) {
            System.out.printf("Altura média das mulheres: %.2f metros\n", alturaMediaMulheres);
        } else {
            System.out.println("Não há mulheres cadastradas.");
        }

				
		sc.close();

	}

}
