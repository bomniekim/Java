
import java.util.Scanner;

public class Ex08MethodTestMain {

	//int a; Ŭ���� �ȿ� �ִ� ���� : �������(�ʵ�) �⺻�� 0
	
	public static void main(String[] args) {
		
		//�л� ���� ���� ���α׷�
		//�̸�, ����, ����, ��� (4���� ������ ����)
		
		//�������� - �⺻���� ������
		String name;
		int kor;
		int eng;
		double aver;
		
		name = "Sam"; // new String "Sam"
		kor=80;
		eng=70;
		aver=(double)(kor+eng)/2;
		
		//�л��� �������� ���
		//���� ���� �������� �ϳ��� �����ϴ� ���� ����
		//�������� �ڷḦ �Ѳ����� �����ϴ� �迭?! �̿��ϱ�
		
		String[] arrName= new String[4];
		int[] arrKor= new int[4];
		int[] arrEng= new int[4];
		double[] arrAver = new double[4];
		
		arrName[0] = "Sam";
		arrKor[0] = 80;
		arrEng[0] = 70;
		arrAver[0] = (double)(arrKor[0]+arrEng[0])/2;
		
		//��ó�� ���� �ڷ������� ��� ����ϴ� ����� �������� ���� - �л� 1���� �����Ͱ� �л�Ǿ� �־
		//��� ĭ�� �����Ͱ� ���� ������ �� �� ����
		
		//�׷��� �����ִ� �����ͳ��� (�̸�, ����, ����, ���) ��� �����ϴ� ���� �� ȿ����
		
		//�����ִ� �����ͳ����� ������ �����ϴ� ���� 'Class'��� ��
		//���ο� Ŭ������ ����(����)�Ϸ��� ���ο� .java���Ͽ� �ۼ� ����!
		
		
		//���� ����� Student Ŭ������ ��ü�� ����!
		
		StudentData stu = new StudentData();
		//System.out.println(stu);//��ü�� �ּ���� (���� �����ּҴ� �ƴ�)
		stu.name="Sam";
		stu.kor = 80;
		stu.eng=70;
		stu.aver=(double)(stu.kor+stu.eng)/2;
		
		
		StudentData stu2 = new StudentData();
		stu2.name="Robin";
		stu2.kor = 100;
		stu2.eng=80;
		stu2.aver=(double)(stu2.kor+stu2.eng)/2;
		
		
		//ȭ�����
		System.out.println("�̸�: "+stu.name);
		System.out.println("����: "+stu.kor);
		System.out.println("����: "+stu.eng);
		System.out.println("���: "+stu.aver);
		System.out.println();
		
		System.out.println("�̸�: "+stu2.name);
		System.out.println("����: "+stu2.kor);
		System.out.println("����: "+stu2.eng);
		System.out.println("���: "+stu2.aver);
		System.out.println(); 
		
		//��ü ����� ����
		int ko=50;
		stu2.kor= ko;
		System.out.println("����� �����: "+stu2.kor);
		System.out.println();
		
		//�����(Ű����) �Է����� ��ü�� ������� ����
		
		//Ű�����Է� ����� ���� ��ü�� ����
		Scanner sc = new Scanner(System.in);
		
		StudentData stu3 = new StudentData();
		stu3.name= sc.next(); //nextLine�� ���� �޾Ƶ���
		stu3.kor= sc.nextInt();
		stu3.eng= sc.nextInt();
		stu3.aver=(double)(stu3.kor+stu3.eng)/2;
		
		//��ü�� ����� ���..
		System.out.println("�̸�: "+stu3.name);
		System.out.println("����: "+stu3.kor);
		System.out.println("����: "+stu3.eng);
		System.out.println("���: "+stu3.aver);
		System.out.println();
		//�̷� ������ ��ü�� ������ ����ϴ� ����� �ʹ� ¥��!
		
		//�̷������� ����� �� �� �� �ִٸ�?
		//stu3.�����!(); //�̷����� ����� �ִٸ�?
		//�ٽø���, ��ü�� ��ɵ� �ִٸ�.. �� ���ϰ� ���α׷����� ����!
		
		//�ڹٴ� Ŭ���� �ȿ� ���(�Լ�/�޼ҵ�)�� ���� �� �ֵ��� �Ǿ� ����.
		//StudentData Ŭ���� �ȿ� ��� �߰��غ���!
		
		
		stu2.show(); //���(�޼ҵ�)�� ȣ��
		
		//show()ó�� ����� ȣ���� �� ������
		//��������� ���� ����ϴ� ��ɵ� ����� ȣ���� �� �ְ���?
		stu3.output();
		
		//�̷����̸� ��հ���� �ϴ� ��ɵ� �����ϰ���
		//��հ���� ���ִ� ����� ����� �� ������ �������?
		StudentData stu4 = new StudentData();
		stu4.name = "Hong";
		stu4.kor=70;
		stu4.eng=75;
		stu4.calAver; //��հ�� ���ȣ��!
		
		stu4.output();
		
		//��ó�� �޼ҵ带 �� ����ϸ� �ڵ尡 �ξ� �����ϰ� �������� ������.
		
		//��������� �ϳ��� �Է��ϴ� ��ɵ� ���� ���� �� ����
		//�� �� �ٿ� ������� �Է��ϴ� ���
		
		//stu4.�Է���("lee", 100, 50); //�̷����� ����� �ִٸ� �� ����..
		//��, �޼ҵ��� �Ķ���Ϳ� ���� �����ϴ� ���!
		
		
		//�̷�������..
		//Student stu5= new Student();
		//stu5.�Է±��("park", 100, 50);
		//stu5.��±��();
		
		
		
		
		
	

	}

}
