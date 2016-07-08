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
	int bidCard(int diamondVal) {
		Collections.shuffle(availableCards);
		int bidValue = (availableCards.get(0)).getPipVal();
		availableCards.remove(0);
		return bidValue;
	}
}
