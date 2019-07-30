
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
		System.out.println("현재 채널은 "+ch+"입니다.");
		
		int v = yourTv.getVolume();
		System.out.println("현재 볼륨은 "+v+"입니다.");
		
		myTv.setChannel(33);
		int cha= myTv.getChannel();
		System.out.println("현재 채널은 "+cha+"입니다.");
	}


}
