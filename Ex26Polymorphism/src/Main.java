import java.util.Random;

public class Main {

	public static void main(String[] args) {

		
		//�ִϸ�(Dog, Cat, Pig) ��ü���� ������ 
		//�ִϸ� ���� ��ü ����!
		
		AnimalFactory af = new AnimalFactory();
		
		Dog d = (Dog)af.makeAnimal(1); //�� �޼ҵ�
		d.say();
		d.guardHouse();
		
		Cat c = (Cat)af.makeAnimal(2);
		c.say();
		c.handleDeacon();
		
		Pig p = (Pig)af.makeAnimal(3);
		p.say();
		p.eatAndEat();
		
		System.out.println();
		
		
		
		//Animal �������� 1���� ���� ��ü �����ϱ�
		Animal ani = null;
		ani=af.makeAnimal(1);
		ani.say();
		Dog dog = (Dog)ani; //�ٿ�ĳ���� - ���������� ���� ���� ����
		dog.guardHouse();
		
		ani=af.makeAnimal(2);
		ani.say();
		((Cat)ani).handleDeacon();
		//������ �켱����: ���ٿ����ڰ� ����ȯ ������ ���� �켱 - �ȵ���̵忡�� ���� ����ϴ� ���
		
		ani=af.makeAnimal(3);
		ani.say();
		((Pig)ani).eatAndEat();
		
		System.out.println();
		
		
		//�����غ��� 
		//�����ϰ� �������� �����������..
		
		//����.. ������ ������ ��ü ��ȯ!
		Random rnd = new Random();
		
		//���������� �ٷ���� �迭��!
		Animal[] anis = new Animal[5];
		for(int i=0; i<5; i++) {
			int n = rnd.nextInt(3)+1; // 1, 2, 3
			
			anis[i] = af.makeAnimal(n);
		}
		
		//�� ��ü���� ��� ȣ��
		for(int i=0; i<anis.length; i++) {
			
			//������ü���� ������(AnimalŬ������ ���� �޼ҵ�)
			anis[i].say();
			anis[i].sleep();
			
			//�� �迭��Ұ�ü��(Dog, Cat, Pig)�� ������ɵ� �����ϰ� �;�!
			//���������� �����ϴ� ��ü�� � Ŭ���������� Ȯ���ϴ� ������: instanceof
			if(anis[i]instanceof Dog) { //�������� instanceof Ŭ������ -> true/false
				Dog d4=(Dog)anis[i];
				dog.guardHouse();
			}
			
			if(anis[i]instanceof Cat) { 
				((Cat)anis[i]).handleDeacon();
			}
			
			if(anis[i]instanceof Pig) { 
				((Pig)anis[i]).eatAndEat();
			}
			
			//���⼭ ���!
			//Animal Ŭ������ ���������� ������ֱ� ���ؼ�! ��ü��������X
			//�ٵ�.. �Ǽ��� Animal��ü�� ������ ���� ����
			//�Ǽ��� Animal��ü�� �����ϴ� ���� ���� ���ؼ� - abstract(�߻�) Ű���� ����ϱ�
			
			//Animal ani5 = new Animal(); //erroró����
			//ani5.say(); //????
			//�߻�Ŭ������ ��ü ����(new)�� �Ұ���!
	
			
			
			//�߻�Ŭ������ �׳� ����ϴ� ���� �ƴ϶� ��
			
			
			
			
			
		
		}//main method

//
		
}//Main class

}
