
public class Tuition {

	public Tuition() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double tuitionNow = 10000;
		double yearlyIncrease = 0.06;
		
		double futureTuition = tuitionNow;
		for (int i = 0; i < 10; i++) {
			futureTuition += yearlyIncrease * futureTuition;
		}
		
		double wholeTuition = 0;
		for(int i = 0; i < 4; i++) {
			wholeTuition += futureTuition;
			futureTuition += yearlyIncrease * futureTuition;
		}
		System.out.println("The tuition for 4 years in 10 years from now will cost: " + wholeTuition);
	}

}
