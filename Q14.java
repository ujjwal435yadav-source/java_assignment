import java.util.*;
class Q14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int y=sc.nextInt();
        if((y%4==0 && y%100!=0)||y%400==0)
            System.out.println("Leap");
        else
            System.out.println("Not Leap");
    }
}