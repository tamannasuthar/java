import java.util.*;

public class starpatterns2 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter side : ");
       int side = sc.nextInt();
    //    int m = 5;
for(int i = 1; i<=side; i++) {
   for(int j = 1; j<=side; j++) {
    if(i == 1 || j == 1 || i == side || j == side) {
        System.out.print(" * ");
    } else {
        System.out.print("   ");
    }
   }
   System.out.println();
   sc.close();
}
    }
    
}
