import com.sun.source.tree.CatchTree;

public class Calculator {

	private int memory;  //요게 공통적으로 쓰는 메소드들의 값공간이다. 
	
	
	public int getMemory(){  
		return memory;
	}
	
	
	  public void setMemory(int memory) { //메모리 값이 들어올 경 
		  
		  this.memory=memory;
	  
	try {
		Thread.sleep(1000);  //해당 스레드를 1초 쉬게 한다. 
		
	}catch(Exception e){
		
	System.out.println("error"+e);	
	}
	
	System.out.println(Thread.currentThread().getName()+"Calculator안 메모리"+this.memory);
	}
	
		
	
	
}
