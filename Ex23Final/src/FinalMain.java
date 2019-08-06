
public class FinalMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//지역변수에 final을 붙이면 상수화된 변수
		final int a=10;
		//a=20; //error: a의 값은 변경이 불가능
		
		//자바의 특이한 점
		final int b;
		b=5; //처음값을 대입해 주는 것을 초기화의 개념으로 처리
		//b=3; //error
		
		//멤버변수도 final 가능
		//Test클래스 설계
		
		
		
		//class에 final키워드 적용 - 상속불가
		//final클래스의 사용은 특별한 것이 없음 - 단지 상속만 불가
		//First를 상속하는 Second클래스 제작 시도해보기
		First f = new First();
		f.show();
		
	}

}
