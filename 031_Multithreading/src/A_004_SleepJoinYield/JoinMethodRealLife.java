package A_004_SleepJoinYield;

class VeneueFixing extends Thread {
	public void run() {
		System.out.println("Veneue Fixing Start");
		System.out.println("Veneue Fixing End");
	}
}

class WeddingCardPrinting extends Thread {
	VeneueFixing venue;

	WeddingCardPrinting(VeneueFixing venue) {
		this.venue = venue;

	}

	public void run() {
		try {
			venue.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Wedding Card Printing Start");
		System.out.println("Wedding Card Printing End");
	}
}

class WeddingCardDistribution extends Thread {
	WeddingCardPrinting print;

	WeddingCardDistribution(WeddingCardPrinting print) {
		this.print = print;

	}

	public void run() {
		try {
			print.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Wedding Card Distribution Start");
		System.out.println("Wedding Card Distribution End");

	}

}

class WeddingController extends Thread {
	public void run() {

		VeneueFixing venue = new VeneueFixing();
		WeddingCardPrinting print = new WeddingCardPrinting(venue);
		WeddingCardDistribution distribution = new WeddingCardDistribution(print);
		venue.start();
		print.start();
		distribution.start();

	}

}

public class JoinMethodRealLife {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Lets Start");
		WeddingController control = new WeddingController();
		control.start();

	}

}
