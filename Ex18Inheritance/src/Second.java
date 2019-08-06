
//First클래스를 상속받는 Second클래스
public class Second extends First {

	//그냥보면 멤버가 하나도 없는 것처럼 보이지만
	//상속받은 First클래스의 멤버를 보유하고 있음
	
	//멤버변수 추가
	int b;
	
	//본인 멤버변수를 출력하는 기능
	void showSecond() {
		System.out.println("b: "+b);
	}
	
	
	//상속받은 클래스의 멤버까지 출력하는 기능
	void show() {
		//System.out.println("a: "+a);
		//객체지향은 객체의 멤버값 출력은 그 객체가 직접!
		showFirst(); //혼합!
		
		System.out.println("b: "+b);
		System.out.println();
		
	}
	
	//멤버값 대입하는 기능 (상위클래스의 멤버까지 대입해줄 의무가 있음)
	void setMembers(int a, int b) {
		//this.a=a; //변수 a는 Second가 아닌 First이므로 this키워드가 이상
		//자식클래스에서 부모클래스의 멤버를 .연산자로 지칭할 때 사용하는
		//특별한 키워드 : super
		//super.a=a;
		//부모클래스의 멤버를 직접 대입하는 것은 좋지 않음 - 니껀 니가!
		//멤버값을 입력하는 기능 사용을 권장!
		
		super.setA(a); //부모클래스의 메소드 사용
		//super생략가능
		
		this.b=b; //본인클래스의 멤버변수는 직접 대입하고 
	}
	
	
	
}












