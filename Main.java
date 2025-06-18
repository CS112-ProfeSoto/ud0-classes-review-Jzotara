/**
 * Driver program that creates standard 52-card deck (as Card array)
 * and prints out each card in deck.
 *
 * @author Jon Zotara
 * @version 0.1
 */

public class Main {

	/* ALGORITHM
	*
	1. Generate 52 card deck into Card array
	- Array suits creates array of each suit
	2. Print deck (simple)
	- 
	*
	*/
	public static void main(String[] args) {
		/*** RUNNING TESTER ***/
		//uncomment line below to run CardTester:
		CardTester.main(null);

		/*** DRIVER PROGRAM ***/
		// suits as defined in Card class
		char[] suits = { Card.HEART, Card.DIAMOND, Card.CLUB, Card.SPADE };

		// create new array to hold 52 cards
		Card[] deck = new Card[52];
		int index = 0;

		// loop through each suit and value to fill deck
		for (char suit : suits) {
			for (int value = 1; value <= 13; value++) {
				deck[index++] = new Card(value, suit);
			}
		}

		//2. Print deck, while matching all the same suits on the same lines 
		for (char suit : suits) {
			StringBuilder line = new StringBuilder();
			for (Card card : deck) {
				if (card.getSuit() == suit) {
					line.append(card.getPrintValue()).append(" ").append(suit).append(" ");
				}
			}
		System.out.println(line);
		}
	}
}