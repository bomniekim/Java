import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class SwingMain2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Frame����� ��� 3����
		//���1. ��ü�� ���� �� ���� �޼ҵ���� ȣ���ؼ� �����ϴ� ���!
		JFrame f = new JFrame();
		int garo=300;
		int sero=200;
		f.setSize(garo, sero);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		//���2. JFrame�� ��ӹ��� ������ Ŭ������ �����ϰ� �̸� ��ü�� ���� 
		//�� Ŭ������ ������ �ȿ� �����۾��� �Ϸ�!
		
		//TestFrame fr = new TestFrame(); //new�Ҷ� ������ �޼ҵ� �����
		
		
		//���3. main()�޼ҵ带 ������ Main class�� Ŭ�����ϱ� Ȱ���غ���!
		//JFrame�� ��ӹް� main()�޼ҵ嵵 ������ MyFrame����
		//[���� ���� ��ȣ�Ǵ� ���]

		
		
		//<JFrame�� ������ �޼ҵ��>
		
		//1. x��ư Ŭ�� ���� ���α׷� ���� ����
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//JFrame.HIDE_ON_CLOSE: �⺻�� - ���� �� �����Ӹ� �������� ���α׷��� ������ ����
		//JFrame.DO_NOTHING_ON_CLOSE: �ƹ� ���� ���� �� (AWT�� Frame)
		//JFrame.EXIT_ON_CLOSE: ������ ���� �� ���α׷��� ����
		//JFrame.DISPOSE_ON_CLOSE: ������ ����� ���α׷� ���ᰡ ������ ��
			
		//2. �������� ȭ�鿡 ��Ÿ���� ��ġ 
		f.setLocation(700, 200); //�������� �»�� ��ǥ
		
		//2-1. �������� ȭ���� ������� ���� (����� ��: ������� ������)
		
		//����� �ػ� ������
		Toolkit toolkit = Toolkit.getDefaultToolkit(); //Toolkit��ü ������(new�ƴϾ�!):OS�� �ɷ��� ����� �� �ִ� �븮��
		Dimension screenSize = toolkit.getScreenSize();
		
		int width = (int)screenSize.getWidth();//getWidth�� �ڷ����� double�̹Ƿ� int�� �� ��ȯ
		int height = (int)screenSize.getHeight();//getWidth�� �ڷ����� double�̹Ƿ� int�� �� ��ȯ

		System.out.println(width+" * "+height); // 1920 * 1080
		
		f.setLocation(width/2-garo/2, height/2-sero/2); //������� ��ġ 
		
		
		//3. Location + Size �� ���� ����
		f.setBounds(150, 250, 500, 300); //x, y, Width, Height
		
		//4. �������� ������ ���� ��뿩��
		f.setResizable(false); //������ ���� - �⺻:true
		
		//5. �������� �������� �ʵ��� ���� ������ ��ġ
		f.setAlwaysOnTop(true); 
		
		
		//6. ������ Ÿ��Ʋ(����)
		f.setTitle("JFrame Test");
		
		//7. ������ ������ ����
		Image img = toolkit.getImage("images/uni.png");
		f.setIconImage(img);
		
		
		//8. ������Ʈ �߰�
		JButton btn = new JButton("Button");
		f.add(btn);
		
		f.setVisible(true);
		
		//2�� �Ŀ� ������Ʈ ���ŵǵ���
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		//9. ������Ʈ ����
		f.remove(btn);
		
		//10. ������Ʈ�� ������ �����Ϸ��� ȭ���� �����ϴ� ��� �ʿ�
		//f.repaint(); //�ٽ� �׷�!
		SwingUtilities.updateComponentTreeUI(f);
		//������Ʈ Ʈ�������� ������ ������Ʈ�ϴ� �޼ҵ�μ� repaint()�� ���� ȿ���� ����
		
		
		//�ֻ��� Container(JFrame)�� ���� ������Ʈ��(JButton, JLabel ��)�� �߰��ϴ� ����� ��ȣ���� ����
		//�Ϲ� Container�� JPanel(�г�)�� �̿�
		
	}

}//Main class


class TestFrame extends JFrame{
	
	//������ �޼ҵ�
	public TestFrame() {
		
		this.setSize(300, 200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		//this.�� ��������
	}
}