class Card {
	char pip;
	int pipVal;
	char suit;
	Card(char pip, char suit) {
		String pipArray = " A23456789TJQK";
		for (char ch : pipArray.toCharArray()) {
			if (pip == ch) {
				pipVal = pipArray.indexOf(ch);
			}
		}
		this.pip = pip;
		this.suit = suit;
	}
	Card(int pipVal, char suit) {
		this.pipVal = pipVal;
		this.suit = suit;
	}
	int compare(Card c) {
		return getPip() - c.getPip(); 
	}
	public int getPip() {
		return pip;
	}
	public char getSuit() {
		return suit;
	}
	public int getPipVal() {
	    return pipVal;
	}	
}
class Cards {
	public static void main(String[] args){
		Card card1 = new Card('3','D');
		Card card2 = new Card('J','C');
		System.out.println(card1.getPipVal());
		System.out.println(card2.getPipVal());
	}
}
