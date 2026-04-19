import java.util.Scanner;
public class Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();
        double area = Math.PI * r * r;
        double circum = 2 * Math.PI * r;
        System.out.println("Area=" + area);
        System.out.println("Circumference=" + circum);
        sc.close();
    }
}