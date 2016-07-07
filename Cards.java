class Cards1 {
	char pip;
	char suit;
	int rank;
	Cards1(char pip, char suit) {
		this.pip = pip;
		this.suit = suit;
		rank = 0;
	}
	boolean compare(Cards1 card1) {
		int i = 0;
		char[] piparray =  {'A','2','3','4','5','6','7','8','9','T','J','Q','K','\0'};
		char[] suitarray = {'C','D','H','S','\0'};
		for(;piparray[i]!='\0';i++) {
			if(pip == piparray[i]) {
				rank += i;
			}
			if(card1.pip == piparray[i]) {
				card1.rank +=i;
			}
		}
		for(i = 0;suitarray[i]!='\0';i++) {
			if(suit == suitarray[i]) {
				rank += i*10;
			}
			if(card1.pip == piparray[i]) {
				card1.rank +=i*10;
			}
		}
		return rank > card1.rank ? true : false;
	}	
}
class Cards {
	public static void main(String[] args){
		Cards1 card1 = new Cards1('3','D');
		Cards1 card2 = new Cards1('J','C');
		if(card2.compare(card1)) {
			System.out.println("card2");
		}else {
			System.out.println("card1");
		}
	}
}
