
public class User1 extends Thread{

	
	private Calculator calculator;
	
	public void setCalculator(Calculator calculator)
	{	
		this.setName("User1");   //이 스레드의 이름을 user1으로 한다.
		
		System.out.println("this.getname"+this.getName()); //user1
		System.out.println("this.getname"+this.getClass().getName()); //user1
		this.calculator = calculator;  //메인스레드에서 들어온 calculator가 매개변수로 들어온다.
		                               //매개변수로 들어온 calculator를 여기 스레드 안의 calculator로 다시 선언한다. 
		System.out.println("user1 setCalculator");
		
	}
	
	public void run()
	{
		calculator.setMemory(1000);
	}
	
	
	
}
