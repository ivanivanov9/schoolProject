
public class Craps {
public static int rollDice() {
	return(int) (Math.random()*6) + 1;
}
	public Craps() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean play = true;
		int point = 0;
		String result = "";
		do {
			int dice1 = rollDice();
			int dice2 = rollDice();
			int sum = dice1 + dice2;
			System.out.println("You rolled " + dice1 + " + " + dice2 + " = " + sum);
			if (point == 0) {
				if (sum == 2 || sum == 3 || sum == 12) {
					result = "Lose";
					play = false;
				}else if (sum == 7 || sum == 11) {
					result = "Win";
					play = false;
				}else { 
					point = sum;
					System.out.println("Point is " + point);
				}
			}else {
				if (point == sum) {
					result = "Win";
					play = false;
				}else if (point == 7) {
					result = "Lose";
					play = false;
				}
			}
		}
		while(play);
		System.out.println(result);

	}

}
