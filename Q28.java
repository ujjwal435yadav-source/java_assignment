import java.util.*;
class Q28 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt(), b=sc.nextInt(), x=a, y=b;
        while(b!=0){
            int t=b;
            b=a%b;
            a=t;
        }
        int gcd=a;
        int lcm=(x*y)/gcd;
        System.out.println(gcd+" "+lcm);
    }
}
