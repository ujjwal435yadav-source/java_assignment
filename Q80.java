import java.util.*;
class Q80 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(), k=sc.nextInt();
        System.out.println((n & (1<<k))!=0);
    }
}
