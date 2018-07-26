import com.googlecode.lanterna.TerminalFacade;
import com.googlecode.lanterna.input.Key;
import com.googlecode.lanterna.terminal.Terminal;

import java.io.*;
import java.nio.charset.Charset;
import java.util.Scanner;

public class PlayingCardGame {
   public PlayingCardDeck deck;
   String Player1;
   String Player2;
   String Computer;



   public PlayingCardGame ()throws IOException {
       Scanner sc = new Scanner(System.in);
      System.out.println("Welcome");
      System.out.println("To start the game, chose one of the following options");
      System.out.println("1. For 1 player " + "\n" + "2. For 2 players");
      int input = sc.nextInt();
      if(input == 1 ){
          onePlayer();

      }
      else if (input == 2){


      }
      else {
          System.out.println("You have made an incorrect choice, try again");
      }


       deck = new PlayingCardDeck();

    }

    public void onePlayer()throws IOException{
       System.out.println("You have chosen 1 player." + "\n" + "Type in your name");
       Scanner p1 = new Scanner(System.in);
       Player1 = p1.next();
       HighScore(Player1,0);
       System.out.println("To start game enter Start" + "\n" + "To see rules enter Rules");
       Scanner sc = new Scanner(System.in);
       String input = sc.next();

       if(input == "Start"){
           deck.shuffle();
           System.out.println(" ");
           System.out.println("Shuffeling the cards..");
           System.out.println("The deck has been shuffled, press 1 to deal");
           

    }
    else if(input == "Rules") {
       }
    else {
           System.out.println("Invalid choice, try again");
       }
       }

    public void HighScore(String name, int score )throws IOException {
        PrintWriter stats = new PrintWriter(new BufferedWriter(new OutputStreamWriter(new FileOutputStream("HighScore.txt"),"UTF-8")));
        stats.println(name + score);
    }

}
