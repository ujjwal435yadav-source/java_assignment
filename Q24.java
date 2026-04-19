import java.util.*;
class Q24 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(), sum=0, temp=n;
        while(n>0){
            int d=n%10;
            sum+=d*d*d;
            n/=10;
        }
        System.out.println(sum==temp?"Armstrong":"Not");
    }
}