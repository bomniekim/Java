public class SynchronizedTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 계좌객체 생성
		Account acc = new Account();

		// acc계좌에 100원을 입금하고 싶은 고객1
		TestThread t1 = new TestThread(acc);

		// acc계좌에 100원을 입금하고 싶은 고객2 - 같은 자원을 동시에 공유하고 싶을 때 문제 발생
		TestThread t2 = new TestThread(acc);

		// 비슷한 시점에 둘 다 100원 입금 동작 실행
		t1.start(); // run()메소드가 발생
		t2.start();

	}

}// main class

//은행계좌 클래스
class Account {

	int money = 0;

	// 입금기능 : 동기화 처리가 되어 있지 않으면 계좌정보가 잘못될 여지가 있음
	/// 이를 해결하기 위해 동기화(synchronized)처리
	// 방법1. 메소드에 동기화 처리 - 0번이 끝날 때까지 1번은 대기
//	synchronized void add(int m) {
//		String name=Thread.currentThread().getName(); //시간끌기
//		System.out.println(name+" 현재잔액 : "+ money);
//		money += m;
//		
//		//전산처리 시간을 가정하여 가장으로 오래걸리는 작업 코드
//		for(int i=0; i<200000; i++) {
//			String a = "aaa";
//		}///////////////////////////////////////
//		
//		System.out.println(name+" 입금 후 잔액 : "+ money);
//		System.out.println();
//}

	// 방법2. 동기화블럭 - 각자 따로?
	void add(int m) {
		
		System.out.println("입금작업을 시작합니다.");
		synchronized (this) {
	
		String name = Thread.currentThread().getName(); // 시간끌기
		System.out.println(name + " 현재잔액 : " + money);
		money += m;

		// 전산처리 시간을 가정하여 가장으로 오래걸리는 작업 코드
		for (int i = 0; i < 200000; i++) {
			String a = "aaa";
		} ///////////////////////////////////////

		System.out.println(name + " 입금 후 잔액 : " + money);
		System.out.println();
		}
	}
		
}// Account class

//은행계좌에 입금하는 기능을 수행하는 Thread클래스 정의
class TestThread extends Thread{
	
	Account acc;//위에서 만든 클래스 참조변수
	
	public TestThread(Account acc) {
		this.acc= acc;		
	}
	
	@Override
	public void run() {
		//100원을 계좌에 입금하는 동작 수행
		acc.add(100);
		}
	
}
