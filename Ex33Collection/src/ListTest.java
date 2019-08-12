import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Collection 클래스들 : 자료구조를 구현한 클래스들

		// - Collection인터페이스의 3가지 큰 종류 : List, Set, Map [모두 인터페이스 임]
		// 1)List : 자료들이 저장된 순서대로 있으며 자동 부여된 인덱스번호로 구분함. 중복된 값을 가질 수 있음.
		// 2)Set : 자료들의 번호와 순서없이 마구 저장하며 인덱스 번호 없음. 중복된 값은 가질 수 없음.
		// 3)Map : 인덱스번호 X, 자료를 구별하기 위해 문자열로 된 Key값을 지정함. key는 중복 X, Value는 중복된 값을 가질 수
		// 있음.

		// 위 3종류 모두 고유한 저장방식을 가지고 있으나 인터페이스 이므로 직접 사용하는 것이 아니라..
		// 각 인터페이스를 구현하여 설계된 하위 클래스들을 사용하는 것임.
		// 1) List : ArrayList, LinkedList, Vector(멀티스레드 동기화처리 되어 있음)...
		// 2) Set : HashSet, TreeSet, LinkedHashSet
		// 3) Map : HashMap, TreeMap, LinkedHashMap, HashTabel(멀티스레드 동기화)

		// List는 인터페이스임. 직접 객체 생성 불가!
		// List arr= new List();//error: interface는 바로 객체생성 불가!!

		// List인터페이스를 구현한 하위 클래스를 객체로 만들어 사용해야 함.
		// List계열 : ArrayList, LinkedList, Vector..등

		// 먼저, 가장 잘 알려지고 사용되었던 ArrayList부터!
		// 리스트객체가 저장할 데이터의 종류를 Generic( 클래스명< > )문법을 사용하여 지정할 것을 권장!
		// 요소의 빈번한 추가,제거할 때 속도가 느림. 대신에 특정 번째 요소에 접근하는 것은 빠름.
		ArrayList<String> arrList = new ArrayList<String>();

		// List가 가지고 있는 주요 기능(메소드)들 알아보기
		// List는 Collection인터페이스를 상속받은 만큼 Collection인터페이스의 (추상)메소드를 가지고 있다고 확신할 수 있음.
		// ex) add(), remove(), clear(), size(), contains() .... etc...

		// 1. 요소의 개수
		System.out.println("요소 개수 : " + arrList.size());

		// 2. 요소의 추가
		String s = new String("aa");
		arrList.add(s);
		arrList.add(new String("bb"));
		arrList.add("cc");// 자동 new String()
		System.out.println("요소 개수 : " + arrList.size());

		// 3. 요소 얻어오기
		String str = arrList.get(0);
		System.out.println(str);
		System.out.println(arrList.get(1));
		System.out.println(arrList.get(2));

		// 4. 요소 삭제하기
		arrList.remove(1);
		System.out.println("요소 개수 : " + arrList.size());
		System.out.println(arrList.get(0));
		System.out.println(arrList.get(1));
		// System.out.println(arrList.get(2));//error[Exception]

		// 5. 특정위치에 요소추가하기
		arrList.add(1, "dd");
		System.out.println(arrList.get(0));
		System.out.println(arrList.get(1));
		System.out.println(arrList.get(2));

		// 6. 제거할 때 인덱스 번호가 아닌 객체 참조변수로 제거 가능
		String s2 = new String("Test");
		arrList.add(s2);
		System.out.println("요소 개수 : " + arrList.size());
		arrList.remove(s2);
		System.out.println("요소 개수 : " + arrList.size());

		// 7. 요소 모두 지우기
		arrList.clear();
		System.out.println("요소 개수 : " + arrList.size());

		// 8. 중복된 데이터의 추가 가능함.
		arrList.add("aa");
		arrList.add("aa");
		arrList.add("aa");
		System.out.println(arrList.get(0));
		System.out.println(arrList.get(1));
		System.out.println(arrList.get(2));

		// 9. 요소의 비교 관련 기능들..
		// arrList.clear();
		System.out.println(arrList.isEmpty());// 비어 있는지 여부[true, false]
		System.out.println(arrList.contains("aa"));// 그 데이터가 있는지 여부[true, false]
		System.out.println(arrList.contains("bb"));

		// 10. 한번에 여러요소를 추가하기..
		arrList.clear();
		arrList.add("aa");
		arrList.add("bb");
		arrList.add("cc");

		ArrayList<String> arrList2 = new ArrayList<String>();
		arrList2.add("kk");
		arrList2.add("ss");

		arrList.addAll(arrList2);
		System.out.println(arrList.toString());// 자동 요소들을 [,,,,]해서 문자열로 출력해줌(편의기능)

		// 10.1 특정위치에 여러개 한방에 추가하기
		arrList.addAll(1, arrList2);
		System.out.println(arrList.toString());

		// 11. 특정요소들을 한방에 제거하기
		ArrayList<String> arrList3 = new ArrayList<String>();
		arrList3.add("aa");
		arrList3.add("ss");
		arrList.removeAll(arrList3);
		System.out.println(arrList);

		// 12. 특정 요소만 남기고 제거..
		arrList3.clear();
		arrList3.add("kk");
		arrList.retainAll(arrList3);
		System.out.println(arrList);

		// 13. 특정 요소들이 모두 포함되어 있는지 한방에 비교
		arrList.clear();
		arrList2.clear();

		arrList.add("aa");
		arrList.add("bb");
		arrList.add("cc");
		arrList.add("dd");
		arrList.add("ee");
		arrList.add("ff");
		arrList.add("cc");
		arrList.add("aa");
		arrList.add("gg");

		arrList2.add("aa");
		arrList2.add("bb");
		arrList2.add("kk");

		System.out.println(arrList.containsAll(arrList2));

		// 14. List계열에만 있는 기능!
		// 특정요소가 몇번방에 있는지 -- 리턴값이 int형(index번호 반환)
		System.out.println(arrList.indexOf("cc"));
		System.out.println(arrList.lastIndexOf("cc"));

		// 요소들을 순차적으로 얻어오기...
		// 방법1. for문 사용하기
		for (int i = 0; i < arrList.size(); i++) {
			System.out.println(arrList.get(i));
		}
		System.out.println();

		// 방법2. foreach문 사용하기
		for (String t : arrList) {
			System.out.println(t);
		}
		System.out.println();

		// 방법3. iterator()..를 이용하는 기술!! -->Set수업때 사용해보기

		// 방법4(?)
		// List를 배열로 변경해서 출력!
		// 즉, List객체를 --> 배열객체로 변환!!
		String[] arr = new String[arrList.size()];
		arrList.toArray(arr);
		System.out.println(Arrays.toString(arr));

		// List인터페이스 하위 클래스로 LinkedList도 있음.
		// 사용방법은 ArrayList와 완전 같음. - 단, 성능차이만 있음.
		// 요소의 빈번한 추가,제거시에 속도가 빠름. 단, 특정요소에 접근하는 것이
		LinkedList<String> linkList = new LinkedList<String>();

		linkList.add(new String("aaa"));
		linkList.add("bbb");
		linkList.add("ccc");

		linkList.remove(1);

		// 링크드리스트에만 있는 기능
		linkList.addFirst("kkk");
		linkList.addLast("ssss");

		System.out.println(linkList.toString());

		// Vector클래스 방식이 ArrayList와 100%같음.[동기화 처리되어 있다는 차이만 있음]
		Vector<String> v = new Vector<String>();

		// #별외#####
		// 배열을 리스트로 변경하기!!
		String[] arr2 = new String[] { "aaa", "bbb", "ccc" };
		List<String> list = Arrays.asList(arr2);
		System.out.println(list.toString());

		// List<> 부모참조변수로 모든 자식객체들(ArrayList, LinkedList, Vector) 참조하여 제어할 수 있음.
		List<String> li = null;
		li = new ArrayList<String>();
		li = new LinkedList<String>();
		li = new Vector<String>();

		// 기본형 데이터들을 저장하고 싶을 때!!!!
		// ArrayList<int> arrList5= new ArrayList<int>();//error : 기본형은 끌고 다닐 수 없음.

		// Collection은 제네릭을 사용함. 단, 제네릭은 참조형만 가능함.
		// 그러므로 int, double같은 기본형을 사용할 수 없음.
		// int를 대신하여 Integer 라는 Wrapper클래스를 이용
		ArrayList<Integer> arrList5 = new ArrayList<Integer>();
		arrList5.add(new Integer(10));
		arrList5.add(20); // 오토 박싱(Auto Boxing)
		arrList5.add(30);
		arrList5.add(40);

		int n = arrList5.get(0); // 오토 언박싱(Auto UnBoxing)
		System.out.println(n);

		arrList.clear();
		// ## 요소삭제에 대한 고찰
		arrList.add(new String("aaa"));
		arrList.remove(new String("aaa"));// 사실 제거의 정확한 기준 : 객체의 hashCode()의 리턴값이 같고 equals()의 리턴값이 true면 remove가 됨
		System.out.println("요소 개수 : " + arrList.size());

		// 사용자정의 클래스 객체 사용
		Person p1 = new Person(10);
		Person p2 = new Person(10);

		ArrayList<Person> persons = new ArrayList<Person>();
		persons.add(p1);
		persons.remove(p2);
		System.out.println("Persons 요소개수 : " + persons.size());

		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());

		System.out.println(p1.equals(p2));

		System.out.println(new String("aa").hashCode());
		System.out.println(new String("aa").hashCode());

		System.out.println(new String("aa").equals("aa"));

	}// main method..

}// Main class..

class Person{
			int age;
			
			//생성자
			public Person(int age) {
				this.age= age;
			}
			
			@Override
			public int hashCode() {
				// TODO Auto-generated method stub
				return age;
			}
			
			@Override
			public boolean equals(Object obj) {
				// TODO Auto-generated method stub
				
				Person p= (Person)obj;
				
				return age== p.age;
			}
		


}
