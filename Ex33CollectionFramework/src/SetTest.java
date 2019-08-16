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

		// Set 인터페이스: 순서대로 저장X, 인덱스 번호X, Data중복 허용X

		// Set<String> set = new Set<String>(); //error : 인터페이스는 객체생성이 불가

		// Set인터페이스를 구현(implements)한 하위클래스를 객체로 만들어서 사용
		// 1. HashSet: 저장 순서를 파악하기 어려움. 해시테이블이라는 것에 의해서 순서가 결정. Set계열 중에서 가장 성능이 좋음
		// 2. TreeSet: 저장한 데이터의 값에 따라 정렬되는 Set. red-black 트리기법 알고리즘 사용. HashSet보다 성능이 약간 느림
		// 3. LinkedHashSet: 저장된 순서대로 값이 정렬됨. 성능이 가장 안 좋음

		// Set인터페이스도 Collection인터페이스를 상속하여 만들어진 만큼, Collection인터페이스의 (추상)메소드를 모두 가지고 있다고 확신할 수 있음.
		// ex) add(), remove(), clear(), size(), contains() 등을 모두 가지고 있음

		//HashSet<String> set= new HashSet<String>();
		//TreeSet<String> set= new TreeSet<String>();
		LinkedHashSet<String> set= new LinkedHashSet<String>();

		// 요소추가
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

		// 요소개수 / 요소의 값 콘솔출력
		System.out.println(set.size() + ":" + set.toString());
		// 중복된 Data가 있으면 실제로는 중복을 피해서 저장 (중복된 data 저장 방지)

		// 요소 얻어오기.. but get()메소드가 없음: 인덱스 번호가 없기 때문

		// 얻어오는 방법 : 차례대로 접근하는 방법
		// 방법1. for each
		for (String e : set) {
			System.out.println(e);
		}
		System.out.println();

		// 방법2. 반복자( iterator ) 객체
		Iterator<String> data = set.iterator();
		while (data.hasNext()) { // 다음 것이 있으면 true, 없으면 false
			String s = data.next();
			System.out.println(s);
		}
		System.out.println();

		// 방법3. 배열로 변경하여 접근
		String[] arr = new String[set.size()];
		set.toArray(arr); // arr이라는 배열에 set의 요소값들을 복사하여 저장
		System.out.println(Arrays.toString(arr));

		// 사용자정의 클래스의 Set사용시..
		HashSet<AAA> hs1 = new HashSet<AAA>();
		hs1.add(new AAA(10));
		hs1.add(new AAA(20));
		hs1.add(new AAA(10));
		System.out.println(hs1.toString());

		// Set의 중복판단은 객체가 같은지가 아니라, hashcode()의 리턴값과 equals()메소드의 리턴이 true일 때 같은 요소라고 판단함.
		// hashcode()와 equals()를 오버라이드 한 BBB클래스
		HashSet<BBB> hs2 = new HashSet<BBB>();
		hs2.add(new BBB(10));
		hs2.add(new BBB(20));
		hs2.add(new BBB(10));
		System.out.println(hs2.toString());

		// TreeSet은 데이터의 값에 따라 오름차순으로 정렬!
		// : Comparable인터페이스를 구현한 클래스만 TressSet에서 정렬되어 사용가능함!
		TreeSet<CCC> ts = new TreeSet<CCC>();
		ts.add(new CCC(10));
		ts.add(new CCC(40));
		ts.add(new CCC(30));
		ts.add(new CCC(50));
		ts.add(new CCC(20));
		System.out.println(ts);

		// Comparable인터페이스를 구현한 클래스들 알아보기
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

//Comparable인터페이스를 구현한 class
class CCC implements Comparable<CCC> {
	int a;

	public CCC(int a) {
		this.a = a;
	}

	@Override
	public int compareTo(CCC obj) {
		// TODO Auto-generated method stub
		return this.a - obj.a;// 결과가 음수면 내가 앞, 양수면 내가 뒤!
		// return obj.a- this.a; 내림차순
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
		return a; // 멤버변수값을 리턴하도록
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if (obj instanceof BBB) {
			BBB b = (BBB) obj; // 다운 캐스팅
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
