import java.util.Random;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Student ��ü ����
		Student stu = new Student();
		stu.name = "Sam";
		stu.kor = 80;
		stu.eng = 70;
		
		stu.show();
		
		Student stu2 = new Student();
		//���� ������ �����ϴ� ���� �ʹ� ¥��!
		
		//Robin, 100, 50 ������ �ѹ��� �Է��ϴ� ����� �ִٸ�?
		//���(method)�� ȣ���ϸ鼭 ���� ������ �� ����ϴ� ���� '�Ķ����'
		//stu2.�Է±��("robin", 100, 50); // Student Ŭ������ ��ɼ���
		stu2.setMembers("Robin", 100, 50);
		stu2.show();
		
		Student stu3 = new Student();
		stu3.setMembers("Hong", 80, 40);
		stu3.show();
		
		//������� �߿��� �ϳ��� �� �����ϱ�!
		stu3.eng=60; //�� ������ �Ұ��� ��쵵 ����!
		//���������ڸ� ���� �� ������ �Ұ���
		//�ڹٿ����� ������ ���������ڸ� ����ϵ��� ����..
		//�׷��Ƿ� ����� �ϳ��� �����ϴ� ����� �������� ��찡 ����
		//����� �ϳ��� �����ϴ� ��ɵ� ����� �δ� ���� ����
		stu3.setName("Kim");
		
		//������� ������ �����ϴ� ��� ����ϱ�.
		Student stu4 = new Student();
		stu4.name("Lee");
		stu4.kor(80);
		//stu4.eng= 700; //������ ���ɼ��� ����
		stu4.setEng(700); //�߸��� ���� ������ �����ְԲ� �� �� �ִ�.
		stu4.setEng(70);
		
		stu4.show();
		
		//�л������� ������ ����ϱ�
		int total= stu4.kor+stu4.eng;
		System.out.println("����: "+total);
		
		//total = stu3.kor + stu4.eng; //�Ǽ����� ����
		System.out.println("����: "+total);
		
		//������굵 Student ��ü���� ������� ������ �Ǽ��� ������ �پ���.
		total= stu4.calTotal(); //������ ����ؼ� �������ִ� ��� ȣ�� -> �Ǽ��� ������ ������! �޼ҵ带 ���� ����
		System.out.println("����: "+total);
		
		//��� return�� �޴� ������ �޼ҵ� ȣ���� �ͼ���
		Random rnd = new Random();
		int n = rnd.nextInt();
		
		//����� ����ϴ� ���!
		//double aver=(double)stu4.calTotal()/2; �ڵ尡 ȥ��������
		double aver=stu4.calAver();
		System.out.println("���: "+aver);
		
		aver=stu3.calAver2();
		System.out.println("���: "+aver);
		
		
		
		//������ ����� ��� ����Ͽ� �������ִ� ���? �����ұ�?
		//��, 2����  return�� �����ұ�? NO!
		//���� 2�� �̻��� �Ұ���!
		
		//������� �ϳ��� ���� �������ִ� ���!
		//��, ������� �ϳ� ���� �����ϴ� ���(set~)�� �ݴ� ����� ���� �޼ҵ�
		
		
		//name ������ stu4��ü��  name������� �� �����ϱ�
		//if ���������ڸ� ���� �Ұ������� �� ����.
		String name = stu4.getName();
		int kor = stu4.getKor();
		int eng = stu4.getEng();
		
		
		//�����ϸ� ��ü�� ����+�޼ҵ带 ���� �༮�� ��Ī��.
		//�޼ҵ常 �ִ� Ŭ������ ������ �� ����(��� ����.)
		
		
	}
}
