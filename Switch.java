class Switch {
	public static void main(String[] args) {
		int rating = 5;
		switch (rating) {
		case 1: System.out.println("Wow, that’s pretty low!");
		break;
		case 2: System.out.println("That’s not a good rating.");
		break;
		case 3: System.out.println("I’ll continue working on it.");
		break;
		case 4: System.out.println("Almost there!");
		break;
		case 5: System.out.println("Wonderful!");
		break;
		default: System.out.println("Please enter a number 1 through 			5.");
		}
}
}