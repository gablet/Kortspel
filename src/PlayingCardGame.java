import com.googlecode.lanterna.TerminalFacade;
import com.googlecode.lanterna.input.Key;
import com.googlecode.lanterna.terminal.Terminal;

import java.io.*;
import java.nio.charset.Charset;
import java.util.Scanner;

public class PlayingCardGame {
    public PlayingCardDeck deck;
    String Player1;
    String Computer;


    public PlayingCardGame() {
        this.deck = new PlayingCardDeck();
        startMenu();
    }

    public void startMenu() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome! \nTo start the game, chose one of the following options");
        System.out.println("1.To Start the game \n2.For Rules \n3.To see High scores\n4.To exit the game");
        int input = sc.nextInt();
        if (input == 1) {
            try {
                startGame();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else if (input == 2) {
            try {
                rules();
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println("1. Start the game \n2. To exit");
            Scanner s = new Scanner(System.in);
            int in = s.nextInt();
            if (in == 1) {
                try {
                    startGame();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } else if (in == 2) {
                System.exit(0);
            } else if (in == 3) {
                File file1 = new File("C:\\Users\\Administrator\\Documents\\javamapp\\Kortspel\\src\\HighScore.txt");
                try {
                    BufferedReader score = new BufferedReader(new FileReader(file1));
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }

            }
        } else if (input == 4) {
            System.exit(0);
        } else {
            System.out.println("You have made an incorrect choice, try again");
        }
    }

    public void startGame() throws IOException {

        deck.shuffle();
        System.out.println("Shuffeling the cards..");
        System.out.println("The deck has been shuffled, press 1 to deal");
    }

    public void HighScore(String name, int score) throws IOException {
        PrintWriter stats = new PrintWriter(new BufferedWriter
                (new FileWriter("C:\\Users\\Administrator\\Documents\\javamapp\\Kortspel\\src\\HighScore.txt", true)));

        stats.println("Name: " + name + " Score: " + score + "\n");
        stats.close();
    }

    public void rules() throws IOException {
        File file = new File("C:\\Users\\Administrator\\Documents\\javamapp\\Kortspel\\src\\Rules.txt");

        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(file));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        String st;
        while ((st = br.readLine()) != null)
            System.out.println(st);
    }
}


/**
 * System.out.println("Type in your name");
 * Scanner p1 = new Scanner(System.in);
 * Player1 = p1.next();
 * HighScore(Player1, 0);
 **/