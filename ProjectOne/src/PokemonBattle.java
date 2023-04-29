//Jadi Miller
//Data Structures
//2/13/2023
//Project One
//Program plays a text based Pokémon battle game between two players. It begins by asking
//the user how many turns they want to play. Then, each player will enter stats of their
//Pokémon. For each round, the fastest Pokémon will strike first, and then they will take turns
//until one of the Pokémon loses all of their HP. It will rotate through all the rounds and
//the winner will be announced based on who has the most points.

import java.util.Scanner;
import java.util.Random;
public class PokemonBattle {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        Random rand = new Random();

        // How many rounds will be played
        Integer rounds;
        System.out.println("How many rounds would you like to play? Please enter an odd number.");
        rounds = Integer.valueOf(scanner.nextLine());

        // Name, hit points, move, move's power, attack speed
        String name1;
        Integer hitPoints1;
        String move1;
        Integer movePower1;
        Integer attackSpeed1;

        String name2;
        Integer hitPoints2;
        String move2;
        Integer movePower2;
        Integer attackSpeed2;

        // Score and turn tracker

        Integer playerOneScore = 0;
        Integer playerTwoScore = 0;

        String turnTracker = "";

        int i;

        //For each round, enter stats and then the program computes which Pokemon wins
        for (i = 0; i < rounds; i++) {
            System.out.println("ROUND " + (i + 1));

            System.out.println("-----PLAYER ONE-----");
            System.out.println("Enter Pokemon name: ");
            name1 = scanner.nextLine();
            System.out.println("Enter HP: ");
            hitPoints1 = Integer.valueOf(scanner.nextLine());
            System.out.println("Enter name of move: ");
            move1 = scanner.nextLine();
            System.out.println("Enter attack power: ");
            movePower1 = Integer.valueOf(scanner.nextLine());
            System.out.println("Enter speed: ");
            attackSpeed1 = Integer.valueOf(scanner.nextLine());

            System.out.println("-----PLAYER TWO-----");
            System.out.println("Enter Pokemon name: ");
            name2 = scanner.nextLine();
            System.out.println("Enter HP: ");
            hitPoints2 = Integer.valueOf(scanner.nextLine());
            System.out.println("Enter name of move: ");
            move2 = scanner.nextLine();
            System.out.println("Enter attack power: ");
            movePower2 = Integer.valueOf(scanner.nextLine());
            System.out.println("Enter speed: ");
            attackSpeed2 = Integer.valueOf(scanner.nextLine());

            if (attackSpeed1 == attackSpeed2) {
                attackSpeed1 = rand.nextInt(1000);
                attackSpeed2 = rand.nextInt(1000);
            }

            if (attackSpeed1 > attackSpeed2) {
                hitPoints2 = playerOneStrikes(movePower1, hitPoints2);
                turnTracker = "Player2";
            }
            if (attackSpeed2 > attackSpeed1) {
                hitPoints1 = playerTwoStrikes(movePower2, hitPoints1);
                turnTracker = "Player1";
            }

            while (hitPoints1 > 0 && hitPoints2 > 0) {
                if (turnTracker.equals("Player1")) {
                    hitPoints2 = playerOneStrikes(movePower1, hitPoints2);
                    turnTracker = "Player2";
                }

                else {
                    hitPoints1 = playerTwoStrikes(movePower2, hitPoints1);
                    turnTracker = "Player1";
                }
            }

            //Determines and prints which player wins the round and adds score
            if (hitPoints1 <= 0) {
                System.out.println("Player 2's " + name2 + " wins this round!");
                playerTwoScore = playerTwoScore + 1;
            } else {
                System.out.println("Player 1's " + name1 + " wins this round!");
                playerOneScore = playerOneScore + 1;
            }
            printScores(playerOneScore, playerTwoScore);
        }
        //Determines and prints which player wins the game
        if (playerOneScore > playerTwoScore) {
            System.out.println("Player 1 wins the game!");
        } else {
            System.out.println("Player 2 wins the game!");
        }
    }

    public static Integer playerOneStrikes(Integer movePower1, Integer hitPoints2) {
        hitPoints2 = hitPoints2 - movePower1;
        return (hitPoints2);
    }

    public static Integer playerTwoStrikes(Integer movePower2, Integer hitPoints1) {
        hitPoints1 = hitPoints1 - movePower2;
        return (hitPoints1);
    }

    public static void printScores(Integer playerOneScore, Integer playerTwoScore) {
        System.out.println("Player 1: " + playerOneScore);
        System.out.println("Player 2: " + playerTwoScore);
    }
}

