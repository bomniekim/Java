
public class Student {

	//�������(�ʵ�)
	
	String name;
	int kor;
	int eng;
	
	
	//����޼ҵ�
	//��������� ���� ����ϴ� ���(Method) ����
	
	void show() {
		System.out.println("�̸�: "+ name);
		System.out.println("����: "+ kor);
		System.out.println("����: "+ eng);
		System.out.println();
	}
	
	//��������� ���� �����ϴ� ���(Method) ����
	//SetterMethod
	void setMembers(String n, int k, int e) {
		//�Ű������� ���޹��� ���� ��������� �������ֱ�!
		name= n;
		kor=k;
		eng=e;
	
	}
	
	//name��������� �� �����ϴ� ���
	void setName(String n) {
		//���޹��� �Ű������� ���� ��������� ����
		name = n;
	}
	
	//kor ��������� ���� �����ϴ� ���
	void setKor(int k) {
		kor=k;
	}
	
	
	//eng ������� �� ���� ����
	void setEng(int e) {
		//�߸��� ���� ������ ������ �� ����.
		if(e<0 || e>100 ) {
			System.out.println("�߸��� ���� �Է��Դϴ�.");
			return;//�Լ�����
		}
		else eng = e;
	}
	
	//������ ����Ͽ� �������ִ� ���
	int calTotal() { //�����Ϸ��� total�� �ڷ����� ����Ÿ�Կ� ����
		//�������
		int total=kor+eng;
		return total;
	}
	
	//����� ����Ͽ� �������ִ� ���
	double calAver() {
		//��հ��
		double aver=(double)(kor+eng)/2;
		return aver;
	}
	
	//����޼ҵ忡�� �ٸ� �޼ҵ带 ȣ���� �� ����
	double calAver2() {
		//��հ��
		int total = calTotal(); //��Ż������ִ� �ٸ� �޼ҵ� ȣ��
		double aver=(double)total/2;
		return aver;
	}
	
	//���� 2�����ֱ�!
//	void calTotalAndAver() {
//		int total=calTotal();
//		double aver=calAver();
//		
//		return total, aver;
//	}
	
	
	//��������� ���� �������ִ� ���! (set~�� �ݴ���)
	//GetterMethod
	 String getName() {
		return name;
	}
	 
	 int getKor() {
		 return kor;
	 }
	 
	 int getEng() {
		 return eng;
	 }
	 
	 //��������� ���ڸ�ŭ Getter & Setter Method�� ����� ��
}

