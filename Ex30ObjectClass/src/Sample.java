
public class Sample {

	
	public Sample() {
		System.out.println("Sample ��ü ����");
	}
	
	//��ü�� �Ҹ�� �� �ڵ����� 1ȸ ����Ǵ� �޼ҵ�
	
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
		System.out.println("��ü�� �Ҹ�Ǿ���!");
		
	}
}
