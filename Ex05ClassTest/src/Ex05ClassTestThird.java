
public class Ex05ClassTestThird {
	//Ŭ������ �������(�ʵ�)�� ����Լ�(�޼ҵ�)�� ����
	
	//�������(Ŭ���� �ȿ�)
	int a;
	
	//����Լ�
	void show() {
		System.out.println("Third Show!");
		
		int k; //�������X, (�޼ҵ� �ȿ� �ִ� ��������) 
		
		//�޼ҵ� �ȿ� Ŭ���� �ۼ��ϱ�...
		//Embedded Class(����Ŭ����)
		class Nice {
			int z;
			void aaa() {
				
			}//Nice Class.. �������� ������ ����
		}
		
		class World{
			
		}
		
		//����Ŭ������ Ȱ���� ��
		//�͸� Inner Class
		new Test() {
			@Override
			void show() {
				System.out.println("Hello show");
			}
		};	
	}//show method..
}
	
	//Ŭ���� �ȿ� Ŭ���� �ۼ��ϱ� ////////
	//Inner Class
	class Hello {
		
	}
	//////////////////////////////
//Third class..


//�ϳ��� .java���� �ȿ� 2�� �̻��� class �ۼ� ������
//�ٸ� class�� �ν� (Amazing!) 


//��, �ϳ��� .java���� �ȿ��� public class�� 1���� �־�� ��!
//�׸��� .java������ ���ϸ��� public class��� ���ƾ߸� ��
class Test {
	void show() {
		System.out.println("Test Show!");
	}
}
//Test�� Third �ȿ� �ִٰ� �ν����� ����