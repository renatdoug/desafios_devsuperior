package aplicativos;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import desafios_propostos.TaxPayer;

public class ProgramContribuintes {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<TaxPayer> list = new ArrayList<>();

        System.out.print("Quantos contribuintes você vai digitar? ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.println("Digite os dados do " + (i + 1) + " contribuinte:");
            System.out.print("Renda anual com salário: ");
            double salaryIncome = sc.nextDouble();
            System.out.print("Renda anual com prestação de serviço: ");
            double serviceIncome = sc.nextDouble();
            System.out.print("Renda anual com ganho de capital: ");
            double capitalIncome = sc.nextDouble();
            System.out.print("Gastos médicos: ");
            double heathSpending = sc.nextDouble();
            System.out.print("Gastos educacionais: ");
            double educationSpending = sc.nextDouble();

            list.add(new TaxPayer(salaryIncome, serviceIncome, capitalIncome, heathSpending, educationSpending));
        }

        for (int j = 0; j < n; j++) {
        	
        	System.out.println("\nResumo do " + (j + 1) + "º contribuinte:");
            System.out.println("Imposto bruto total: " + String.format("%.2f", list.get(j).grossTax()));
            System.out.println("Abatimento: " + String.format("%.2f", list.get(j).taxRebate()));
            System.out.println("Imposto devido: " + String.format("%.2f", list.get(j).netTax()));
        }

        sc.close();
    }
}
