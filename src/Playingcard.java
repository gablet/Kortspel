public class Playingcard {
    private String faceName;
    private String suit;
    private int faceValue;
    private boolean hidden;


    public Playingcard(String face, String suit, int value) {
        this.faceName = face;
        this.suit = suit;
        this.faceValue = value;
    }

    public String toString() {
        return faceName + " of " + suit;
    }
}