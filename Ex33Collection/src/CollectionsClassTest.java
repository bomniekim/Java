import java.util.ArrayList;
import java.util.Collections;
import java.util.Queue;
import java.util.Stack;

public class CollectionsClassTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Collections클래스의 static메소드
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
		
		Collections.sort(data);//리스트객체의 요소들이 오름차순 정렬
		System.out.println( data.toString() );
		
		Collections.shuffle(data); //리스트객체의 요소들을 섞어줌
		System.out.println( data.toString());
		
		
		//자료구조에서 가장 유명한 2가지 저장구조
		//Stack(스택)과 Queue(큐)의 구조와 용어
		
		//1. Stack : push(요소추가), pop(요소 꺼내기/빼내오기) : FILO(First In Last Out) 먼저 저장된 데이터가 나중에 나온다.
		//2. Queue : offer(요소추가), poll(요소 꺼내기/빼내오기) : FIFO(First In First Out) 먼저 저장된 데이터가 먼저 나온다. ex)키보드버퍼
		
		Stack<String> stack = new Stack<String>();
		stack.push("aaa");
		String s = stack.pop();
		
		Queue<String> queue=null;
		queue.offer("aaa");
		String s2 = queue.poll();
		
	}

}





