import java.util.*;
class Q56 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a=sc.next(), b=sc.next();
        String res=a;
        for(char c:b.toCharArray()) res+=c;
        System.out.println(res);
    }
}
