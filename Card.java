public class Card {
	
	private String suit;
	private String value;
	public static String[] suitTypes = {"hearts", "clubs", "spades", "diamonds"};
	public static String[] values = {"ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "jack", "queen", "king"};
	
	//default constructor
	public Card(){
	}

	public Card(String suit, String value){
		this.suit = suit;
		this.value = value;
	}
	//returns suit
	public String getSuit(){
		return this.suit;
	}
	//returns value (ace, 2, 3...)
	public String getValue(){
		return this.value;
	}
	//prints out the card
	public void printCard(){
		System.out.println(getValue() + " of " + getSuit());
	}
}
