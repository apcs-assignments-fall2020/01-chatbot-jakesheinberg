import java.util.Scanner;

public class MyMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Add some code here!
        System.out.println("Hi! What's your name?");
        String name = scan.next();
        System.out.println("What's your favorite snack?");
        int snack = scan.nextInt();

        System.out.println("Hello " + name + ", " + snack + "is really tasty!");
        scan.close();
    }
}
