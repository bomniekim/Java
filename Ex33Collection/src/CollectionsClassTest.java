import java.util.ArrayList;
import java.util.Collections;
import java.util.Queue;
import java.util.Stack;

public class CollectionsClassTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//CollectionsŬ������ static�޼ҵ�
		//1) Collections.sort()
		//2) Collections.shuffle()
		
		ArrayList<String> data= new ArrayList<String>();
		
		data.add("Nice");
		data.add("World");
		data.add("Hello");
		data.add("Android");
		data.add("hello");
		data.add("good");
		System.out.println( data.toString() );
		
		Collections.sort(data);//����Ʈ��ü�� ��ҵ��� �������� ����
		System.out.println( data.toString() );
		
		Collections.shuffle(data); //����Ʈ��ü�� ��ҵ��� ������
		System.out.println( data.toString());
		
		
		//�ڷᱸ������ ���� ������ 2���� ���屸��
		//Stack(����)�� Queue(ť)�� ������ ���
		
		//1. Stack : push(����߰�), pop(��� ������/��������) : FILO(First In Last Out) ���� ����� �����Ͱ� ���߿� ���´�.
		//2. Queue : offer(����߰�), poll(��� ������/��������) : FIFO(First In First Out) ���� ����� �����Ͱ� ���� ���´�. ex)Ű�������
		
		Stack<String> stack = new Stack<String>();
		stack.push("aaa");
		String s = stack.pop();
		
		Queue<String> queue=null;
		queue.offer("aaa");
		String s2 = queue.poll();
		
	}

}





