

public class MainThreadExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	Calculator calculator = new Calculator();
	
	System.out.println("user1 만든다.");
	User1 user1 = new User1();
	
	user1.setCalculator(calculator);
	System.out.println("user1 셋setCalculator after");
	user1.start();
	
	System.out.println("user2 만든다.");
	User2 user2 = new User2();
	
	user2.setCalculator(calculator);
	System.out.println("user2 셋setCalculator after");
	
	user2.start();
	}

}
