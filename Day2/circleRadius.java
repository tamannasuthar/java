// import java.util.*;

// public class circleRadius {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         // get the area of the circle from the user
//         System.out.print("Enter the area of the circle : ");
//     }
    
// }


import java.util.Scanner;

public class circleRadius {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get the area of the circle from the user.
        System.out.print("Enter the area of the circle: ");
        double area = sc.nextDouble();

        // Calculate the radius of the circle.
        double radius = Math.sqrt(area / Math.PI);

        // Print the radius of the circle.
        System.out.println("The radius of the circle is: " + radius);
        sc.close();
    }
}