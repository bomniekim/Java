
public class Sample {

	
	public Sample() {
		System.out.println("Sample 객체 생성");
	}
	
	//객체가 소멸될 때 자동으로 1회 실행되는 메소드
	
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
		System.out.println("객체가 소멸되었음!");
		
	}
}
