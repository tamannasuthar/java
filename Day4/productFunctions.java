import java.util.*;
public class productFunctions {
    
        public static int calculateProduct(int a, int b) {
            int product = a * b;
            return product;
        }
    
    
        public static void main(String args[]) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter first number : ");
            int a = sc.nextInt();
            System.out.print("Enter second number : ");
            int b = sc.nextInt();
    
            int product = calculateProduct(a, b);
            System.out.println("The product of the two numbers is : "+product);
    
            sc.close();

        
    
    }
    }
    

