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
        if(!hidden) {
            return suit;
        }
        else{
            return "?";
        }
    }

    public boolean isHidden() {
        return hidden;
    }

    public void setHidden(boolean hidden) {
        this.hidden = hidden;
    }

    public String getValue() {
        if (!hidden) {
            return value;
        } else {
            return "?";
        }
    }

    public int getPrio() {
        return prio;
    }

    public String toString() {
        return getValue() + " of " + getSuit();
    }
}