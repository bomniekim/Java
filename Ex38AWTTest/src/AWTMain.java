import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class AWTMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//최상위 컨테이너 객체 생성
		Frame f = new Frame("AWT GUI");
		f.setSize(500, 400);
		
		
		//x버튼을 클릭해도 자동으로 꺼지지 않음
		//X버튼을 눌렀을 때 반응하는 코드
		
		
		WindowAdapter adapter = new WindowAdapter() {
			//Frame의 x버튼을 클릭하면 자동으로 실행되는 메소드 : 콜백메소드
			@Override
			public void windowClosing(WindowEvent e) {
				//이 프레임(f)를 없애기!
				f.dispose();
			}
		};
		
		
		f.addWindowListener(adapter); //윈도우의 상태를 듣는 메소드
		
		//컨테이너 안에 놓여질 component(구성요소)들을 추가하기
		
		//컴포넌트 생성
		Button btn = new Button("확인");
		Button btn2 = new Button("취소");
		Button btn3 = new Button("Hello World");
		//btn3을 클릭했을 때 버튼에 써져있는 글씨 변경해보기!
		//btn3 객체가 클릭되었는 지를 바라보고(듣고) 있는 객체 생성 및 붙여주기 
		btn3.addActionListener( new ActionListener() {
			
			//버튼이 클릭되면 자동으로 호출되는 메소드 : 콜백메소드
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				btn3.setLabel("Nice Java");
			}
		});
		
		
		//컴포넌트 배치를 어떻게 할 지 결정하는 LayoutManager(배치관리자)객체 생성
		FlowLayout fl = new FlowLayout(); //컴포넌트를 차례로 옆으로 배치
		f.setLayout(fl);
		
		
		
		//만들어진 버튼을 컨테이너(Frame)에 추가!
		f.add(btn);
		f.add(btn2);
		f.add(btn3);
		
		
		
		
		//화면에 보여주는 능력을 세팅
		f.setVisible(true);
	}

}
