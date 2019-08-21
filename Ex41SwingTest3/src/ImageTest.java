import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ImageTest extends JFrame {

	//가급적 컴포넌트는 멤버변수로!
	JLabel label; 
	
	int index=12; //이미지번호
	
	
	public ImageTest() {
		// TODO Auto-generated constructor stub
		setTitle("Image Test");
		setSize(350, 500);
		setLocation(500, 200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
		JPanel panel = new JPanel();
		
		//Swing에는 이미지를 보여주는 컴포넌트가 없어서
		//JLabel의 아이콘 보여주는 기능을 대신 사용함
		
		label = new JLabel();
		//이미지를 가지고 있는 Image객체가 있고 Image객체를 가진
		//ImageIcon객체를 만들어야 JLabel에 보여주는 것이 가능
		ImageIcon icon = new ImageIcon("images/dao.png");
		
		//이미지가 원본파일의 사이즈로 만들어지기에
		//원하는 사이즈로 resizing!
		
//		Image img = icon.getImage(); //이미지객체 뽑아오기
//		img = img.getScaledInstance(256, 256, Image.SCALE_SMOOTH);//맨 마지막은 보정값
//		icon = new ImageIcon(img); //원래 있던걸 버리고 새로운 객체를 가리키게끔

		//더 심플하게
		icon = new ImageIcon(icon.getImage().getScaledInstance(250, 250, Image.SCALE_SMOOTH));

		label.setIcon(icon);
		panel.add(label);
		
		//버튼에 이미지 아이콘 추가하기!
		JButton btn = new JButton("이미지 버튼");
		ImageIcon btnIcon = new ImageIcon("images/button blue alt.png");
		btn.setIcon(btnIcon);
		
		//버튼에 이미지만 보이게 하고 싶다면? 버튼의 배경 이미지를 없애기
		btn.setContentAreaFilled(false); //콘텐츠 영역을 채우지 않겠다! 그라데이션 없애기
		btn.setBorder( BorderFactory.createEmptyBorder() ); //경계선 비우기
		
		panel.add(btn);
		
		
		//버튼 클릭에 반응하는 Listener추가
		btn.addActionListener( new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				//이미지 변경하기
				index++;
				if(index>21) index=12;
				
				ImageIcon icon = new ImageIcon("images/ms"+ index + ".png");
				icon = new ImageIcon(icon.getImage().getScaledInstance(250, 250, Image.SCALE_SMOOTH));
				label.setIcon(icon);
				
			}
		});
		
		
		
		add(panel);
		setVisible(true);
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ImageTest();
	}

}
