package java_basics;

public class ControlFlow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean hungry = true;
		if(hungry) {
			System.out.println("I'm hungry..");
		}
		else {
			System.out.println("I'm not hungry rn..");
		}
		
		int hungerRating = 5;
		if(hungerRating < 6) {
			System.out.println("Not hungry yet..");
		}
		else {
			System.out.println("Hangryyyy");
		}
		
		int favTemp = 75;
		int currTemp = 60;
		String opinion;
		
		if(currTemp < favTemp-30) {
			opinion ="Its pretty darn cold!";
		}
		else if(currTemp < favTemp-20) {
			opinion = "Its kinda cold!";
		}
		else {
			opinion = "Its a beautiful day!";
		}
		
		System.out.println(opinion);
		
	}

}
