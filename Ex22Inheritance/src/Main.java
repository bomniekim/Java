
public class Main {

	public static void main(String[] args) {
		
		//� ������ �������� �� ���� - ȸ������ ���
		//ȸ������: �Ϲ�ȸ��, �л�, ����, �ٷ��л�
		
		//1. �Ϲ�ȸ��: �̸�, ����
		//2. ��      ��: �̸�, ����, ����
		//3. ��      ��: �̸�, ����, ��������
		//4. �ٷ��л�: �̸�, ����, ����, ����
		
		//�Ϲ�ȸ��
		Normal p = new Normal("Sam", 20);
		p.show();
		System.out.println();
		
		//�л�
		Student stu = new Student("Robin", 23, "android");
		stu.show();
		System.out.println();
		
		//����
		Professor pro= new Professor("Kim", 45, "mobile optimization");
		pro.show();
		System.out.println();
		
		//�ٷ��л�
		Work alba = new Work("Hong", 22, "Java", "PC Manager");
		alba.show();
		System.out.println();
		
	}
	
	

}
