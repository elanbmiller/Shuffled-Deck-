import java.util.Vector;

public class Deck {


	public static void main(String[] args) {

		//creating initial, ordered deck
		Vector<Card> deck = new Vector<Card>(52);

		for(int i = 0; i < 4; i++){

			for(int j = 0; j < 13; j++){

				Card newCard = new Card(Card.suitTypes[i],Card.values[j]);
				deck.add(newCard);
			}

		}

		printDeck(deck);//ordered deck

		System.out.println();
		System.out.println();

		
		printDeck(shuffle(deck));//shuffled deck
	}
	
	
	//switches, by means of iteration, each card, with a random card in the deck
	//and it does this shuffling through the whole deck 2000 times (to be sure it's very shuffled)
	public static Vector<Card> shuffle(Vector<Card> deck){

		int rand = 0;
		
		Vector<Card> shuffledDeck =  (Vector<Card>) deck.clone();

		for(int j = 0; j < 20000; j++){

			for(int i = 0; i < 52; i++){

				rand = (int)Math.round((Math.random()*51));

				Card newCard = new Card();
				Card newCard2 = new Card();

				newCard = shuffledDeck.get(i);
				newCard2 = shuffledDeck.get(rand);


				shuffledDeck.remove(rand);
				shuffledDeck.add(rand, newCard);

				shuffledDeck.remove(i);
				shuffledDeck.add(i, newCard2);
			}
		}
		System.out.println("Shuffled Deck");
		return shuffledDeck;
	}

	//prints out deck of cards
	public static void printDeck(Vector<Card> anyDeck){

		for(Card anyCard : anyDeck){

			anyCard.printCard();
		}
	}
}

