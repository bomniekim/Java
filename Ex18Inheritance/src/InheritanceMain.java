
public class InheritanceMain {

	public static void main(String[] args) {

		Second s = new Second();
		s.a=10; //상속받은 클래스의 멤버를 내 것인양 사용 가능
		s.b=20;
		
		System.out.println("a: "+s.a);
		System.out.println("b: "+s.b);
		System.out.println();
		
		//상속된 객체의 모습을 그림으로 해석
		//상속은 멤버들을 준 것으로 보이지만 실제로는 [객체 안에 객체]가 있는 것. 
		//마트료시카처럼
		//상속관계에 대한 호칭: 상위-하위/ 부모-자식/ 슈퍼-서브/ 기반-파생(유도) 
		// C#: parent-child / Java: super-sub / C++: base-derived / 
		
		//객체지향은 멤버변수 제어를 직접 .연산자로 하는 것을 권장하지 않음
		//멤버값을 출력하는 기능(메소드)을 만들어서 사용하는 것을 권장
		
		s.showFirst(); //상위 클래스의 멤버를 내 것인양!
		System.out.println("b: "+s.b);
		System.out.println();
		
		//이런식이면 Second도 출력기능을 만들 수 있겠지
		s.showFirst();
		s.showSecond();
		System.out.println();
		
		
		//여기까지 하고보니 결국 Second객체는 a,b 모두를 출력하는 기능이 있어야 함
		s.show();

		
		//이런식이면 값을 대입하는 기능도 있으면 좋겠다!
		s.setMembers(100,200);
		s.show();
		
		//2번째 객체를 만들어 사용할 때 편하게...
		Second s2= new Second();
		s2.setMembers(50, 20);
		s2.show();


		//근데... 객체를 만들면서 값을 대입하면 더 간결하지 않을까?
		//그래서 객체 생성(new)할 때 자동으로 한번 실행되는 메소드 이용!
		//생성자(Constructor)
		//Second s3= new Second(8, 3);
		//s3.show();
		
		//그 전에 미리 체크할 내용이 있음.
		//상속을 해도 접근제한자의 영향이 있음!!
		//상위클래스의 private멤버는 하위클래스에서 접근할 수 없음.
		
		//protected접근제한자 까지 알아보기 위해서..
		//별도의 클래스 만들어서 테스트해보기...
		//서로 다른 패키지(Package)의 클래스들을 상속관계로 만들고 확인
		
		//생성자 사용에 대해 학습!
		//새로운 프로젝트로!
		
		}
		
}




















