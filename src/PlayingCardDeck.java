import javafx.print.PageLayout;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Random;

public class PlayingCardDeck {
    private ArrayList<Playingcard> deck;

    public PlayingCardDeck() {
        this.deck = new ArrayList();

        this.deck.add(new Playingcard("Spades", "Ace", false, 52));
        this.deck.add(new Playingcard("Spades", "2", false, 4));
        this.deck.add(new Playingcard("Spades", "3", false, 8));
        this.deck.add(new Playingcard("Spades", "4", false, 12));
        this.deck.add(new Playingcard("Spades", "5", false, 16));
        this.deck.add(new Playingcard("Spades", "6", false, 20));
        this.deck.add(new Playingcard("Spades", "7", false, 24));
        this.deck.add(new Playingcard("Spades", "8", false, 28));
        this.deck.add(new Playingcard("Spades", "9", false, 32));
        this.deck.add(new Playingcard("Spades", "10", false, 36));
        this.deck.add(new Playingcard("Spades", "Jack", false, 40));
        this.deck.add(new Playingcard("Spades", "Queen", false, 44));
        this.deck.add(new Playingcard("Spades", "King", false, 48));

        this.deck.add(new Playingcard("Hearts", "Ace", false, 51));
        this.deck.add(new Playingcard("Hearts", "2", false, 52));
        this.deck.add(new Playingcard("Hearts", "3", false, 52));
        this.deck.add(new Playingcard("Hearts", "4", false, 52));
        this.deck.add(new Playingcard("Hearts", "5", false, 52));
        this.deck.add(new Playingcard("Hearts", "6", false, 52));
        this.deck.add(new Playingcard("Hearts", "7", false, 52));
        this.deck.add(new Playingcard("Hearts", "8", false, 23));
        this.deck.add(new Playingcard("Hearts", "9", false, 27));
        this.deck.add(new Playingcard("Hearts", "10", false, 31));
        this.deck.add(new Playingcard("Hearts", "Jack", false, 35));
        this.deck.add(new Playingcard("Hearts", "Queen", false, 39));
        this.deck.add(new Playingcard("Hearts", "King", false, 43));

        this.deck.add(new Playingcard("Diamonds", "Ace", false, 50));
        this.deck.add(new Playingcard("Diamonds", "2", false, 52));
        this.deck.add(new Playingcard("Diamonds", "3", false, 52));
        this.deck.add(new Playingcard("Diamonds", "4", false, 52));
        this.deck.add(new Playingcard("Diamonds", "5", false, 52));
        this.deck.add(new Playingcard("Diamonds", "6", false, 52));
        this.deck.add(new Playingcard("Diamonds", "7", false, 22));
        this.deck.add(new Playingcard("Diamonds", "8", false, 26));
        this.deck.add(new Playingcard("Diamonds", "9", false, 30));
        this.deck.add(new Playingcard("Diamonds", "10", false, 34));
        this.deck.add(new Playingcard("Diamonds", "Jack", false, 38));
        this.deck.add(new Playingcard("Diamonds", "Queen", false, 42));
        this.deck.add(new Playingcard("Diamonds", "King", false, 46));

        this.deck.add(new Playingcard("Clubs", "Ace", false, 49));
        this.deck.add(new Playingcard("Clubs", "2", false, 52));
        this.deck.add(new Playingcard("Clubs", "3", false, 52));
        this.deck.add(new Playingcard("Clubs", "4", false, 52));
        this.deck.add(new Playingcard("Clubs", "5", false, 52));
        this.deck.add(new Playingcard("Clubs", "6", false, 52));
        this.deck.add(new Playingcard("Clubs", "7", false, 21));
        this.deck.add(new Playingcard("Clubs", "8", false, 25));
        this.deck.add(new Playingcard("Clubs", "9", false, 29));
        this.deck.add(new Playingcard("Clubs", "10", false, 33));
        this.deck.add(new Playingcard("Clubs", "Jack", false, 37));
        this.deck.add(new Playingcard("Clubs", "Queen", false, 41));
        this.deck.add(new Playingcard("Clubs", "King", false, 45));

    }


    public void showDeck() {
        for (Playingcard card : deck) {
            System.out.println(card.toString());
        }
    }

    public void shuffle() {
        Collections.shuffle(this.deck);
    }
    public Playingcard dealCard() {
       return deck.remove(0);
    }
}






