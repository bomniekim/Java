
public class ThreadMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Thread(스레드) : 동시에 여러 작업을 처리하는 기법
		// 1. 프로세스 : 실행중인 하나의 자바 프로그램 [본인만의 메모리영역을 가짐(Method, Stack, Heap)] - 프로세스간에는 자원공유 불가
		// 2. 스레드 : 하나의 프로세스안에서 동작하는 일꾼(직원)같은 개념 - 하나의 프로세스 안에서 스레드 간에는 자원공유 가능

		// 동시에 했으면 하는 작업 2개 구현!
		// 예) 파일 다운로드 하면서 음악듣기 & 채팅하기 등

		// 아직 네트워크를 배우지 않았으니 그냥 느낌만 주는 코드

		// 20개의 파일을 다운로드하는 작업
		for (int i = 0; i < 20; i++) {
			System.out.println(i + "번 파일 다운로드 중...");

			// 강제로 잠시 대기
			for (long k = 0; k < 1000000000; k++) {
			}
		}
		System.out.println("파일 다운로드 완료!");

		// 20개의 음악을 재생하는 작업
		for (int i = 0; i < 20; i++) {
			System.out.println(i + "번 음악 재생");

			// 강제로 잠시 대기
			for (long k = 0; k < 1000000000; k++) {
			}
		}
		System.out.println("음악 재생 완료!");
		
		
		//위 2개의 작업이 동시에 되면 더 빠른 작업처리 가능
		// 어떻게? 직원을 더 채용하면 가능
		// 여기서 보통 일반 객체와 Thread객체를 혼동함
		// 객체를 따로 만든다고 해서 새로운 직원이 생기는 것은 아님!
		
		// 서로 다른 객체의 기능을 실행해보기..
//		WorkerA workerA= new WorkerA();
//		workerA.work(); // 이 메소드를 실행하는 스레드는 Main Thread
//		
//		WorkerB workerB= new WorkerB();
//		workerB.work();
		// 위 작업은 객체가 2마리일 뿐 실제로는 Main Thread(사장)가 혼자서 작업하는 것임.
		// Main Thread가 worker를 실행시키는 것
		// 그래서 동시 작업이 안됨!

		// 그럼 진짜 사장(Main Thread)말고.. 직원(Thread의)객체를 만들어야 동시 작업이 가능.
		// How?--> Thread의 능력을 하사받기--> Thread클래스 [상속]
		// 즉, 일반 클래스가 아니라 Thread를 상속한 클래스를 객체로 만들어서 사용!
		ThreadA a = new ThreadA();
		a.start();// 작업 시작 요청(Thread객체의 run()메소드가 자동 실행)

		ThreadB b = new ThreadB();
		b.start();
		
		//Thread의 우선권(cpu점유시간) 순위 부여 가능(0~10):setPriority (낮음~높음)
		a.setPriority(1); //낮음
		b.setPriority(10); //높음
		
		//Thread.sleep()을 하면 우선순위가 무의미
		//반복횟수가 너무 적으면 우선순위 효과가 거의 없어
		//반복횟수를 20->2000
		//Main Thread는 기본 우선순위(5)로 지정되어 있음.
				
		//Main Thread도 Thread이므로 위 a,b 작업자(스레드)와 동시에 별개의 작업 가능
		for(int k=100; k<12000; k++) {
			//현재 이 코드를 실행하는 스레드가 누군인지?
			Thread t= Thread.currentThread();
			String name= t.getName();
			
			System.out.println( name+ " : " + k ); //Main Thread
			
//			try {
//				Thread.sleep(1000);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
		}

	}

}//Main class

//파일 다운로드를 하는 직원 클래스(Thread를 상속받음)
class ThreadA extends Thread{
	//모든 Thread클래스의 작업은 이 메소드안에서 작성해야 만 함.
	//Thread클래스 안에 있는 run()메소드를 오버라이드 해서 사용해야만 함.
	@Override
	public void run() {
		for(int i=0; i<20; i++) {
			System.out.println(i + "번 파일 다운로드 중...");
			
			//1초동안 대기
			try {				
				Thread.sleep(1000); //1000ms동안 잠시 잠들어라
			} catch(Exception e) {}
			
			
			//강제로 잠시 대기
			for(long k=0; k<1000000000; k++) {				
			}
		}
		System.out.println("파일 다운로드 완료!");		
	}
	
}

//음악재생 작업 직원 클래스(Thread를 상속한)
class ThreadB extends Thread{
	@Override
	public void run() {
		for(int i=0; i<20; i++) {
			System.out.println( i + "번 음악 재생");
			
			//1초동안 대기
			try {				
				Thread.sleep(1000); //1000ms동안 잠시 잠들어라
			} catch(Exception e) {}
			
			//강제로 잠시 대기
			for(long k=0; k<1000000000; k++) {				
			}
		}
		System.out.println("음악 재생 완료!");
	}	
}



//파일 다운로드하는 작업자 클래스 설계
class WorkerA{
	//파일다운로드 작업메소드
	void work() {
		for(int i=0; i<20; i++) {
			System.out.println(i + "번 파일 다운로드 중...");
			
			//강제로 잠시 대기
			for(long k=0; k<1000000000; k++) {				
			}
		}
		System.out.println("파일 다운로드 완료!");		
	}
}


//음악 재생을 해주는 작업자 클래스 설계
class WorkerB{
	//20개의 음악 재생작업 메소드
	void work() {
		for(int i=0; i<20; i++) {
			System.out.println( i + "번 음악 재생");
			
			//강제로 잠시 대기
			for(long k=0; k<1000000000; k++) {				
			}
		}
		System.out.println("음악 재생 완료!");
	}
}




