import java.util.ArrayList;
import java.util.Collections;

public class PlayingCardDeck {
    private ArrayList<Playingcard> deck;

    public PlayingCardDeck() {
        this.deck = new ArrayList();


        this.deck.add(new Playingcard("Spades", "2", true, 4));
        this.deck.add(new Playingcard("Spades", "3", true, 8));
        this.deck.add(new Playingcard("Spades", "4", true, 12));
        this.deck.add(new Playingcard("Spades", "5", true, 16));
        this.deck.add(new Playingcard("Spades", "6", true, 20));
        this.deck.add(new Playingcard("Spades", "7", true, 24));
        this.deck.add(new Playingcard("Spades", "8", true, 28));
        this.deck.add(new Playingcard("Spades", "9", true, 32));
        this.deck.add(new Playingcard("Spades", "10", true, 36));
        this.deck.add(new Playingcard("Spades", "Jack", true, 40));
        this.deck.add(new Playingcard("Spades", "Queen", true, 44));
        this.deck.add(new Playingcard("Spades", "King", true, 48));
        this.deck.add(new Playingcard("Spades", "Ace", true, 52));


        this.deck.add(new Playingcard("Hearts", "2", true, 3));
        this.deck.add(new Playingcard("Hearts", "3", true, 7));
        this.deck.add(new Playingcard("Hearts", "4", true, 11));
        this.deck.add(new Playingcard("Hearts", "5", true, 15));
        this.deck.add(new Playingcard("Hearts", "6", true, 19));
        this.deck.add(new Playingcard("Hearts", "7", true, 23));
        this.deck.add(new Playingcard("Hearts", "8", true, 27));
        this.deck.add(new Playingcard("Hearts", "9", true, 31));
        this.deck.add(new Playingcard("Hearts", "10", true, 35));
        this.deck.add(new Playingcard("Hearts", "Jack", true, 39));
        this.deck.add(new Playingcard("Hearts", "Queen", true, 43));
        this.deck.add(new Playingcard("Hearts", "King", true, 47));
        this.deck.add(new Playingcard("Hearts", "Ace", true, 51));

        this.deck.add(new Playingcard("Diamonds", "2", true, 2));
        this.deck.add(new Playingcard("Diamonds", "3", true, 6));
        this.deck.add(new Playingcard("Diamonds", "4", true, 10));
        this.deck.add(new Playingcard("Diamonds", "5", true, 14));
        this.deck.add(new Playingcard("Diamonds", "6", true, 18));
        this.deck.add(new Playingcard("Diamonds", "7", true, 22));
        this.deck.add(new Playingcard("Diamonds", "8", true, 26));
        this.deck.add(new Playingcard("Diamonds", "9", true, 30));
        this.deck.add(new Playingcard("Diamonds", "10", true, 34));
        this.deck.add(new Playingcard("Diamonds", "Jack", true, 38));
        this.deck.add(new Playingcard("Diamonds", "Queen", true, 42));
        this.deck.add(new Playingcard("Diamonds", "King", true, 46));
        this.deck.add(new Playingcard("Diamonds", "Ace", true, 50));

        this.deck.add(new Playingcard("Clubs", "2", true, 1));
        this.deck.add(new Playingcard("Clubs", "3", true, 5));
        this.deck.add(new Playingcard("Clubs", "4", true, 9));
        this.deck.add(new Playingcard("Clubs", "5", true, 13));
        this.deck.add(new Playingcard("Clubs", "6", true, 17));
        this.deck.add(new Playingcard("Clubs", "7", true, 21));
        this.deck.add(new Playingcard("Clubs", "8", true, 25));
        this.deck.add(new Playingcard("Clubs", "9", true, 29));
        this.deck.add(new Playingcard("Clubs", "10", true, 33));
        this.deck.add(new Playingcard("Clubs", "Jack", true, 37));
        this.deck.add(new Playingcard("Clubs", "Queen", true, 41));
        this.deck.add(new Playingcard("Clubs", "King", true, 45));
        this.deck.add(new Playingcard("Clubs", "Ace", true, 49));
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

    public void addCardToEndOfDeck(Playingcard card) {
        card.setHidden(true);
        deck.add(card);
    }

}






