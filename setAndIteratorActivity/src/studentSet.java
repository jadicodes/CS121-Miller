import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.Iterator;

public class studentSet {
    public static Set<String> addStudents() {
        Set<String> students = new HashSet<String>();
        Scanner keyboard = new Scanner(System.in);
        System.out.println("How many students would you like to add?");
        int numberOfStudents = keyboard.nextInt();

        for(int i = 0; i < numberOfStudents; i++) {
            System.out.println("Enter student name: ");
            String studentName = keyboard.next();
            students.add(studentName);
        }
        return students;
    }
    public static void displayStudents(Set<String>students) {
        Iterator<String> iterator = students.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
