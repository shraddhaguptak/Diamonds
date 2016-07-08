class Cards {
	char pip;
	int pipVal;
	char suit;
	Cards(char pip, char suit) {
		String pipArray = " A23456789TJQK";
		for (char ch : pipArray.toCharArray()) {
			if (pip == ch) {
				pipVal = pipArray.indexOf(ch);
			}
		}
		this.pip = pip;
		this.suit = suit;
	}
	Cards(int pipVal, char suit) {
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
