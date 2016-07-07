class Card {
	char pip;
	char suit;
	Card(char pip, char suit) {
		this.pip = pip;
		this.suit = suit;
	}
	int compare(Card c) {
		return getPip() - c.getPip(); 
	}
	public int getPip() {
		int pipVal = 0;
		char[] pipArray = {'0', 'A','2', '3', '4', '5', '6', '7', '8', '9', 							'T', 'J', 'Q', 'K'};
		for (int i = 0; i < pipArray.length; i++) {
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
		System.out.println(card1.getPip());
		System.out.println(card2.getPip());
	}
}
