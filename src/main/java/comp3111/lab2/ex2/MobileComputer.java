package comp3111.lab2.ex2;

public class MobileComputer extends Computer implements Chargeable{
	/* "implements Chargeable" is added after "extends Computer" 
	 * this is because member function 'charge' under the class 'Charger' requires input type 'Chargeable'
	 * by adding this, class 'MobileComputer' inherits both the interface 'Chargeable' and the superclass 'Computer'
	 * hence 'MobileComputer' is a 'Chargeable' object now and hence the function 'Charger.charge' can be used.*/
	private int battery;
	public MobileComputer() {
		secret = "MobileComputer secret";
		battery = 5;
	}
	
	@Override
	public void work() {
		if (battery > 0) {
			System.out.println("It is working on my lap.");
			battery--;
		} else 
			System.out.println("Running out of battery");
	}
	
	public void charge() {
		if (battery < 10)
			battery++;
	}
		
}
