
public class Normal {

	private String name;
	private int age;
	
	//생성자 메소드 :객체 생성(new)시 한 번 자동으로 실행되는 메소드
	public Normal() {
		name="no name";
		age=0;
	}
	
	//생성자 오버로딩 - 파라미터로 이름과 나이 전달 받아 멤버변수에 대입
	public Normal(String name, int age) {
		this.name=name;
		this.age=age;
	}
	
	public void show() {
		System.out.println("name: "+name);
		System.out.println("age: "+age);
	}
	
}
