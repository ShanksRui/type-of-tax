package entities;

public class LegalPerson extends reuseTax{

	private Integer numberEmployees;
	
	public LegalPerson() {
		
	}
	public LegalPerson(String name, Double income, Integer numberEmployees) {
		super(name, income);
		this.numberEmployees = numberEmployees;
	}
	public Integer getNumber_employees() {
		return numberEmployees;
	}
	public void setNumber_employees(Integer numberemployees) {
		this.numberEmployees = numberemployees;
	}	
   @Override
   public Double tax(Double tax) {
		if (numberEmployees > 10){
			tax = (this.income * 0.14);
		}else
			tax = (this.income * 0.16); 
		return tax;	
	}
	
}

