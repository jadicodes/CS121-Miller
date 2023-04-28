import java.util.Scanner;
public class PokemonSelection {
    // instance variables
    private Scanner scanner;

    // constructor
    public PokemonSelection() {
        scanner = new Scanner(System.in);
    }
    // a createPokemon() method that asks user to select the values needed to create a Pokemon
    public Pokemon createPokemon() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter name of the Pokemon: ");
        String name = scanner.nextLine();

        System.out.println("Enter hit points of the Pokemon: ");
        int hitPoints = scanner.nextInt();

        System.out.println("Enter name of the move: ");
        String move = scanner.next();

        System.out.println("Enter power of the move: ");
        int movePower = scanner.nextInt();

        System.out.println("Enter attack speed of the Pokemon: ");
        int attackSpeed = scanner.nextInt();

        return new Pokemon(name, hitPoints, move, movePower, attackSpeed);
    }
    // an assignPokemon() method that assigns a Pokemon to each player
    public void assignPokemon() {
        // for each player
        for (int i = 1; i <= 2; i++) {
            System.out.println("Player " + i + ": Select a Pokemon and enter its stats");
            // call the createPokemon() method and assign the returned instance (object) of the Pokemon class to a variable (such as pokemon1 or pokemon2)
            Pokemon pokemon = createPokemon();
            System.out.println("Player " + i + " Pokemon:");
            // call the displayPokemonStats() method for that Pokemon instance and print the returned String
            System.out.println(pokemon.displayPokemonStats());
        }
        scanner.close();
    }
}
