package desafios_propostos;

public class TaxPayer {
	
	private Double salaryIncome;
	private Double servicesIncome;
	private Double capitalIncome;
	private Double healthSpending;
	private Double educationSpending;
	
	public TaxPayer() {
		
	}

	public TaxPayer(Double salaryIncome, Double servicesIncome, Double capitalIncome, Double healthSpending,
			Double educationSpending) {
		
		this.salaryIncome = salaryIncome;
		this.servicesIncome = servicesIncome;
		this.capitalIncome = capitalIncome;
		this.healthSpending = healthSpending;
		this.educationSpending = educationSpending;
	}

	public Double getSalaryIncome() {
		return salaryIncome;
	}

	public void setSalaryIncome(Double salaryIncome) {
		this.salaryIncome = salaryIncome;
	}

	public Double getServicesIncome() {
		return servicesIncome;
	}

	public void setServicesIncome(Double servicesIncome) {
		this.servicesIncome = servicesIncome;
	}

	public Double getCapitalIncome() {
		return capitalIncome;
	}

	public void setCapitalIncome(Double capitalIncome) {
		this.capitalIncome = capitalIncome;
	}

	public Double getHealthSpending() {
		return healthSpending;
	}

	public void setHealthSpending(Double healthSpending) {
		this.healthSpending = healthSpending;
	}

	public Double getEducationSpending() {
		return educationSpending;
	}

	public void setEducationSpending(Double educationSpending) {
		this.educationSpending = educationSpending;
	}
	
	public double salaryTax() {
        if (this.salaryIncome >= 3000 && this.salaryIncome < 5000) {
            return this.salaryIncome * 0.10;
        } else if (this.salaryIncome < 3000) {
            return 0;
        } else {
            return this.salaryIncome * 0.20;
        }
    }

    public double servicesTax() {
        return this.servicesIncome * 0.15; // Corrigido o valor da taxa
    }

    public double capitalTax() {
        return this.capitalIncome * 0.20;
    }

    public double grossTax() {
        return this.salaryTax() + this.servicesTax() + this.capitalTax();
    }
    
    public double taxRebate() {
        double totalSpending = this.healthSpending + this.educationSpending;
        double rebateLimit = this.grossTax() * 0.30;

        if (totalSpending < rebateLimit) {
            return totalSpending;
        } else {
            return rebateLimit; 
        }
    }

	public double netTax() {
		return this.grossTax() - this.taxRebate();
	}	
	

}


