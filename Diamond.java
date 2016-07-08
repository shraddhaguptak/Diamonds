import java.util.ArrayList;
import java.util.Collections;


public class Diamond {
	ArrayList<Card> diamond = new ArrayList<Card>();
	public Diamond() {
		for (int i = 1; i<= 13; i++) {
			diamond.add(new Card(i, 'D'));
		}
	}
	public static void main(String[] args) {
		Diamond d = new Diamond();
	}
	
}
