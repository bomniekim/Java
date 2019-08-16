
public class SynchronizedTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MP3 mp3 = new MP3();
		
		mp3.play(); //Main Thread가 실행
		
		MyThread myThread = new MyThread(mp3);
		myThread.start(); //run()메소드 발동! : 5초 소요되는 작업
			
		//Main Thread가 동시에 mp3를 실행시키는 경우가 발생할 수 있음.
		mp3.play();
		
		//동시에 1개의 mp3를 건드리게 되어 그 사용이 뒤죽박죽이 됨
		
		//이를 해결하기 위해 하나의 스레드가 play()를 하고 있다면
		//다른 스레드가 설사 play()를 또 호출하더라도 잠시 대기시키도록 하는 기법이 필요
		//동시에 실행되면 안되는 메소드(play())에 동기화(synchronized) 처리

	}

}

//Thread 클래스 : mp3플레이어를 실행시키는 기능을 가짐
class MyThread extends Thread{
	
	MP3 mp3;
	
	public MyThread(MP3 mp3) {
		this.mp3=mp3;
	}
	
	@Override
	public void run() {
		mp3.play();
	}
}

//음악플레이어 클래스 [MP3 플레이어]
class MP3{
	
	int musicNum= 0;
	
	//동기화 처리
	//방법1. 메소드를 통채로 동기화 처리하기!-특정파트만은 건드리지 않게끔
//	synchronized void play() {
//	
//		System.out.println("플레이 명령이 실행되었다!!");
//		
//		//5초정도 musicNum에 해당하는 음악파일 실행!
//		musicNum++;
//		for(int i=0; i<5; i++) {
//			System.out.println(musicNum+"번 음악 재생중~~");
//			
//			//1초 대기
//			try {
//				Thread.sleep(1000);//1000ms : 1초
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
//		
//	}
	
	//방법2. 특정 코드 영역만 동기화 블럭 처리..
	void play() {
		
		//동기화블럭 밖에 있는 이 코드는 동기화 처리되지 않음.
		System.out.println("플레이 명령이 실행되었다!!");
		
		//5초정도 musicNum에 해당하는 음악파일 실행!		
		//이 영역만 동기화 블럭처리
		synchronized (this) {
			musicNum++;
			for(int i=0; i<5; i++) {
				System.out.println(musicNum+"번 음악 재생중~~");
				
				//1초 대기
				try {
					Thread.sleep(1000);//1000ms : 1초
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}	
		
		
	}
	
}




