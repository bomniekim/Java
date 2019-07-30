package aaa;

// [이름, 나이, 주소] 데이터를 저장하는 학생 클래스 
// -이런식으로 비슷한 개념으로 인해 같은 이름을 사용하여 class를 만드는 경우가 종종 있음
// -이때 사용하는 것이 package라는 개념
public class Student {

	//default: 같은 패키지 내에서는 마음대로 사용
	public String name; // 다른 패키지에서도 사용가능하도록 
	int age;
	String address;
	
}
