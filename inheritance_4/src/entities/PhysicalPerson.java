package entities;

public class PhysicalPerson extends Person{
	private Double healthSpending;
	
	public PhysicalPerson() {
		super();
	}
	
	public PhysicalPerson(String name, Double annualIncome, Double healthSpending) {
		super(name, annualIncome);
		this.healthSpending = healthSpending;
	}

	public Double getHealthSpending() {
		return healthSpending;
	}

	public void setHealthSpending(Double healthSpending) {
		this.healthSpending = healthSpending;
	}

	@Override
	public Double tax() {
		if(super.getAnnualIncome() < 20000.00) {
			if(healthSpending > 0.0) {
				return super.getAnnualIncome() * 0.15 - healthSpending * 0.5;
			}
			else {
				return super.getAnnualIncome() * 0.15;
			}
		}
		else {
			if(healthSpending > 0.0) {
				return super.getAnnualIncome() * 0.25 - healthSpending * 0.5;
			}
			else {
				return super.getAnnualIncome() * 0.25;
			}
		}
	
	}

}
