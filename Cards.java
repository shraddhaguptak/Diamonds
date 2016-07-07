class Card {
	char pip;
	char suit;
	int rank;
	char pipArray[] = {'0', 'A','2', '3', '4', '5', '6', '7', '8', '9', 'T', 'J', 'Q', 'K'};

	Card(char pip, char suit) {
		this.pip = pip;
		this.suit = suit;
		rank = 0;
	}
	boolean compare(Card c) {
		int i = 0;
		char[] suitarray = {'C','D','H','S','\0'};
		for(;i < pipArray.length-1;i++) {
			if(pip == pipArray[i]) {
				rank += i;
			}
			if(c.pip == pipArray[i]) {
				c.rank +=i;
			}
		}
		for(i = 0;suitarray[i]!='\0';i++) {
			if(suit == suitarray[i]) {
				rank += i*10;
			}
			if(c.suit == suitarray[i]) {
				c.rank +=i*10;
			}
		}
		return rank > c.rank ? true : false;
	}
	public int getPip() {
		int pipVal = 0;
		for (int i = 0; i < pipArray.length-1; i++) {
			if (pip == pipArray[i]) {
				pipVal = i;
			}
		}
		return pipVal;
	}	
}
class Cards {
	public static void main(String[] args){
		Card card1 = new Card('3','D');
		Card card2 = new Card('J','C');
		if(card2.compare(card1)) {
			System.out.println("card2");
		}else {
			System.out.println("card1");
		}
		System.out.println(card1.getPip());
		System.out.println(card2.getPip());
	}
}
