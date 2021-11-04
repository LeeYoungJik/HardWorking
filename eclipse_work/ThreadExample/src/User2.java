
public class User2 extends Thread{

	private Calculator calculator;
	
	public void setCalculator(Calculator calculator) {
		this.setName("User2");
		this.calculator = calculator;
		System.out.println("user2 setCalculator");
		
	}
	
	public void run() {
		calculator.setMemory(50);
	}
	
}
