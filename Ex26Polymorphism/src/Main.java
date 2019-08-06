import java.util.Random;

public class Main {

	public static void main(String[] args) {

		
		//애니멀(Dog, Cat, Pig) 객체들을 만들어내는 
		//애니멀 공장 객체 생성!
		
		AnimalFactory af = new AnimalFactory();
		
		Dog d = (Dog)af.makeAnimal(1); //이 메소드
		d.say();
		d.guardHouse();
		
		Cat c = (Cat)af.makeAnimal(2);
		c.say();
		c.handleDeacon();
		
		Pig p = (Pig)af.makeAnimal(3);
		p.say();
		p.eatAndEat();
		
		System.out.println();
		
		
		
		//Animal 참조변수 1개로 여러 객체 제어하기
		Animal ani = null;
		ani=af.makeAnimal(1);
		ani.say();
		Dog dog = (Dog)ani; //다운캐스팅 - 참조변수를 새로 만들어서 공유
		dog.guardHouse();
		
		ani=af.makeAnimal(2);
		ani.say();
		((Cat)ani).handleDeacon();
		//연산자 우선순위: 접근연산자가 형변환 연산자 보다 우선 - 안드로이드에서 흔히 사용하는 모습
		
		ani=af.makeAnimal(3);
		ani.say();
		((Pig)ani).eatAndEat();
		
		System.out.println();
		
		
		//응용해보기 
		//랜덤하게 동물들이 만들어졌으면..
		
		//먼저.. 랜덤값 만들어내는 객체 소환!
		Random rnd = new Random();
		
		//여러마리를 다루려면 배열로!
		Animal[] anis = new Animal[5];
		for(int i=0; i<5; i++) {
			int n = rnd.nextInt(3)+1; // 1, 2, 3
			
			anis[i] = af.makeAnimal(n);
		}
		
		//각 객체들의 기능 호출
		for(int i=0; i<anis.length; i++) {
			
			//동물객체들의 공통기능(Animal클래스가 가진 메소드)
			anis[i].say();
			anis[i].sleep();
			
			//각 배열요소객체들(Dog, Cat, Pig)의 고유기능들 실행하고 싶어!
			//참조변수가 참조하는 객체가 어떤 클래스인지를 확인하는 연산자: instanceof
			if(anis[i]instanceof Dog) { //참조변수 instanceof 클래스명 -> true/false
				Dog d4=(Dog)anis[i];
				dog.guardHouse();
			}
			
			if(anis[i]instanceof Cat) { 
				((Cat)anis[i]).handleDeacon();
			}
			
			if(anis[i]instanceof Pig) { 
				((Pig)anis[i]).eatAndEat();
			}
			
			//여기서 잠깐!
			//Animal 클래스의 존재이유는 상속해주기 위해서! 객체생성목적X
			//근데.. 실수로 Animal객체를 생성할 수도 있음
			//실수로 Animal객체를 생성하는 것을 막기 위해서 - abstract(추상) 키워드 사용하기
			
			//Animal ani5 = new Animal(); //error처리됨
			//ani5.say(); //????
			//추상클래스는 객체 생성(new)가 불가능!
	
			
			
			//추상클래스는 그냥 사용하는 것이 아니라 상
			
			
			
			
			
		
		}//main method

//
		
}//Main class

}
