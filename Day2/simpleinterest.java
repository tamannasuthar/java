import java.util.*;
public class simpleinterest {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.print("Enter principle(P) = ");
        int P = sc.nextInt();
        System.out.print("Enter R = ");
        int R = sc.nextInt();
        System.out.print("Enter N = ");
        int N = sc.nextInt();
        int simpleInterest =(P * R * N ) / 100;
        System.out.println("Simpleinterest = " + simpleInterest );
        sc.close();
    }
}
