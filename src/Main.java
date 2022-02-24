import java.util.Scanner;
import java.util.Random;


public class Main {
    public static void main(String[] args) {
        String player1;
        String player2;
        String trash = "";
        boolean loop = false;
        char response;

        Scanner scan = new Scanner(System.in);
        do{

            System.out.println();
            do {
                System.out.println("Player 1 enter your move: ");
                player1 = scan.next();

                if (player1.equals("R")) {
                    System.out.println("The move is ROCK!");
                    loop = true;
                } else if (player1.equals("P")) {
                    System.out.println("The move is PAPER!");
                    loop = true;
                } else if (player1.equals("S")) {
                    System.out.println("The move is SCISSORS!");
                    loop = true;
                } else {
                    trash = scan.next();
                    System.out.println(player1 + " is not a legal move!");
                }
            }
            while (!loop);

            do {
                System.out.println("Player 2 enter your move: ");
                player2 = scan.next();

                if (player2.equals("R")) {
                    System.out.println("The move is ROCK!");
                    loop = true;
                } else if (player2.equals("P")) {
                    System.out.println("The move is PAPER!");
                    loop = true;
                } else if (player2.equals("S")) {
                    System.out.println("The move is SCISSORS!");
                    loop = true;
                } else {
                    trash = scan.next();
                    System.out.println(player2 + " is not a legal move!");
                }
            }
            while (!loop);

            player1 = player1.toUpperCase();
            player2 = player2.toUpperCase();


            if (player1.equals(player2))
            {
                System.out.println("It's a tie!");
            }
            else if (player1.equals("R"))

                if (player2.equals("S"))
                {
                    System.out.println("Rock crushes scissors. Player 1 wins!!");
                }
                else if (player2.equals("P"))
                {
                    System.out.println("Paper eats rock. Player 2 wins!!");
                }
                else if (player1.equals("P"))

                    if (player2.equals("S"))
                    {
                        System.out.println("Scissor cuts paper. Player 2 wins!!");
                    }
                    else if (player2.equals("R"))
                    {
                        System.out.println("Paper eats rock. Player 1 wins!!");
                    }
                    else if (player1.equals("S"))

                        if (player2.equals("P"))
                        {
                            System.out.println("Scissor cuts paper. Player 1 wins!!");
                        }
                        else if (player2.equals("R"))
                        {
                            System.out.println("Rock breaks scissors. Player 2 wins!!");
                        }
                        else
                            System.out.println("Invalid user input.");

            System.out.println("Would you like to play again Y/N?");
            response = scan.next().charAt(0);
        }
        while(response == 'Y');
    }
}