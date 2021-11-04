import com.sun.source.tree.CatchTree;

public class Calculator {

	private int memory;
	
	public int getMemory(){
		return memory;
	}
	
	public void setMemory(int memory) {
		this.memory=memory;
	
	try {
		Thread.sleep(1000);
	}catch(Exception e){
		
	System.out.println("error"+e);	
	}
	
	System.out.println(Thread.currentThread().getName()+"Calculator안 메모리"+this.memory);
	}
	
		
	
	
}
