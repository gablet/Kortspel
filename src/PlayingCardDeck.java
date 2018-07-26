import java.util.Random;

public class PlayingCardDeck {
    private Playingcard[] deck;
    private int currentCard;

    public PlayingCardDeck() {
        String[] suits = {"Diamonds", "Hearts", "Clubs", "Spades"};
        String[] names = {"2", "3", "4", "5", "6", "7", "8",
                "9", "10", "Jack", "Queen", "King", "Ace"};
        deck = new Playingcard[52];
        currentCard = 0;

        for (int suit = 0; suit < 4; suit++)
            for (int cardNum = 0; cardNum < 13; cardNum++) {
                deck[(cardNum + (suit * 13))] = new Playingcard(names[cardNum], suits[suit], cardNum + 2);
            }
    }

    public void showDeck() {
        for (Playingcard card : deck) {
            System.out.println(card);
        }
    }

    public void shuffle() {
        currentCard = 0;
        Random randomNum = new Random();
        for (int first = 0; first < deck.length; first++) {
            int second = randomNum.nextInt(52);
            Playingcard temp = deck[first];
            deck[first] = deck[second];
            deck[second] = temp;

        }
    }



}



