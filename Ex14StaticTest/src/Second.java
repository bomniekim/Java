
public class Second {

	
	int a;
	static int b;
	
	static
	{
		System.out.println("static 초기화블럭");
		a=10; // error - 인스턴스 변수는 초기화 불가능
		b=50;
	}
	
	//초기화 블럭 - 인스턴스 초기화 블럭
	{
		System.out.println("instance 초기화 블럭");
		a=10;
		b=50;
	}
}
