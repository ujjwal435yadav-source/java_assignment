import java.util.*;
class Q60 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int v=0,c=0,d=0,sp=0;

        for(char ch:s.toCharArray()){
            if(Character.isDigit(ch)) d++;
            else if(ch==' ') sp++;
            else if("aeiouAEIOU".indexOf(ch)!=-1) v++;
            else if(Character.isLetter(ch)) c++;
        }
        System.out.println(v+" "+c+" "+d+" "+sp);
    }
}