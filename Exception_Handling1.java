import java.util.Scanner;
 
public class Exception_Handling1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first value:");
        int a = sc.nextInt();
        System.out.println("Enter second value:");
        int b = sc.nextInt();
        try {
            System.out.println("The division of two values is: "+a/b);
        } catch (Exception e) {
            System.out.println("Cannot divide by zero");
        }
    }
}

