//다중 구현(다중상속) : ,로 여러개 지정 가능 ... 개수제한 없음.
public class Sample implements AAA, BBB{
	
	//중복된 이름의 추상메소드는 1개만 오버라이드하면 됨.
	@Override
	public void aaa() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void bbb() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void ccc() {
		// TODO Auto-generated method stub
		
	}

}
