package student;

public class Student {

	String name; //�л��̸�
	int ban;	 //��
	int no;		 //��ȣ
	int kor;	 //��������
	int eng;	 //��������
	int math;	 //��������
	
	
	int getTotal() {
		int total = kor+eng+math;
		return total;
	}
	
	float getAverage() {
		float aver = (float)(kor+eng+math)/3;
		return aver;
	}
	
	void info(String name, int ban, int no, int kor, int eng, int math) {
		this.name=name;
		this.ban=ban;
		this.no=no;
		this.kor=kor;
		this.eng=eng;
		this.math=math;
	}
}
