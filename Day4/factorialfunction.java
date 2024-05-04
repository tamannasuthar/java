import java.util.*;
public class factorialfunction {
    public static void printFactorial(int n){
        if(n < 0) {
            System.out.println("Invalid Number");
            return;
        }
    int factorial = 1;
        for(int i = n; i>=1; i--) {
       factorial = factorial * i;
    }
    System.out.println(factorial);
    return;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int n = sc.nextInt();

        System.out.print("The factorial of a number is : ");
        printFactorial(n);
        sc.close();
        
    }
    
}




