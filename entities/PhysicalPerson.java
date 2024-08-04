package entities;

public class PhysicalPerson extends reuseTax{

	private Double health;
	
	public PhysicalPerson(String name, Double income, Double health) {
		super(name, income);
		this.health = health;
	}
	@Override
	public Double tax(Double tax){
           if(income < 20000.00) {
	       tax =(income * 0.15)-(health * 0.50);
           }else{
        	   tax = (income * 0.25)-(health * 0.50);
           }return tax;
    }
}

