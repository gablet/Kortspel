import java.io.*;
import java.util.Scanner;

public class PlayingCardGame {
    private PlayingCardDeck deck;
    private String Player;
    private int wins;
    private int losses;


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
        System.out.println("\n1.Start the game \n2. To exit");
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
        wins = 0;
        losses =0;
        int counts = 0;
        deck.shuffle();
        System.out.println("Shuffeling the cards..");
        System.out.println("The deck has been shuffled, press 1 to deal");
        Scanner i = new Scanner(System.in);
        int deal = i.nextInt();
        if (deal == 1) {
            while (counts < 5) {
                Playingcard computerCard = deck.dealCard();
                Playingcard playerCard = deck.dealCard();
                System.out.println("\nThe computers card is " + computerCard.toString() + "\nYour card is .....\n");
                System.out.println("Is your card greater or lower than the computers?\n" +
                        "1. To guess greater than\n2.To guess lower than");
                Scanner g = new Scanner(System.in);
                int guess = g.nextInt();
                if (guess == 1) { // guess that your card is greater
                    if (computerCard.getPrio() < playerCard.getPrio()) {
                        System.out.println("Correct");
                        System.out.println("Your card is " + playerCard.toString());
                        wins++;
                        counts++;
                        deck.addCardToDeck(computerCard);
                        deck.addCardToDeck(playerCard);
                    } else if (computerCard.getPrio() > playerCard.getPrio()) {
                        System.out.println("\nWrong!");
                        System.out.println("Your card is " + playerCard.toString());
                        losses++;
                        counts++;
                        deck.addCardToDeck(computerCard);
                        deck.addCardToDeck(playerCard);
                    }
                }
                else if (guess == 2) {
                    if (computerCard.getPrio() > playerCard.getPrio()) {
                        System.out.println("\nCorrect!");
                        System.out.println("Your card is " + playerCard.toString());
                        wins++;
                        counts++;
                        deck.addCardToDeck(computerCard);
                        deck.addCardToDeck(playerCard);
                    } else if (computerCard.getPrio() < playerCard.getPrio()) {
                        System.out.println("\nWrong!");
                        System.out.println("Your card card is " + playerCard.toString());
                        counts++;
                        losses ++;
                        deck.addCardToDeck(computerCard);
                        deck.addCardToDeck(playerCard);
                    }
                }
                else {
                    System.out.println("Wrong choice, try again");
                }
            }
            System.out.println("\nGame Over!\nYou got " + wins + " wins! and "+ losses + " losses");
            System.out.println("Type your name to save your score");
            Scanner p = new Scanner(System.in);
            Player = p.next();
            HighScore(Player, wins,losses);
            System.out.println("\nWould you like to play again?\n1.To start a new game\n2.Go back to main menu");
            Scanner ng = new Scanner(System.in);
            int newgame = ng.nextInt();
            if(newgame ==1){
                startGame();
            }
            else if(newgame==2){
                startMenu();
            }
        }
    }

    public void HighScore(String name, int win,int loss) throws IOException {
        PrintWriter stats = new PrintWriter(new BufferedWriter
                (new FileWriter("C:\\Users\\Administrator\\Documents\\javamapp\\Kortspel\\src\\HighScore.txt", true)));

        stats.println(name + "\nWins: " + win + "\nLosses:" + loss);
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



