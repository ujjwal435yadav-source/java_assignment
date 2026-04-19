import java.util.*;
class Q63 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine(), res="";
        for(char c:s.toCharArray()){
            if(Character.isLetter(c)) res+=c;
        }
        System.out.println(res);
    }
}
