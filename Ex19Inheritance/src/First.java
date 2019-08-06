
public class First {
	//접근제한자 적용
	private int a;	
	
	//멤버값 출력하는 기능
	public void showFirst() {
		System.out.println("a: "+ a);
	}
	
	//생성자
	public First() {
		System.out.println("Fisrt 객체 생성");
	}
	
	//파라미터를 전달받는 생성자 오버로딩
	public First(int a) {
		this.a=a;
		System.out.println("Fisrt 객체 생성, int");
	}

}
