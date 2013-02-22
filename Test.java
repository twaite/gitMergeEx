import java.util.Random;


public class Test {
	
	public void randomNumber() {
		final int MAXINT = 10;
		System.out.println("Generating a random number between 1 and " + MAXINT + ": ");
		Random rand = new Random();
		System.out.println("You're random number is: " + rand.nextInt(MAXINT));
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	    System.out.println("hello world");
	    Test test = new Test();
	    test.randomNumber();
	}

}
