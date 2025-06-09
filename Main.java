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
		//1. Generate 52 card deck into Card array
		char[] suits = { Card.HEART, Card.DIAMOND, Card.CLUB, Card.SPADE };


		for (char suit : suits) {
			for (int value = 1; value <= 13; value++) {
				Card card = new Card(value, suit);
				System.out.print(card.getPrintValue() + " " + card.getSuit() + " ");
			}
			System.out.println("");
		//used to move to next line after each suit
		}

		//2. Print deck


	}
}