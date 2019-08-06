import java.util.Random;

public class Ex06_02 {

	public static void main(String[] args) {

		SutdaCard card1 = new SutdaCard(3, false);
		SutdaCard card2 = new SutdaCard();

		System.out.println(card1.info());
		System.out.println(card2.info());

	}

	public class SutdaCard {

		Random rnd = new Random();
		int num=rnd.nextInt(10)+1;

		boolean isKwang;
		
		public SutdaCard() {
			num=0;
			isKwang=false;
		}
		
		public SutdaCard(int num, boolean isKwang) {
			this.num=num;
			this.isKwang=isKwang;
		}
		
		void Info() {
			if(Kwang)
		}

	}

}
