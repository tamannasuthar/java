import java.util.*;

public class conditions {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number : ");
    //    int age = sc.nextInt();

    //    if(age > 18) {
    //     System.out.println("Adult");
    //    } else {
    //     System.out.println("Not Adult");
    //    }

// int x = sc.nextInt();

// if(x % 2 == 0) {
//     System.out.println("Even");
// } else {
//     System.out.println("Odd");
// }

int a = sc.nextInt();
System.out.print("Enter second number : ");
int b = sc.nextInt();

if(a == b) {
    System.out.println("Equal");
} else {
    if(a > b) {
        System.out.println("a is greater ");
    } else {
        System.out.println("a is lesser ");
    }
}
    }
}
