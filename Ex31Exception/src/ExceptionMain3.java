
public class ExceptionMain3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//코드를 통해서 예외를 강제로 발동
		try {
			System.out.println("aaa");
			//억지로 예외 발생! - 억지로 catch문으로 이동시키는 문법
			throw new Exception();
			
			//System.out.println("bbb"); //throw하면 이 코드는 실행될 수 없음
			
		}catch(Exception e) {
			System.out.println("예외발생!");
		}
		
		//[활용 예]
		//메소드에 계산을 요청했을 때 절대 음수가 결과로 나오지 않았으면...
		//즉, 만약 음수가 나오면 예외 상황이라고 인지했으면...함
		//java언어에서는 계산결과가 음수라고 해서 예외라고 판단하는 알고리즘은 없음.
		int n;
		
		try {			
			n =aaa(10,5);
			n= aaa(10, 15);
			System.out.println("n : "+n);
		}catch(Exception e) {
			System.out.println("계산결과가 음수입니다.");
			System.out.println( e.getMessage() );
		}
		
	}//main 메소드
	
	
	static int aaa(int a, int b) throws Exception {
		//음수가 나오는 상활일 때, 강제로 예외 발생!
		if(a<b) {
				throw new MyException("Hi"); //내가 만든 예외클래스 객체
				}		
				
		
		//만약, throw가 되면 아래 있는 뺄셈 작업을 수행하지 않음.
		return a-b;
		
	}
	
	
}//Main3 class

//나만의 Exception클래스 만들기 가능
class MyException extends Exception {
	//생성자
	public MyException(String msg) {
		super(msg);//부모클래스의 생성자를 통해 메세지 전달
	}
	
}

