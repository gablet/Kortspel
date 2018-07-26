public class Playingcard {
    private String cardName;
    private String suit;
    private int cardValue;
    private boolean hidden;


    public Playingcard(String name, String suit, int value) {
        this.cardName = name;
        this.suit = suit;
        this.cardValue = value;
    }

    public String toString() {
        return cardName + " of " + suit;
    }
}