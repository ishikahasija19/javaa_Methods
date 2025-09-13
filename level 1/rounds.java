
import java.util.Scanner;
public class rounds {
    public static int total_rounds(int a, int b, int c) {
        int perimeter = a + b + c;
        int rounds = 5000 / perimeter;
        return rounds;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the first side of the triangle");
        int a=sc.nextInt();
         System.out.println("Enter the second side of the triangle");
        int b=sc.nextInt();
         System.out.println("Enter the third side of the triangle");
        int c=sc.nextInt();
        int total_rounds_ran = total_rounds(a, b, c);
        System.out.println("The total rounds the athlete must run in a park with sides " + a + ", " + b + ", " + c + " meters to complete 5km is: " + total_rounds_ran);
    }
}
