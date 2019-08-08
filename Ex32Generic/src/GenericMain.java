import java.util.Random;

public class GenericMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 데이터 하나를 멤버변수로 저장하여 가지고 있는 Box객체
		Box box = new Box();

		box.setA(10);
		System.out.println(box.getA());

		box.setA(3.14);
		System.out.println(box.getA());

		box.setA("Hello");
		System.out.println(box.getA());

		
		// 만능박스를 만든 것처럼 보임.. 일부 인정할만 함
		// 값을 가져올 때는 좀 짜증 [명시적으로 다운캐스팅을 해야만 사용 가능]
		box.setA(10);
		int n = (int) box.getA(); // Object->Integer->int

		box.setA(3.12);
		double d = (double) box.getA(); // Object->Double->double

		box.setA(new String("Nice"));
		String s = (String) box.getA();// 다운캐스팅: Object->String

		
		
		
		
		// 클래스 하나를 설계해서 여러 자료형을 모두 가질 수 있는 객체로 만들기!
		// 객체를 생성할 때 자료형을 결정하는 기법!
		Box2<String> box2 = new Box2<String>();
		box2.a = "aaa";

		Box2<Random> box3 = new Box2<Random>();
		box3.a = new Random();

		
		
		// 기본형 자료형은 Generic <>에 사용 불가!
		// Box2<int> box4= new Box2<int>();//error

		// 제네릭은 참조형만 가능
		// 그럼 기본형데이터는 어떻게? Wrapper클래스 이용
		
		Box2<Integer> box5 = new Box2<Integer>();
		box5.setA(10);// 오토 박싱
		int k = box5.getA();// 오토 언박싱

		
		
		
		// 2개 이상의 제네릭
		Box3<String, Integer> box6 = new Box3<String, Integer>();
		box6.a = "Hello";
		box6.b = 10;

		Box3<Integer, Random> box7 = new Box3<Integer, Random>();
		box7.a = 100;
		box7.b = new Random();

	}

}// Main class



//제네릭은 2개의 이상의 자료형도 가능함.
class Box3<T, K> {
	T a;
	K b;
}



//클래스명< > : 제네릭 문법 - 자료형은 아직 미정인 상태로 클래스를 설계하는 기법
//글자바꿔치기 같은 느낌 : T라는 글자가 new할 때 결정된 클래스로 변경됨.
class Box2<T> {
	// 멤버변수 - 이 자료형이 만능이었으면.....
	T a;

	public void setA(T a) {
		this.a = a;
	}

	public T getA() {
		return a;
	}
}




class Box {

	// 만능 자료형! 어떤 자료형이든 가질 수 있는 멤버변수
	// [Object]
	private Object a;

	public void setA(Object a) {
		this.a = a;
	}

	public Object getA() {
		return this.a;
	}

}



