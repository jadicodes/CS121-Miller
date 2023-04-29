//Jadi Miller
//Data Structures
//2/1/2023
//The user will input a Hogwarts house and Switch will display information on that house.
import java.util.Scanner;
public class SwitchActivity {
            public static void main(String[] args) {
                Scanner keyboard = new Scanner(System.in);
                System.out.println("Enter a Hogwarts house.");
                String house = keyboard.nextLine();

                switch (house)
                {
                    case "Gryffindor":
                        System.out.println("Known for: Courage");
                        System.out.println("Mascot: Lion");
                        System.out.println("Colors: Red and gold");
                        break;

                    case "Ravenclaw":
                        System.out.println("Known for: Wisdom");
                        System.out.println("Mascot: Raven");
                        System.out.println("Colors: Blue and bronze");
                        break;

                    case "Hufflepuff":
                        System.out.println("Known for: Loyalty");
                        System.out.println("Mascot: Badger");
                        System.out.println("Colors: Yellow and black");
                        break;

                    case "Slytherin":
                        System.out.println("Known for: Cleverness");
                        System.out.println("Mascot: Snake");
                        System.out.println("Colors: Green and silver");
                        break;
                }
            }
        }