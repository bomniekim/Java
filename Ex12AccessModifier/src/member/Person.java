package member;

public class Person {
	
	//이름, 나이, 국적 (정보은닉)
	private String name;
	private int age;
	private String nation;
	
	//멤버값을 대입하는 기능 메소드 생성
	//다른 패키지에서도 사용가능하게 하려면 public으로 !
	
	public void setMembers(String name, int age, String nation) {
		//매개변수로 받은 값을 멤버변수로 대입해주기!
		this.name = name;
		this.age=age;
		this.nation=nation;
		
	}
	
	//멤버값을 출력해주는 기능을 가진 - 외부에서 쓰도록 public method
	public void show() {
		System.out.println(name+"  "+age+"  "+nation);
	}
	
	//멤버변수가 private이기에 값을 하나씩 변경 설정하는 기능을 가진 메소드들 필요
	//SetterMethod
	public void setName(String name) {
		this.name=name;
	}
	
	public void setAge(int age) {
		this.age=age;	
	}
	
	public void setNation(String nation) { //set + ctrl + space 단축키! -> 이클립스의 기능: SetterMethod
		this.nation = nation;
	}
	
	
	
	//Setter의 반대인 GetterMethod
	//멤버값 하나를 리턴해주는 기능을 가진 메소드 필요
	public String getName() {
		return name;		
	}
	
	public int getAge() {
		return age;
	}
	
	public String getNation() { //get + ctrl + space 단축키! -> 이클립스의 기능: GetterMethod
		return nation;
	}
	
	

	
	
	
	
	
}
