package bbb;

import aaa.AAA;
//상속받을 때도 다른 패키지의 클래스는 패키지명 .을 해야함
public class BBB extends AAA{

	//상속을 받았으므로 이미 멤버변수가 4개 존재함.
	
	void show() {
		//System.out.println(a); //상속받았더라도 부모의 private멤버는 사용불가
		//System.out.println(b); //default 접근 제한자는 다른 패키지에서는 사용불가
		System.out.println(c); //protected는 패키지가 달라도 상속관계라면 사용가능
		System.out.println(d); //public은 무조건 사용 가능
	}
}
