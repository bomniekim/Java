
public class YieldTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ThreadAA t1= new ThreadAA();
		ThreadBB t2= new ThreadBB();
		
		t1.start();
		t2.start();
		
		//5���Ŀ� B�� ����ǵ���..(A�� cpu����� �纸[yield]�ϵ���)
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		t1.flag= false;
		
		//5���Ŀ� A�� �����ϵ���..(B�� cpu����� �纸)
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		t2.flag= false;
		t1.flag= true;
		
		//5�ʵڿ� A, B �Ѵ� ����!!!
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//������ ����!![�������� run()�޼ҵ尡 ����Ǹ� �����尡 ����]
		//t1.stop();//�� �޼ҵ�� ������ ������
		//while���� �����ϵ���..
		t1.isRun= false;
		t2.isRun= false;
		
		

	
	}

}
