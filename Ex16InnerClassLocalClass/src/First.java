
public class First {
	
	int a=10;
	static int b=20;
	
	Hello h;
	
	//static �̳�Ŭ���� : �ƿ��Ͱ�ü�������� �ٸ� ������ ��ü���� ������!
	// static �̳�Ŭ������ �ƿ����� static������� ������� ����� �� �ִ�.
	public static class Hello{
		
		void show() {
			System.out.println("Hello.. show");
			//a=50; //error //�ƿ����� �ν��Ͻ������� ���Ұ�!
			b=50; //static����� ��� ����
		}
		
	}

}

