import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class SetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Set �������̽�: ������� ����X, �ε��� ��ȣX, Data�ߺ� ���X

		// Set<String> set = new Set<String>(); //error : �������̽��� ��ü������ �Ұ�

		// Set�������̽��� ����(implements)�� ����Ŭ������ ��ü�� ���� ���
		// 1. HashSet: ���� ������ �ľ��ϱ� �����. �ؽ����̺��̶�� �Ϳ� ���ؼ� ������ ����. Set�迭 �߿��� ���� ������ ����
		// 2. TreeSet: ������ �������� ���� ���� ���ĵǴ� Set. red-black Ʈ����� �˰��� ���. HashSet���� ������ �ణ ����
		// 3. LinkedHashSet: ����� ������� ���� ���ĵ�. ������ ���� �� ����

		// Set�������̽��� Collection�������̽��� ����Ͽ� ������� ��ŭ, Collection�������̽��� (�߻�)�޼ҵ带 ��� ������ �ִٰ� Ȯ���� �� ����.
		// ex) add(), remove(), clear(), size(), contains() ���� ��� ������ ����

		//HashSet<String> set= new HashSet<String>();
		//TreeSet<String> set= new TreeSet<String>();
		LinkedHashSet<String> set= new LinkedHashSet<String>();

		// ����߰�
		set.add(new String("aaa"));
		set.add("bbb"); // set.add( new String("aaa") );
		set.add("apple");
		set.add("bear");
		set.add("apple");
		set.add("dollar");
		set.add("eclipse");
		set.add("forest");
		set.add("ghost");
		set.add("bear");

		// ��Ұ��� / ����� �� �ܼ����
		System.out.println(set.size() + ":" + set.toString());
		// �ߺ��� Data�� ������ �����δ� �ߺ��� ���ؼ� ���� (�ߺ��� data ���� ����)

		// ��� ������.. but get()�޼ҵ尡 ����: �ε��� ��ȣ�� ���� ����

		// ������ ��� : ���ʴ�� �����ϴ� ���
		// ���1. for each
		for (String e : set) {
			System.out.println(e);
		}
		System.out.println();

		// ���2. �ݺ���( iterator ) ��ü
		Iterator<String> data = set.iterator();
		while (data.hasNext()) { // ���� ���� ������ true, ������ false
			String s = data.next();
			System.out.println(s);
		}
		System.out.println();

		// ���3. �迭�� �����Ͽ� ����
		String[] arr = new String[set.size()];
		set.toArray(arr); // arr�̶�� �迭�� set�� ��Ұ����� �����Ͽ� ����
		System.out.println(Arrays.toString(arr));

		// ��������� Ŭ������ Set����..
		HashSet<AAA> hs1 = new HashSet<AAA>();
		hs1.add(new AAA(10));
		hs1.add(new AAA(20));
		hs1.add(new AAA(10));
		System.out.println(hs1.toString());

		// Set�� �ߺ��Ǵ��� ��ü�� �������� �ƴ϶�, hashcode()�� ���ϰ��� equals()�޼ҵ��� ������ true�� �� ���� ��Ҷ�� �Ǵ���.
		// hashcode()�� equals()�� �������̵� �� BBBŬ����
		HashSet<BBB> hs2 = new HashSet<BBB>();
		hs2.add(new BBB(10));
		hs2.add(new BBB(20));
		hs2.add(new BBB(10));
		System.out.println(hs2.toString());

		// TreeSet�� �������� ���� ���� ������������ ����!
		// : Comparable�������̽��� ������ Ŭ������ TressSet���� ���ĵǾ� ��밡����!
		TreeSet<CCC> ts = new TreeSet<CCC>();
		ts.add(new CCC(10));
		ts.add(new CCC(40));
		ts.add(new CCC(30));
		ts.add(new CCC(50));
		ts.add(new CCC(20));
		System.out.println(ts);

		// Comparable�������̽��� ������ Ŭ������ �˾ƺ���
		String s = new String("aaa");
		System.out.println(s instanceof Comparable);
		System.out.println(new CCC(10) instanceof Comparable);
		System.out.println(new BBB(10) instanceof Comparable);
		System.out.println(new Integer(10) instanceof Comparable);
		System.out.println(new Double(3.14) instanceof Comparable);
		System.out.println(new Boolean(true) instanceof Comparable);
		System.out.println(new Character('A') instanceof Comparable);
		System.out.println(new Random() instanceof Comparable);

	}// main method..

}// SetTest class....

//Comparable�������̽��� ������ class
class CCC implements Comparable<CCC> {
	int a;

	public CCC(int a) {
		this.a = a;
	}

	@Override
	public int compareTo(CCC obj) {
		// TODO Auto-generated method stub
		return this.a - obj.a;// ����� ������ ���� ��, ����� ���� ��!
		// return obj.a- this.a; ��������
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.a + "";// int->String
	}

}

class BBB {
	int a;

	public BBB(int a) {
		this.a = a;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return a; // ����������� �����ϵ���
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if (obj instanceof BBB) {
			BBB b = (BBB) obj; // �ٿ� ĳ����
			return this.a == b.a;
		}

		return false;
	}
}

class AAA {
	int a;

	public AAA(int a) {
		this.a = a;
	}
}
