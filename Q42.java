import java.util.*;
class Q42 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt(), n2=sc.nextInt();
        int a[]=new int[n1+n2];
        for(int i=0;i<n1;i++) a[i]=sc.nextInt();
        for(int i=0;i<n2;i++) a[n1+i]=sc.nextInt();

        for(int i:a) System.out.print(i+" ");
    }
}
