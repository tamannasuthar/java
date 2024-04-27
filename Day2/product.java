
import java.util.*;
public class product {
    public static void main(String[] args) {
        System.out.println("Ready");
        Scanner sc = new Scanner(System.in);
        System.out.print("enter first number : " );
        int a = sc.nextInt();
        System.out.print("enter second number : " );
        int b = sc.nextInt();
        int product = a * b;
        System.out.println("the product of number is : " + product); 
        sc.close();
 
       

    }
}
