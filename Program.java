package aplication;

import java.text.ParseException;
import java.util.Locale;
import java.util.Scanner;

import entities.Address;
import entities.Department;
import entities.Employee;

public class Program {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Nome do departamento: ");
		String deptName = sc.nextLine();
		System.out.print("Dia do pagamento: ");
		int payDayDept = sc.nextInt();
		sc.nextLine();
		System.out.print("Email: ");
		String emailAddress = sc.nextLine();		
		System.out.print("Telefone: ");
		String phoneAdrress = sc.nextLine();
		
		Address adress = new Address(emailAddress, phoneAdrress);
		
		Department dept = new Department(deptName,payDayDept,adress);
		
		System.out.print("Quantos funcionários tem o departamento? ");
		int n = sc.nextInt();
		sc.nextLine();
		for(int i = 1; i<=n;i++) {			
			System.out.println("Dados do funcionários " + i + ":");
			System.out.print("Nome: ");
			String nameEmployee = sc.nextLine();
			System.out.print("Salário: ");
			double salary = sc.nextDouble();
			sc.nextLine();
			Employee employee = new Employee(nameEmployee, salary);
			
			dept.addEmployee(employee);
		}
		
		showReport(dept);
		
		sc.close();

	}
	
	private static void showReport(Department dept) {
		System.out.println(dept.toString());
	}

}
