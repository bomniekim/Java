package bbb;

import aaa.Nice;

	public class Student {

		//멤버변수
		public String name;
		public int kor;
		public int eng;
		
		//main 함수가 아닌 곳에서도 사용자 정의 class를 사용할 수 있음
		Person p= new Person();
		
		//다른 패키지의 class도 사용가능. 단, 패키지명 명시
		aaa.Nice n= new aaa.Nice();
		
		//패키지명 생략가능 - import 사용
		Nice k= new Nice();
}


