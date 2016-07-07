import java.util.*;
Class GameOfDiamonds {
	ArrayList<Card> diamonds = new ArrayList<Card>();
	Player computer = new Player('H');
	Player user = new Player('S');
	
	GameOfDiamonds() {
		for (int i = 1; i <= 13; i++ ) {
			diamonds.add(new Card(i, 'D'));
		}
		Collections.shuffle(diamonds);
		winnerName = "";
	}
	
	int calBidDiff(int bidValComp, int bidValUsr) {
		return bidValComp - bidValUsr;
	}
	
	String bidResult(int bidDiff) {
		if (bidDiff > 0) {
			computer.score += diamonds.get(1);
			return "Computer won bid";
		} else if (bidDiff < 0) {
			user.score += diamonds.get(1);
			return "You won bid";
		else {
			computer.score += diamonds.get(1)/2;
			user.score += diamonds.get(1)/2;
			return "TIE";
		}
	}
	
	String game() {
		for (int i = 1; i <= 13; i++) {
			int bidValComp = computer.bidValue(diamonds.get(1));
			int bidValUsr = user.bidValueFromUser(diamonds.get(1));
			System.out.println(bidResult(calBidDiff(bidValComp, bidValUsr)));
			diamonds.remove(1);
		}
	}
	
	String gameResult(int usrScore, int compScore) {
		if (usrscore > compscore) 
			return "YOU WON!!"; 
		else if (usrscore > compscore)
			return "COMPUTER WON!!";
		else
			return "TIE!!!";
	}
}	
