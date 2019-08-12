import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class MapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//키-벨류 쌍 (key-value pair)으로 데이터를 저장하는 방식
		//Key는 중복X, Value는 중복O
		
		
		//Map도 인터페이스이므로 직접 객체 생성 불가!
		//Map인터페이스를 구현한 하위 클래스들을 객체로 만들어서 사용
		
		//1. HashMap: 저장순서X, 저장순서 파악 어려움. Map중에서 가장 성능 좋음.
		//2. TreeMap: 값(키값의 순서에 따라)에 따라 오름차순으로 정렬
		//3. LinkedHashMap: 저장된 순새도로 정렬됨. 성능 가장 안 좋음.
		//4. HashTable: HashMap과 99%같음 (멀티Thread일때 동기화 처리 되어 있음)
		
		//Map인터페이스는 Collection인터페이스를 상속하지 않았으므로
		//Collection인터페이스의 (추상)메소드를 모두 가지고 있다고 확신할 수 없음.
		//실제로 add()메소드 없음
		
		//<key, Value>
		HashMap<String, String> map = new HashMap<String, String>();
		TreeMap<String, String> map2 = new TreeMap<String, String>();
		LinkedHashMap<String, String> map3 = new LinkedHashMap<String, String>();
		
		//요소 추가
		map.put("Name", "Hong");
		map.put("ID", "bomnie");
		map.put("PW", "a1234");
		
		System.out.println( map.size() ); // 3
		
		
		//요소 얻어오기
		System.out.println( map.get("Name") ); //훨씬 식별성이 높고 직관적 : 정말 많이 쓰임
		System.out.println( map.get("ID") );
		System.out.println( map.get("PW") );
		
		
		//중복?
		map.put("kkk", "Hong"); //Key값은 다르고 Value는 같음 : 저장가능 -> map.size():4
		map.put("kkk", "nice"); //Key값이 중복되면 저장이 안되는 것이 아니라 그 Key값의 Value를 덮어쓰기 함.
		System.out.println( map.get("kkk") ); // nice
		
		
		//요소를 순차적으로 얻어와서 출력하기 -> 사실 잘 쓰이지는 않음
		//index가 없으므로 for문으로는 불가능!
		//for each문도 문법적으로 불가능!
		
		//방법1. Map에서 Key값들만 뽑아와서 처리
		Set<String> keys = map.keySet();
		//1-1. key값들을 for each문으로 접근하기
		for(String key : keys) {
			String value = map.get(key);
			System.out.println( key+" : "+value );
		}
		System.out.println();
		
		//1-2. key값을 가지고 있는 Set의 iterator(반복자)를 이용하는 방법
		Iterator<String> data = keys.iterator();
		while( data.hasNext() ) {
			String key = data.next();
			System.out.println( key+" : "+map.get(key) );
		}
		
		//방법2. Map객체를 Set객체로 변환하여 접근
		//Map의 요소(Key-Value pair) 객체인 Entry의 Set얻어오기
		Set< Entry<String, String> > entries = map.entrySet();
		//Entry를 가지고 하는 방법은 방법1과 같음
		for ( Entry<String, String> e : entries) {
			System.out.println(e.getKey() +" : "+e.getValue() );
		}
		
		
		//식별자(key)를 int형 사용하기
		//<>generic안에서는 참조형 자료형만 가능
		//HashMap<int, String> maps = new HashMap<int, String>(); //error
		//int->Integer형으로 사용하기
		HashMap<Integer, String> map5 = new HashMap<Integer, String>();
		map5.put(new Integer(0), "aaa");
		map5.put(1, "bbb"); //자동 new Integer(1)- 오토 박싱
		map5.put(2, "ccc");
		
		for(int i=0; i<map.size(); i++) {
			String s= map2.get(i);
			System.out.println(s);
			}
	}
}
