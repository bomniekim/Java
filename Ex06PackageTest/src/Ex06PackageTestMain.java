
import bbb.Student; //bbb ��Ű�� ���� Student Ŭ������ ���ϰ� ����ϵ���...
import bbb.Person;

//�ѹ��� bbb ��Ű�� �ȿ� �ִ� ��� Ŭ�������� import�ϱ�
import bbb.*;

public class Ex06PackageTestMain {

	public static void main(String[] args) {

		//class ���� �� ��ü���� �� ���
		Test t = new Test();
		t.a=10; //������� ���
		t.show(); //����޼ҵ� ���
		
		//���� �̸��� class�� ����ϴ� ������ ���� �� ����
		
		//��������� Ŭ������ Student�� ��ü �����Ͽ� ���
		//[�̸�, ����, ����] ������ ����
		bbb.Student stu = new bbb.Student();
		stu.name="Sam";
		stu.kor=80;
		stu.eng=70;
		
		//[�̸�, ����, ����] ������ �����ϴ� ��ü �� �� �� ����
		//�s������ �Ź� �߰��ϴ� ���� ����
		//��Ű������ �����ϴ� ��� - import
		//bbb�� ���� �ʾƵ� �˾Ƶ���
		Student stu3 = new Student();
		Student stu4 = new Student();
	
		java.util.Random rnd = new java.util.Random();
		//�� ó�� ��Ű������ �����ϱ� ���� import java.util�� ����ߴ� ��!
		
		
		//[�̸�, ����, �ּ�] �����͸� �����ϴ�  Student ��ü ����
		//�ٸ� ��Ű���� �մ� class�� ����ϱ�
		aaa.Student.stu2 = new aaa.Student();
		
		//�ٸ� ��Ű���� class�� ��ü�� �����
		//��ü�� ��������� ����޼ҵ带 ������ �� �� �ִٰ� Ȯ���� �� ����
		//��ü�� ����� ��ȣ�Ǿ� ���� [������������ �����߻�]
		
		stu2.name="Robin"; //public ����� �ٸ� ��Ű�������� ���� ����
		//stu2.age=20; error: default����� ���� �Ұ�
		
		
		//bbb ��Ű�� ���� Person Class ����ϱ�
		bbb.Person p = new bbb.Person();
		//��Ű���� �������� import.bbb.Person
		Person p = new Person(); // ���� 
		
		
		//���� �̸��� ���� Student Ŭ������ ���ÿ� import�� �Ұ�
		
		//@@��Ű������ ���� �� �������@@
		// ��Ű������ ������.�� �������� �ϴ� �� �ܾ� �̻��� ����
		//ex) aaa.bbb, mrhi.dev.android.. �̷� ��
		
		
		
		
	}

}
