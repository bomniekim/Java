package student;

public class Student {

	String name; //학생이름
	int ban;	 //반
	int no;		 //번호
	int kor;	 //국어점수
	int eng;	 //영어점수
	int math;	 //수학점수
	
	
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
