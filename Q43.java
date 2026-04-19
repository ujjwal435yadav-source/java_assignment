import java.util.*;
class Q43 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(), k=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++) a[i]=sc.nextInt();

        for(int r=0;r<k;r++){
            int temp=a[0];
            for(int i=0;i<n-1;i++) a[i]=a[i+1];
            a[n-1]=temp;
        }

        for(int i:a) System.out.print(i+" ");
    }
}