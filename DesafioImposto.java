package desafios_propostos;

import java.util.Locale;
import java.util.Scanner;

public class DesafioImposto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double renda_anual_sal, renda_anual_prest_serv, renda_anual_ganho_cap, medico, gastos_edu, 
		imposto_renda, imposto_capital, imposto_serv, imposto_bruto, max_detutivel,
		gasto_detutivel, abatimento;
		
		System.out.print("Renda anual com salário: ");
		renda_anual_sal = sc.nextDouble();
		System.out.print("Renda anual com prestação de serviço: ");
		renda_anual_prest_serv = sc.nextDouble();
		System.out.print("Renda anual com ganho de capital: ");
		renda_anual_ganho_cap = sc.nextDouble();
		System.out.print("Gastos médicos: ");
		medico = sc.nextDouble();
		System.out.print("Gastos educaionais: ");
		gastos_edu = sc.nextDouble();
		
		imposto_renda = 0;
		double salario;
		
		salario = renda_anual_sal/12;
		
		if(salario < 3000) {
			System.out.println("Insento");
		}
		else if(salario >= 3000 && salario < 5000) {
			imposto_renda = renda_anual_sal*0.1;
		}
		else if(salario >= 5000) {
			imposto_renda = renda_anual_sal*0.2;
		}
		
		imposto_serv = 0;
		if(renda_anual_prest_serv != 0) {
			imposto_serv = renda_anual_prest_serv * 0.15;
		}
		
		imposto_capital = 0;
		if(renda_anual_ganho_cap != 0) {
			imposto_capital = renda_anual_ganho_cap * 0.20;
		}
		
		imposto_bruto = imposto_renda + imposto_serv + imposto_capital;
		
		gasto_detutivel = medico + gastos_edu; 
		
		
		max_detutivel = imposto_bruto*0.30;
		
		abatimento = 0;
		if(gasto_detutivel >= max_detutivel) {
			abatimento = max_detutivel;
		}
		else {
			abatimento = gasto_detutivel;
		}
		
		System.out.println();
		System.out.println("RELATÓRIO DE IMPOSTO DE RENDA: ");
		System.out.println();
		
		System.out.println("CONSOLIDADO DA RENDA: ");
		System.out.printf("Imposto sobre salário: R$ %.2f%n", imposto_renda);
		System.out.printf("Imposto sobre serviço: R$ %.2f%n", imposto_serv);
		System.out.printf("Imposto sobre ganho de capital: R$ %.2f%n", imposto_capital);
		
		System.out.println();
		System.out.println("DEDUÇÕES: ");
		System.out.println();
		
		System.out.printf("Máximo dedutível: R$ %.2f%n", max_detutivel);
		System.out.printf("Gastos dedutível: R$ %.2f%n", gasto_detutivel);
		
		System.out.println();
		System.out.println("RESUMO: ");
		System.out.println();
		
		System.out.printf("Imposto bruto total: R$ %.2f%n", imposto_bruto);
		System.out.printf("Abatimento: R$ %.2f%n", abatimento);
		System.out.printf("Imposto devido: R$ %.2f%n", (imposto_bruto - abatimento));
		sc.close();
		

	}

}
