
public class Main {

	public static void main(String[] args) {
		
		Second s = new Second();
		s.show();

		//�Ķ���͸� �����ϴ� ������ �����ε�
		Second s2 = new Second(10,20);
		s2.show();
		
		Second s3 = new Second(10,50);
		s3.show();

		
		//����� ��� ���� (���θ� - �θ�- �ڽ�)
		//Second�� ����� ThirdŬ����
		new Third();
		System.out.println();
		

		//��ӿ� ���Ǿ��� FirstŬ������ Second�� �ƴ� �ٸ� Ŭ������
		//�� �ٽ� ����ؼ� ����ص� ��!!!
		//First�� ����� TestŬ����
		new Test();
		System.out.println();
		
		
		
	}

}
