import java.util.*;

public class multiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // user to enter a number
        System.out.println("Enter a number: ");
        int number = sc.nextInt();

        // Print the multiplication table of the number
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " * " + i + " = " + (number * i));

        }

        sc.close();
    }
}
