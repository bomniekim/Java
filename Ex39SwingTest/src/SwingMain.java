import java.awt.FlowLayout;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class SwingMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1. 최상위 컨테이너 생성
		JFrame f = new JFrame("Swing GUI");
		f.setSize(500, 400);
		
		//기본적으로 JFrame에는 BorderLayout이라는 배치관리자가 설정되어 있음
		//But, 가장 사용하기 쉬운 레이아웃매니저인 FlowLayout으로 변경
		f.setLayout( new FlowLayout() );
		
		//2. 컴포넌트 추가하기
		JButton b1 = new JButton("A");
		JButton b2 = new JButton("B");
		JButton b3 = new JButton("C");
		
		//컨테이너에 추가
		f.add(b1);
		f.add(b2);
		f.add(b3);
		
		//JLabel :글씨를 보여주는 컴포넌트
		JLabel label = new JLabel("This is a Label");
		f.add(label);
		
		
		//JTextField: 사용자로부터 글씨 입력받는 컴포넌트
		JTextField tf = new JTextField(20); //최소 20자 사이즈(이상이어도 가능! but 줄바꿈은 X)
		f.add(tf);
		
		//이미지 :이미지용 컴포넌트가 없음.
		//JLabel에 아이콘(이미지)를 보여줄 수 있는 기능이 있음-이를 활용!
		
		//이미지아이콘(ImageIcon) 객체 생성
		ImageIcon icon = new ImageIcon("images/rabbit.png");
		
		//이미지 리사이징
		//이미지아이콘 객체에서 실제 이미지파일을 가지고 있는 Image객체 뽑아오기
		Image im = icon.getImage();
		//뽑아 온 이미지 객체의 사이즈를 새롭게 만들기
		Image im2 =im.getScaledInstance(280, 280, Image.SCALE_SMOOTH);
		
		//조절된 사이즈의 이미지(im2)를 가지고 새로운 ImageIocn 객체 다시 생성
		ImageIcon icon2 = new ImageIcon(im2);
		
//		JLabel img = new JLabel();
//		img.setIcon(icon);
		
		
		JLabel img = new JLabel();
		f.add(img);
		
		
		
		
		//객체의 이미지를 바로 넣을 수 없어서 JLabel컴포넌트를 사용해서  add
		
		JLabel imgLabel = new JLabel();
		imgLabel.setIcon(icon);
		
		f.add(imgLabel);
		
		
		//swing은 frame창의 x버튼을 누르면 자동으로 사라지지만 프로그램은 종료되지 않음
		//x버튼을 누륵면 프로그램도 같이 종료되도록 설정!
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setLocation(700, 300); //프레임의 좌상단 좌표(위치) 설정
		 
		//화면에 보이기
		f.setVisible(true);
		
	}

}
