
public class RunnableTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Thread�� ����� ����� 2������ ����.
		//1. ThreadŬ������ �����(extends) Ŭ������ �����Ͽ� ����ϴ� ���
		//2. Runnable�������̽��� ������(implements) Ŭ������ �����Ͽ� ����ϴ� ���
		
		//�� 2���� ����� �����ұ�??
		//���� ����� ȿ���� ���� �;!
		//PersonŬ������ �ɷ��� �����鼭 ���ÿ� �������� �ɷµ� ������ ��ü�� ����
		PersonThread pt = new PersonThread();
		
		//Thread������ start()�޼ҵ��! run()�� ���� ȣ���ϸ� �ȵ�!
		//run()�� ���� ȣ���ϸ� �װ� ������ Thread�� �ƴ� run()�� ȣ���� Main Thread�� �����Ű�� ��Ȳ�� ��.
		//pt.run();
		//pt.start();//error : Runnable�������̽����� start()�޼ҵ尡 ����.
		
		//Runnable��ü(pt)�� ��������ִ� ������ trigger�� Thread�� �ʿ���!
		Thread t= new Thread(pt);//�����ڿ� Runnable��ü�� ������ ��.
		t.start(); //���޹��� Runnable��ü�� start()�� ��� ����!
		
		System.out.println("princess");
		
		
		
		//Runnable�������̽��� ������� �ٸ� ����!
		//�͸�Ŭ���� �����غ���
		Runnable r= new Runnable() {
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("Runnable!");
			}
		};
		
		//Runnable��ü�� �����Ϸ���...���ο� Thread ��ü�� �ʿ�
		Thread t2= new Thread(r);
		t2.start();
		
		//�� ����� �� �ٿ��� �ۼ��ϱ⵵ ��
		Thread t3= new Thread( new Runnable() {
			public void run() {
				System.out.println("�͸�Ŭ���� ���");
			}
		} );
		t3.start();
		

	}

}

//Person�� ����ɷ��� �����鼭 Thread�� �ɷµ� �־����� �ϴ� Ŭ���� ����
class PersonThread extends Person implements Runnable { //java.lang�� �ִ� ���� �ڵ����� import
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		for(int i=0; i<5; i++) {
			String threadName = Thread.currentThread().getName();
			System.out.println("name : "+name+" age : "+age+"["+threadName+"]");
			
			try {
				Thread.sleep(1000);
			}catch (Exception e) {}
		}
		
	}
}


class Person{
	String name;
	int age;
}

