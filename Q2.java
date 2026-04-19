import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        if (sc.hasNextInt()) {
            int num = sc.nextInt();
            System.out.println("Number: " + num);
        } else {
            System.out.println("Invalid input! Enter integer.");
        }

        sc.close();
    }
}