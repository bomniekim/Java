
public class Calculator {

	// ����޼ҵ�

	// ���ϱ���
	int sum(int x, int y) {
		return x + y;
	}

	// ������
	int subtract(int x, int y) {
		return x - y;
	}

	// �������
	int multi(int x, int y) {
		return x * y;
	}

	// ���������
	int divide(int x, int y) {
		return x / y;
	}

	// �Ǽ��� ���ڵ��� ��Ģ���� �޼ҵ�

	// �޼ҵ��� �̸��� ���� �Ķ���ʹ� �ٸ�(���� or �ڷ���) �޼ҵ��� �����ε�(Overloading)
	// ����Ÿ���� ����
	double sum(double x, double y) {
		return x + y;
	}

	double subtract(double x, double y) {
		return x - y;
	}

	double multi(double x, double y) {
		return x * y;
	}

	double divide(double x, double y) {
		return x / y;
	}

	// ���ڿ��������� ��� �������
	int sum(String x, String y) {
		// ���ڿ��� int�� ��ȯ�ϱ�!! (WrapperŬ���� �̿�)
		int n1 = Integer.parseInt(x);
		int n2 = Integer.parseInt(y);

		return n1 + n2;
	}

}
