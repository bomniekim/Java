
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//예) 앱에 동물캐릭터 종류 3종류(Dog, Cat, Pig)
		Dog d= new Dog();
		Cat c= new Cat();
		Pig p= new Pig();
		
		d.say();
		c.say();
		p.say();
		System.out.println();
		
		
		//만약 이런 동물객체들이 여러마리라면??
		//예) Dog가 5마리, Cat이 10마리, Pig 4마리..
		//이런식이면...
		//배열로 처리하면 반복문을 적용하여..손쉽게 프로그래밍 가능하겠지만	
		//캐릭터를 그룹으로 관리하고자 한다면.. 
		//3개의 캐릭터가 서로 다른 클래스 자료형이어서 한번에 배열로 묶을 수 없음.
		//Dog[] dogs= new Dog[5];
		
		//이럴때 Dog, Cat, Pig가 Animal과 상속관계라면..
		
		
		//부모참조변수로 자식객체를 제어할 수 있음
		Animal ani = new Dog(); //업 캐스팅
		Animal ani2 = new Cat();
		Animal ani3 = new Pig();
		
		ani.say(); //실제 참조하는 Dog객체의 say()가 호출됨
		ani2.say(); //야옹
		ani3.say(); //꿀꿀
		System.out.println();
		
		//Animal클래스 참조변수로 Dog, Cat, Pig를 모두 제어할 수 있으므로 
		//Animal 배열로 제어해보기...
		Animal[] anis = new Animal[5]; //Animal 참조변수가 5개
		System.out.println( anis[0]);
		System.out.println( anis[1]);
		System.out.println( anis[2]);
		System.out.println( anis[3]);
		System.out.println( anis[4]);
		
		//anis[0].say();// null error : 객체가  없잖아!
		
		anis[0] = new Dog();
		anis[1] = new Cat();
		anis[2] = new Pig();
		anis[3] = new Cat();
		anis[4] = new Dog();
		
		//다형성 : 모양은 같지만 결과는 전부 다름
		anis[0].say();
		anis[1].say();
		anis[2].say();
		anis[3].say();
		anis[4].say();
		System.out.println();
	
		System.out.println("---------");
		//위 처리를 반복문으로 작성 가능
		for(int i=0; i<anis.length; i++) {
			anis[i].say();
		}
		System.out.println();
		
		//이 반복문을 좀 더 쉽게: for each문 (확장된 for문)
		for(Animal t: anis) {
			t.say();
		}
		System.out.println();
		
		
		//다형성은 위 처럼 배열로 묶기 위해서만 사용되는 것이 아님
		//메소드의 파라미터(매개변수)나 리턴타입에도 매우 유용하게 사용됨
		//다음 프로젝트에서 소개!
		
	}

}
