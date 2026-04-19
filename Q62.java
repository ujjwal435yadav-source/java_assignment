import java.util.*;
class Q62 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String a[]=new String[n];
        for(int i=0;i<n;i++) a[i]=sc.next();

        Arrays.sort(a);
        for(String s:a) System.out.print(s+" ");
    }
}
