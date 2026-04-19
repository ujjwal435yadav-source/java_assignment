import java.util.*;
class Q59 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next(), rev="";
        for(int i=s.length()-1;i>=0;i--)
            rev+=s.charAt(i);
        System.out.println(s.equals(rev)?"Palindrome":"Not");
    }
}