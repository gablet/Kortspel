import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class PlayingCardDeck {
    String[] färg = {"Diamonds", "Hearts", "Clovers", "Spades"};
    String[] kort = {"Ace", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight",
            "Nine", "Ten", "Pawn", "Queen", "King"};

    String [][] kortlek = new String[14][4];




    public String [][] createDeck(String[] f, String[] k) {
        Array[][] deckOfCards = new Array[14][4];
        int count = 1;
        for (int i = 0; i < k.length; i++) {
            for (int j = 0; j < f.length; j++)
                deckOfCards[i][j] = deckOfCards[i][j];

        }
        return deckOfCards;
    }
}



