package tema19;

public class SavingsAccount extends Account19{

	public SavingsAccount (int id, double balance){
		super(id, balance);
	}
	public void withdraw(double draw) {
		if(balance >= draw) {
    	balance -= draw;
		}
    }
	
	public String toString() {
    	return super.toString() + "Savings account";
    }

}
