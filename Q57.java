import java.util.*;
class Q57 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a=sc.next(), b=sc.next();

        if(a.length()!=b.length()){
            System.out.println("Not Equal");
            return;
        }

        boolean same=true;
        for(int i=0;i<a.length();i++){
            if(a.charAt(i)!=b.charAt(i)) same=false;
        }
        System.out.println(same?"Equal":"Not Equal");
    }
}