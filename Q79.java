import java.util.*;
class Q79 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        Stack<Character> st=new Stack<>();

        for(char c:s.toCharArray()){
            if(c=='(') st.push(c);
            else{
                if(st.isEmpty()){ System.out.println("No"); return; }
                st.pop();
            }
        }
        System.out.println(st.isEmpty()?"Yes":"No");
    }
}