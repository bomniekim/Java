
public class ExceptionMain3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//�ڵ带 ���ؼ� ���ܸ� ������ �ߵ�
		try {
			System.out.println("aaa");
			//������ ���� �߻�! - ������ catch������ �̵���Ű�� ����
			throw new Exception();
			
			//System.out.println("bbb"); //throw�ϸ� �� �ڵ�� ����� �� ����
			
		}catch(Exception e) {
			System.out.println("���ܹ߻�!");
		}
		
		//[Ȱ�� ��]
		//�޼ҵ忡 ����� ��û���� �� ���� ������ ����� ������ �ʾ�����...
		//��, ���� ������ ������ ���� ��Ȳ�̶�� ����������...��
		//java������ ������� ������� �ؼ� ���ܶ�� �Ǵ��ϴ� �˰����� ����.
		int n;
		
		try {			
			n =aaa(10,5);
			n= aaa(10, 15);
			System.out.println("n : "+n);
		}catch(Exception e) {
			System.out.println("������� �����Դϴ�.");
			System.out.println( e.getMessage() );
		}
		
	}//main �޼ҵ�
	
	
	static int aaa(int a, int b) throws Exception {
		//������ ������ ��Ȱ�� ��, ������ ���� �߻�!
		if(a<b) {
				throw new MyException("Hi"); //���� ���� ����Ŭ���� ��ü
				}		
				
		
		//����, throw�� �Ǹ� �Ʒ� �ִ� ���� �۾��� �������� ����.
		return a-b;
		
	}
	
	
}//Main3 class

//������ ExceptionŬ���� ����� ����
class MyException extends Exception {
	//������
	public MyException(String msg) {
		super(msg);//�θ�Ŭ������ �����ڸ� ���� �޼��� ����
	}
	
}

