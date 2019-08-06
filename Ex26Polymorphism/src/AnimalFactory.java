
public class AnimalFactory {

	//�ִϸ�(Dog, Cat, Pig)�� ������ ��� �޼ҵ�
	//�ִϸְ��� ��ü ����!
	
	Animal makeAnimal(int n) {
		
		Animal ani = null;
		
		switch(n) {
		
		case 1:
			ani =  new Dog();
			break;
			
		case 2:
			ani =  new Cat();
			break;
			
		case 3:
			ani =  new Pig();
			break;
		
		}//switch!
		
		return ani;
	}
}
