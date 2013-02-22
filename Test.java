public class Test {
	
	public void howAwesomeAreYou(String name) {
		System.out.println("Is " + name + " awesome?" );
		if ( name[0] == 'T' )
			System.out.println(name + " is awesome!");
		else
			System.out.println(name + " is not very awesome...");
	}
	
	public static void main(String[] args) {
	    Test test = new test();
		System.out.println("hello world");
	    test.howAwesomeAreYou(Tim);
	    test.howAwesomeAreYou(Taylor);
	    test.howAwesomeAreYou(Katie);

	}

}
