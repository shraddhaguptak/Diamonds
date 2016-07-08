import java.util.*;
class Player {
	ArrayList<Card> availableCards = new ArrayList<Card>();
	char suit;
	float score;
	Player(char suit) {
		for (int i = 1; i <= 13; i++ ) {
			availableCards.add(new Card(i, this.suit));
		}
		score = 0;
	}
	int bidValue(int diamondVal) {
		Collections.shuffle(availableCards);
		int bidValue = (availableCards.get(0)).getPipVal();
		availableCards.remove(0);
		return bidValue;
	}
	int bidValueFromUser(int diamondVal) {
		Scanner sc = new Scanner(System.in);
		System.out.println("diamond value: " + diamondVal);
		System.out.println("enter bidding value: ");
		int bidValueFromUser = sc.nextInt();
		return bidValueFromUser;
	}
}
