import java.util.*;
class Player {
	ArrayList<Cards> availableCards = new ArrayList<Cards>();
	char suit;
	float score;
	Player(char suit) {
		for (int i = 1; i <= 13; i++ ) {
			availableCards.add(new Cards(i, this.suit));
		}
		score = 0;
	}
	int bidValueFromComputer(int diamondVal) {
		int value = 0;
		int validInput = 0;
		if(diamondVal >= 0 && diamondVal <= 7)
	       		value = random_num_gen(1,7);
	  	 else if(diamondVal >= 8 && diamondVal <=13)
	       		value = random_num_gen(8,13);
		for (Cards c : availableCards) {
            		if ( c.getPipVal() == value) {
                		validInput = 1;
                		availableCards.remove(c);
                		return value;
            		}
        	}
        return bidValueFromComputer(diamondVal);
	}
	public int random_num_gen(int min ,int max){
		Random rn = new Random();
		   return min + rn.nextInt(max - min + 1);      
	}
	int bidValueFromUser(int diamondVal) {
        	Scanner sc = new Scanner(System.in);
        	int validInput = 0;
        	System.out.println("diamond value: " + diamondVal);
        	System.out.println("enter bidding value: ");
        	int bidValueFromUser = sc.nextInt();
        	for (Cards c : availableCards) {
            		if ( c.getPipVal() == bidValueFromUser) {
                		validInput = 1;
                		availableCards.remove(c);
                		return bidValueFromUser;
            		}
        	}
        	if (validInput != 1) {
            		System.out.println("Invalid Input");
            		return bidValueFromUser(diamondVal);
        	}
        	else
            		return 0;
    }
}
