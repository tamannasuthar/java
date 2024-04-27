
import java.util.*;
public class forloops {
    
    public static void main(String[] args) {
//         for(int counter = 0; counter < 100; counter = counter + 1) {
// System.out.println("Hello World");
//         }        

// for(int counter = 0; counter < 11; counter++) {
//     System.out.println(counter+" ");
// }

// for(int i = 0; i < 11; i++) {
//     System.out.println(i);
// }

Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int sum = 0;
for(int i=0; i<=n; i++) {
    sum = sum + i;

    System.out.println(sum);
    sc.close();
}
    }
}
