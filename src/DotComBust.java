import java.util.ArrayList;

public class DotComBust {
	
	GameHelper helper = new GameHelper();
	private ArrayList<DotCom> dotComsList;
	int numOfGuesses = 0;

	private void setUpGame() {
		// initialize DotCom objects with names and locations
		DotCom dotCom1 = new DotCom();
		dotCom1.setName("Pets.com");
		DotCom dotCom2 = new DotCom();
		dotCom2.setName("toys.com");
		DotCom dotCom3 = new DotCom();
		dotCom3.setName("boo.com");
		
		dotComsList.add(dotCom1);
		dotComsList.add(dotCom2);
		dotComsList.add(dotCom3);
		
		for (DotCom dotComToSet : dotComsList) {
			ArrayList<String> newLocation = helper.placeDotCom(3);
			dotComToSet.setLocationsCells(newLocation);
		}
		
		//Display instructions
		System.out.println("Guess location to destroy a DotCom");
	}
	
	private void startPlaying(){
		while (!dotComsList.isEmpty()) {
			String prompt = 
			helper.getUserInput(prompt)
		}
	}
	
	private void checkUserGuess(){
		
	}

	private void finishGame() {
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
