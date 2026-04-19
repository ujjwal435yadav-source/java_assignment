import java.util.*;
class Q44 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(), key;
        int a[]=new int[n];
        for(int i=0;i<n;i++) a[i]=sc.nextInt();
        key=sc.nextInt();

        int pos=-1;
        for(int i=0;i<n;i++){
            if(a[i]==key){ pos=i; break; }
        }
        System.out.println(pos);
    }
}