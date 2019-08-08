
import java.net.MalformedURLException;
import java.net.URL;

public class ExceptionMain2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// throws : ���� ���ѱ��

		try {
			int x = divide(10, 0); // divide()�޼ҵ忡�� ���ѱ�(throws) ���ܸ� ��� ó��
			System.out.println(x);
		} catch (ArithmeticException e) {
			System.out.println("��� ���ܰ�ü �޾� ó��..");
		}

		// ���ѱ�� throws�ϴ� ���ܰ�ü�� ������ ����..�������� ���� �� ����.
		// ����, throws�ϴ� ���ܰ�ü�� Checked Exception�� �����̸�..
		// �� �޼ҵ带 ȣ���ϴ� �ʿ��� �ݵ�� try-catch���� ����ؾ� ��.
		try {
			aaa();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			ccc();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	/// �� ���� ������������ �Ͽ� ����� �����ϴ� �޼ҵ�
	// �� �޼ҵ�� �ƹ� ���� ���������.. ������! why? ������ ���ɼ��� ���� [0 ������]

	// ����ó�� ���� ���[try-catch]

//		static int divide(int a, int b) {
//			
//			
//			try {
//				return a/b;
//			}catch(ArithmeticException e) {
//				return ??; //���ϰ��� �ָ���
//			}
//			
//		}

	// �޼ҵ� �ȿ� �ڵ尡 ���ܰ� �߻��� ������ �־
	// ����ó���� �ϴµ� �� ������ �ټ� �ָ��� ��찡 ���� (���� ���� ���)
	// ���� ó��, ��, ���ܰ�ü�� �޼ҵ带 ȣ���� ������ ���ѱ�� ���(throws) ���

	static int divide(int a, int b) throws ArithmeticException {
		return a / b;
	}

	// �������� ��� ���ܰ�ü throws�ϱ�
	static void aaa() throws MalformedURLException {
		bbb();
		System.out.println("aaa");
	}

	// throws�� ������ ����..(��ź ������ ���� ����)
	static void bbb() throws MalformedURLException {
		URL url = new URL("http://www.daum.net");
	}

	// ����, throws�� �ֻ��� ExceptionŬ������ ����ϸ�..
	// ���� �߻��� Exception��ü�� Checked����, UnChecked���� ������ ����� ���..
	// �� �޼ҵ带 ȣ���ϴ� �ʿ����� ������ try-catch�� �ؾ߸� ��.
	static void ccc() throws Exception {

	}

	// �̷������� Ư�� ����Ŭ������ throws���� ����ϴ� ���
	void ddd() throws NullPointerException {

	}
	// ����, ddd()�޼ҵ忡�� NullPointerException�� �ƴ� ���ܰ� �߻��ϸ�? �ٿ��

	// ���� ���ܸ� ��� ���ѱ�� �ʹٸ�? : ��Ƽ ���ܴ�����
	void eee() throws NullPointerException, ArithmeticException, NumberFormatException {

	}

	// �ѹ濡 ��� ���ܴ����� ���� ����
	void fff() throws Exception {
	}

}
