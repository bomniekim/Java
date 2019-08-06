
public class Second extends First {

	//이미 First의 a 변수를 보유한 상태
	private int b;
	
	//멤버값 출력하는 기능 메소드 (상속받은 a변수도 출력해 줄 의무 있음)
	public void show() { //오버라이딩시 접근제한자 동일하게
		//System.out.println("a: "+a); //error : First a가 private이라서
		//부모객체의 멤버값을 출력하는 기능 메소드를 호출
		//show(); //부모의show()를 호출하려 했으나 이름이 같기에 재귀호출..
		
		//오버라이드되어 가려진 부모클래스의 show()메소드를 호출하려면
		//부모객체를 참조하는 특별한 참조변수 super를 이용해야만 함.
		
		super.show();//부모의 show()호출
		System.out.println("b: "+b);
	}
	
}
