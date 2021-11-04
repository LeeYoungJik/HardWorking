
public class MainThreadExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calculator calculator = new Calculator(); //계산기 인스턴스 객체 생성

		User1 user1 = new User1(); // User1 객체 생

		user1.setCalculator(calculator); // 공유 객체를 설정한다.
		System.out.println("user1 셋setCalculator after");
		user1.start(); //start시 스레드 안의 run메소드 실행된다. 
		
		  
		
		  System.out.println("user2 만든다."); User2 user2 = new User2();
		  
		  user2.setCalculator(calculator);
		  System.out.println("user2 셋setCalculator after");
		  
		  user2.start();
		  
		// 즉 user1에서는 공유 객체 안의 memory 값을 100으로 설정했지만
		// 스레드가 1초 쉰 뒤 유저2(스레드2)가 돌고 여기서 50으로 덮어써 버린다.
		// 결국 출력은 메모리의 값은 50으로 출력된다.
	}

}
