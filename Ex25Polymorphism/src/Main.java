
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//��) �ۿ� ����ĳ���� ���� 3����(Dog, Cat, Pig)
		Dog d= new Dog();
		Cat c= new Cat();
		Pig p= new Pig();
		
		d.say();
		c.say();
		p.say();
		System.out.println();
		
		
		//���� �̷� ������ü���� �����������??
		//��) Dog�� 5����, Cat�� 10����, Pig 4����..
		//�̷����̸�...
		//�迭�� ó���ϸ� �ݺ����� �����Ͽ�..�ս��� ���α׷��� �����ϰ�����	
		//ĳ���͸� �׷����� �����ϰ��� �Ѵٸ�.. 
		//3���� ĳ���Ͱ� ���� �ٸ� Ŭ���� �ڷ����̾ �ѹ��� �迭�� ���� �� ����.
		//Dog[] dogs= new Dog[5];
		
		//�̷��� Dog, Cat, Pig�� Animal�� ��Ӱ�����..
		
		
		//�θ����������� �ڽİ�ü�� ������ �� ����
		Animal ani = new Dog(); //�� ĳ����
		Animal ani2 = new Cat();
		Animal ani3 = new Pig();
		
		ani.say(); //���� �����ϴ� Dog��ü�� say()�� ȣ���
		ani2.say(); //�߿�
		ani3.say(); //�ܲ�
		System.out.println();
		
		//AnimalŬ���� ���������� Dog, Cat, Pig�� ��� ������ �� �����Ƿ� 
		//Animal �迭�� �����غ���...
		Animal[] anis = new Animal[5]; //Animal ���������� 5��
		System.out.println( anis[0]);
		System.out.println( anis[1]);
		System.out.println( anis[2]);
		System.out.println( anis[3]);
		System.out.println( anis[4]);
		
		//anis[0].say();// null error : ��ü��  ���ݾ�!
		
		anis[0] = new Dog();
		anis[1] = new Cat();
		anis[2] = new Pig();
		anis[3] = new Cat();
		anis[4] = new Dog();
		
		//������ : ����� ������ ����� ���� �ٸ�
		anis[0].say();
		anis[1].say();
		anis[2].say();
		anis[3].say();
		anis[4].say();
		System.out.println();
	
		System.out.println("---------");
		//�� ó���� �ݺ������� �ۼ� ����
		for(int i=0; i<anis.length; i++) {
			anis[i].say();
		}
		System.out.println();
		
		//�� �ݺ����� �� �� ����: for each�� (Ȯ��� for��)
		for(Animal t: anis) {
			t.say();
		}
		System.out.println();
		
		
		//�������� �� ó�� �迭�� ���� ���ؼ��� ���Ǵ� ���� �ƴ�
		//�޼ҵ��� �Ķ����(�Ű�����)�� ����Ÿ�Կ��� �ſ� �����ϰ� ����
		//���� ������Ʈ���� �Ұ�!
		
	}

}
