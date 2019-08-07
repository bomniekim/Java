
public class Tank implements Unit, Levelupable {

	@Override
	public void attack() {
		// TODO Auto-generated method stub
		System.out.println("자주포 발사!");
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("레일로 이동~");
	}

	@Override
	public void levelup() {
		// TODO Auto-generated method stub
		System.out.println("미친 탱크로 변신!");
		
	}

}
