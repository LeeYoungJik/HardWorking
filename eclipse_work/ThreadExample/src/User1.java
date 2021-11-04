
public class User1 extends Thread{

	
	private Calculator calculator;
	
	public void setCalculator(Calculator calculator)
	{
		System.out.println("User1 in calculator value"+calculator.toString());
		
		this.setName("User1");
		this.calculator = calculator;
		System.out.println("user1 setCalculator");
	}
	
	public void run()
	{
		calculator.setMemory(100);
	}
	
	
	
}
