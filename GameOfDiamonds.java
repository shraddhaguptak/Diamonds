import java.util.*;

public class GameOfDiamonds {
	ArrayList<Cards> diamonds = new ArrayList<Cards>();
	Player computer = new Player('H');
	Player user = new Player('S');
	
	GameOfDiamonds() {
		for (int i = 1; i <= 13; i++ ) {
			diamonds.add(new Cards(i, 'D'));
		}
		Collections.shuffle(diamonds);
	}
	
	int calBidDiff(int bidValComp, int bidValUsr) {
		return bidValComp - bidValUsr;
	}
	
	String bidResult(int bidDiff) {
		if (bidDiff > 0) {
			computer.score += diamonds.get(1).getPipVal();
			return "Computer won bid";
		} else if (bidDiff < 0) {
			user.score += diamonds.get(1).getPipVal();
			return "You won bid";
		} else {
			computer.score += (diamonds.get(1).getPipVal())/2;
			user.score += (diamonds.get(1).getPipVal())/2;
			return "bid is a tie";
		}
	}
	
	
}	
