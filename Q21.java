import java.util.*;
class Q21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt(), flag=0;
        if(n<=1) flag=1;
        for(int i=2;i<=n/2;i++){
            if(n%i==0){ flag=1; break; }
        }
        System.out.println(flag==0?"Prime":"Not Prime");
    }
}