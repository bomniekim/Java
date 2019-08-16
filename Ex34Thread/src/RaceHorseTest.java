
public class RaceHorseTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Horse h1= new Horse("천리안");
		Horse h2= new Horse("적토마");
		Horse h3= new Horse("캐논");

		System.out.println("경주시작!");
		
		h1.start();
		h2.start();
		h3.start();
	}

}

class Horse extends Thread{
	
	String name;
	//생성자
	public Horse(String name) {
		this.name= name;
	}	
	
	//Thread의 동작을 작성하는 메소드
	@Override
	public void run() {
		for(int i=0; i<20; i++) {
			System.out.println(name+" 다그닥!다그닥!");
			
			try {
				Thread.sleep(400);//400ms[0.4초]
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
		}
		
		System.out.println(name + " 도착!");		
	}
	
}







