package tv;

public class Tv {

	private int channel;
	private int volume;
	private boolean onOff;
	
	Tv(int channel, int volume, boolean onOff){
		this.channel = channel;
		this.volume = volume;
		this.onOff = onOff;
	}
	
	void output() {
		System.out.println("채널은 "+channel+"이고 볼륨은 "+volume+"입니다.");
	}
}
