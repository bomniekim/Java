
public class JoinTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JThread j = new JThread();
		j.start(); // 5�ʰ� �ҿ�Ǵ� �۾�����!

		// j�� �۾��� ������ ���� �ٸ� ��������� �۾��� ��ٷ�������..(block)
		try {
			j.join(); // JThread�� run()�۾��� ������ ���� �ٸ� ��������� ��� all stop

		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		// synchronized�� ��������� �ٸ�.
		// synchronized�� ���� �ڿ�(��ü)�� �ǵ帱���� ��ŷ��.

		// join()�� ���� ��ü����̰� ����. ������� �׳� �� ��ŷ!!

		// Main Thread�� �ٸ� �۾� ����
		for (int i = 0; i < 10; i++) {
			System.out.println("main...");

			try {
				Thread.sleep(500); // 0.5��
			} catch (Exception e) {
			}

		}
	}

}

class JThread extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("aaa");

			try {
				Thread.sleep(500); // 0.5��
			} catch (Exception e) {
			}
		}
	}
}