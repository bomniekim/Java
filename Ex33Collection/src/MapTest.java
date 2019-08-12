import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class MapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Ű-���� �� (key-value pair)���� �����͸� �����ϴ� ���
		//Key�� �ߺ�X, Value�� �ߺ�O
		
		
		//Map�� �������̽��̹Ƿ� ���� ��ü ���� �Ұ�!
		//Map�������̽��� ������ ���� Ŭ�������� ��ü�� ���� ���
		
		//1. HashMap: �������X, ������� �ľ� �����. Map�߿��� ���� ���� ����.
		//2. TreeMap: ��(Ű���� ������ ����)�� ���� ������������ ����
		//3. LinkedHashMap: ����� �������� ���ĵ�. ���� ���� �� ����.
		//4. HashTable: HashMap�� 99%���� (��ƼThread�϶� ����ȭ ó�� �Ǿ� ����)
		
		//Map�������̽��� Collection�������̽��� ������� �ʾ����Ƿ�
		//Collection�������̽��� (�߻�)�޼ҵ带 ��� ������ �ִٰ� Ȯ���� �� ����.
		//������ add()�޼ҵ� ����
		
		//<key, Value>
		HashMap<String, String> map = new HashMap<String, String>();
		TreeMap<String, String> map2 = new TreeMap<String, String>();
		LinkedHashMap<String, String> map3 = new LinkedHashMap<String, String>();
		
		//��� �߰�
		map.put("Name", "Hong");
		map.put("ID", "bomnie");
		map.put("PW", "a1234");
		
		System.out.println( map.size() ); // 3
		
		
		//��� ������
		System.out.println( map.get("Name") ); //�ξ� �ĺ����� ���� ������ : ���� ���� ����
		System.out.println( map.get("ID") );
		System.out.println( map.get("PW") );
		
		
		//�ߺ�?
		map.put("kkk", "Hong"); //Key���� �ٸ��� Value�� ���� : ���尡�� -> map.size():4
		map.put("kkk", "nice"); //Key���� �ߺ��Ǹ� ������ �ȵǴ� ���� �ƴ϶� �� Key���� Value�� ����� ��.
		System.out.println( map.get("kkk") ); // nice
		
		
		//��Ҹ� ���������� ���ͼ� ����ϱ� -> ��� �� �������� ����
		//index�� �����Ƿ� for�����δ� �Ұ���!
		//for each���� ���������� �Ұ���!
		
		//���1. Map���� Key���鸸 �̾ƿͼ� ó��
		Set<String> keys = map.keySet();
		//1-1. key������ for each������ �����ϱ�
		for(String key : keys) {
			String value = map.get(key);
			System.out.println( key+" : "+value );
		}
		System.out.println();
		
		//1-2. key���� ������ �ִ� Set�� iterator(�ݺ���)�� �̿��ϴ� ���
		Iterator<String> data = keys.iterator();
		while( data.hasNext() ) {
			String key = data.next();
			System.out.println( key+" : "+map.get(key) );
		}
		
		//���2. Map��ü�� Set��ü�� ��ȯ�Ͽ� ����
		//Map�� ���(Key-Value pair) ��ü�� Entry�� Set������
		Set< Entry<String, String> > entries = map.entrySet();
		//Entry�� ������ �ϴ� ����� ���1�� ����
		for ( Entry<String, String> e : entries) {
			System.out.println(e.getKey() +" : "+e.getValue() );
		}
		
		
		//�ĺ���(key)�� int�� ����ϱ�
		//<>generic�ȿ����� ������ �ڷ����� ����
		//HashMap<int, String> maps = new HashMap<int, String>(); //error
		//int->Integer������ ����ϱ�
		HashMap<Integer, String> map5 = new HashMap<Integer, String>();
		map5.put(new Integer(0), "aaa");
		map5.put(1, "bbb"); //�ڵ� new Integer(1)- ���� �ڽ�
		map5.put(2, "ccc");
		
		for(int i=0; i<map.size(); i++) {
			String s= map2.get(i);
			System.out.println(s);
			}
	}
}
