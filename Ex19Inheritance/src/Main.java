
public class Main {

	public static void main(String[] args) {
		
		Second s = new Second();
		s.show();

		//파라미터를 전달하는 생성자 오버로딩
		Second s2 = new Second(10,20);
		s2.show();
		
		Second s3 = new Second(10,50);
		s3.show();

		
		//상속의 상속 가능 (조부모 - 부모- 자식)
		//Second를 상속한 Third클래스
		new Third();
		System.out.println();
		

		//상속에 사용되었던 First클래스를 Second가 아닌 다른 클래스가
		//또 다시 상속해서 사용해도 됨!!!
		//First를 상속한 Test클래스
		new Test();
		System.out.println();
		
		
		
	}

}
