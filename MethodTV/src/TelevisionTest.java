
public class TelevisionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Television myTv = new Television();
		myTv.channel=7;
		myTv.volume=9;
		myTv.onOff=true;
		myTv.print();
		
		Television yourTv= new Television();
		yourTv.channel=9;
		yourTv.volume=12;
		yourTv.onOff=true;
		yourTv.print();
		
		
		int ch = myTv.getChannel();
		System.out.println("���� ä���� "+ch+"�Դϴ�.");
		
		int v = yourTv.getVolume();
		System.out.println("���� ������ "+v+"�Դϴ�.");
		
		myTv.setChannel(33);
		int cha= myTv.getChannel();
		System.out.println("���� ä���� "+cha+"�Դϴ�.");
	}


}
