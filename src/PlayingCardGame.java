import java.io.*;
import java.util.Scanner;

public class PlayingCardGame {
    public PlayingCardDeck deck;
    String Player;
    String Computer;


    public PlayingCardGame() throws IOException {
        this.deck = new PlayingCardDeck();
        startMenu();
    }

    public void startMenu() throws IOException {

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
        } else if (input == 3) {
            File file1 = new File("C:\\Users\\Administrator\\Documents\\javamapp\\Kortspel\\src\\HighScore.txt");
            BufferedReader score = null;
            try {
                score = new BufferedReader(new FileReader(file1));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            String s;
            assert score != null;
            while ((s = score.readLine()) != null)
                System.out.println(s);
        } else if (input == 4) {
            System.exit(0);
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
        } else {
            System.out.println("You have made an incorrect choice, try again");
        }
    }

    public void startGame() throws IOException {
        int score = 0;
        int counts = 0;
        deck.shuffle();
        System.out.println("Shuffeling the cards..");
        System.out.println("The deck has been shuffled, press 1 to deal");
        Scanner i = new Scanner(System.in);
        int deal = i.nextInt();
        if (deal == 1) {
            while (counts < 5) {

                System.out.println("Your card is " + deck.dealCard() + "\nThe Computerscard is .....");
                System.out.println("Is your card greater or lower than the computers?\n" +
                        "1. To guess greater than\n2.To guess lower than");
                if (deck.dealCard().getPrio() < x) {

                    counts++;
                } else if (x > y) {
                    counts++;
                }
            }
            System.out.println("Game Over!\nYour score is " + score);
            System.out.println("Type your name to save your score");

            System.out.println("Type in your name");
            Scanner p = new Scanner(System.in);
            Player = p.next();
            HighScore(Player, score);

        }
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



