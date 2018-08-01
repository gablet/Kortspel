public class Playingcard {
    private String suit;
    private boolean hidden;
    private String value;
    private final int prio;

    public Playingcard(String suit, String value, boolean hidden, int prio) {
        this.suit = suit;
        this.hidden = hidden;
        this.value = value;
        this.prio = prio;
    }

    public String getSuit() {
        return suit;
    }

    public boolean isHidden() {
        return hidden;
    }

    public void setHidden(boolean hidden) {
        this.hidden = hidden;
    }

    public String getValue() {
        return value;
    }

    public int getPrio() {
        return prio;
    }

    public String toString() {
        return value + " of " + suit;
    }
}