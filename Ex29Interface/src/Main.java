
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
	
		//������ �������̽��� �����ϰ� �߻�޼ҵ��� �̸��� ���ϸ�
		//�������� �� �̸��� ���� ����� �����Ͽ� Ŭ������ ������
		
		//����: Unit �������̽� ����
		//����1: MarineŬ���� ���� �� Unit ���� - attack�� move��� �⺻��� ���� -> �޼ҵ� �̸� ����
		//����2: TankŬ���� ���� �� Unit ���� - attack�� move��� �⺻��� ���� -> �޼ҵ� �̸� ����
		//����3: RaceŬ���� ���� �� Unit ���� - attack�� move��� �⺻��� ���� -> �޼ҵ� �̸� ����
		
		// Marine, Tank, Race ��ü�� attack(), move() ����� ������ Ȯ���� �� ����
		
		//������ ������� Ŭ������ �̿��Ͽ� ��ü���� �� ���� �˰����� �ڵ�
		
		//�� Ŭ������ ���������� ������� �ʰ�..
		//�θ�Ŭ������ ������ Unit�������̽��� ���������� �̿��Ͽ�
		//��� ���ְ�ü���� �����ϰ��� ��.
		
		//�迭�� �̹� ������ ������ �����ؾ߸� ��(����)
		//���� ������ ������ ������ ���������� ����� (������ �Ҹ��� �ݺ�)
		//Unit[] units = new Unit[200];
		
		//���� �����̳� �ۿ����� ������ �迭(�������� ����) : ArrayListŬ���� ���
		
		ArrayList<Unit> units = new ArrayList<Unit>(); //���� �ڿ� ���� �ٴϴ� ȭ���� ������ �̸� ����
		
		//����� ���� �˾Ƴ���!
		int num = units.size();
		System.out.println("���ְ���: "+num); //���� ����� �����ϱ� ���ְ���: 0
		
		//�迭�� Unit��ü�� �����Ͽ� �߰�
		units.add(new Marine());
		units.add(new Tank());
		units.add(new Marine());
		units.add(new Race());
		
		System.out.println("���ְ���: "+units.size()); // ���ְ���: 4
		
		//���ֵ��� ����� ����ϱ�
		for(int i=0; i<units.size(); i++) {
			Unit u = units.get(i); // Unit���������� �ޱ�
			u.attack();
			u.move();
			System.out.println();
		}
	
		//for each��
		for(Unit unit : units) {
			unit.attack();
			unit.move();
			
			//��������� �߰��ؼ� ���
			//unit�� Marine�� Tank�϶��� levelup��� ���
		
//		if( unit instanceof Marine ) {
//			Marine m= (Marine)unit;
//			m.levelup();
//		}else if( unit instanceof Tank) {
//			((Tank) unit).levelup();
//		}
		//�������� Marine�� Tank�� ��� Levelupable�� �ڽ��̹Ƿ�..
		if( unit instanceof Levelupable ) {
			Levelupable a= (Levelupable)unit;
			a.levelup();
		}
		
		System.out.println();
		
		}
		
			
		
		
	}
}
