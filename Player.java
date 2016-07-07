import java.util.*;
class Player {
	ArrayList<Card> availableCards = new ArrayList<Card>();
	float score;
	Player() {
		for (int i = 1; i <= 13; i++ ) {
			availableCards.add(new Card(i, 'H'));
		}
		score = 0;
	}
	
}
