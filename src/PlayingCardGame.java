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
        System.out.println("Welcome! \nTo start the game, chose one of the following options");
        System.out.println("1.Start the game \n2.Rules \n3.See High scores\n4.Exit the game");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        switch (input) {
            case 1:
                startGame();
                returnMenu();
                break;
            case 2:
                rules();
                returnMenu();
                break;
            case 3:
                seeHighScore();
                returnMenu();
                break;
            case 4:
                System.exit(0);
                break;
        }
    }

    public void returnMenu() {
        System.out.println("\n1.Start the game \n2.Back to menu");
        Scanner s = new Scanner(System.in);
        int in = s.nextInt();
        if (in == 1) {
            try {
                startGame();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else if (in == 2) {
            try {
                startMenu();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("You have made an incorrect choice, try again");
        }
    }

    public void startGame() throws IOException {
        wins = 0;
        losses = 0;
        int counts = 0;
        deck.shuffle();

        System.out.println("Shuffeling the cards..\nThe deck has been shuffled, press 1 to deal");
        Scanner i = new Scanner(System.in);
        int deal = i.nextInt();
        if (deal == 1) {
            while (counts < 5) {
                Playingcard computerCard = deck.dealCard();
                Playingcard playerCard = deck.dealCard();
                computerCard.setHidden(false);
                System.out.println("\nThe computers card is " + computerCard.toString() + "\nYour card is " + playerCard.toString());
                System.out.println("Is your card greater or lower than the computers?\n" +
                        "1. To guess greater than\n2.To guess lower than");
                Scanner g = new Scanner(System.in);
                int guess = g.nextInt();

                if (guess == 1) {// guess that your card is greater
                    playerCard.setHidden(false);
                    if (computerCard.getPrio() < playerCard.getPrio()) {
                        System.out.println("Correct");
                        System.out.println("Your card is " + playerCard.toString());
                        wins++;
                        counts++;
                        deck.addCardToEndOfDeck(computerCard);
                        deck.addCardToEndOfDeck(playerCard);
                    } else if (computerCard.getPrio() > playerCard.getPrio()) {
                        System.out.println("\nWrong!");
                        System.out.println("Your card is " + playerCard.toString());
                        losses++;
                        counts++;
                        deck.addCardToEndOfDeck(computerCard);
                        deck.addCardToEndOfDeck(playerCard);
                    }
                } else if (guess == 2) {
                    playerCard.setHidden(false);
                    if (computerCard.getPrio() > playerCard.getPrio()) {
                        System.out.println("\nCorrect!");
                        System.out.println("Your card is " + playerCard.toString());
                        wins++;
                        counts++;
                        deck.addCardToEndOfDeck(computerCard);
                        deck.addCardToEndOfDeck(playerCard);
                    } else if (computerCard.getPrio() < playerCard.getPrio()) {
                        System.out.println("\nWrong!");
                        System.out.println("Your card card is " + playerCard.toString());
                        counts++;
                        losses++;
                        deck.addCardToEndOfDeck(computerCard);
                        deck.addCardToEndOfDeck(playerCard);
                    }
                } else {
                    System.out.println("Wrong choice, try again");
                }
            }
            gameOver();
        }
    }

    public void gameOver() throws IOException {
        System.out.println("\nGame Over!\nYou got " + wins + " wins! and " + losses + " losses");
        System.out.println("Type your name to save your score");

        Scanner p = new Scanner(System.in);
        Player = p.next();

        if (Player == null) {
            System.out.println("Invalid name, try again");
        } else {
            saveHighScore(Player, wins, losses);
        }

        System.out.println("\nWould you like to play again?\n1.To start a new game\n2.Go back to main menu");
        Scanner ng = new Scanner(System.in);
        int newgame = ng.nextInt();
        if (newgame == 1) {
            startGame();
        } else if (newgame == 2) {
            startMenu();
        } else {
            System.out.println("Incorrect choice, tyr again");
        }
    }


    public void saveHighScore(String name, int win, int loss) throws IOException {
        File HighScore = new File("C:\\Users\\Administrator\\Documents\\javamapp\\Kortspel\\src\\HighScore.txt");
        PrintWriter stats = new PrintWriter(new BufferedWriter
                (new FileWriter(HighScore, true)));

        stats.println(name + "\nCorrect answers: " + win + "\nWrong answers:" + loss);
        stats.close();
    }

    public void seeHighScore() throws IOException {
        File highscore = new File("C:\\Users\\Administrator\\Documents\\javamapp\\Kortspel\\src\\HighScore.txt");
        BufferedReader score = null;
        try {
            score = new BufferedReader(new FileReader(highscore));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        String s;
        assert score != null;
        while ((s = score.readLine()) != null)
            System.out.println(s);
    }

    public void rules() throws IOException {
        File rules = new File("C:\\Users\\Administrator\\Documents\\javamapp\\Kortspel\\src\\Rules.txt");

        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(rules));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        String rule;
        while ((rule = br.readLine()) != null)
            System.out.println(rule);
    }
}



