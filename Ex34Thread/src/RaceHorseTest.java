
public class RaceHorseTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Horse h1= new Horse("õ����");
		Horse h2= new Horse("���丶");
		Horse h3= new Horse("ĳ��");

		System.out.println("���ֽ���!");
		
		h1.start();
		h2.start();
		h3.start();
	}

}

class Horse extends Thread{
	
	String name;
	//������
	public Horse(String name) {
		this.name= name;
	}	
	
	//Thread�� ������ �ۼ��ϴ� �޼ҵ�
	@Override
	public void run() {
		for(int i=0; i<20; i++) {
			System.out.println(name+" �ٱ״�!�ٱ״�!");
			
			try {
				Thread.sleep(400);//400ms[0.4��]
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
		}
		
		System.out.println(name + " ����!");		
	}
	
}







