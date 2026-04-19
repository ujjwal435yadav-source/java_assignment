import java.util.*;
class Q18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char c=sc.next().charAt(0);
        if(Character.isLetter(c))
            System.out.println("Alphabet");
        else if(Character.isDigit(c))
            System.out.println("Digit");
        else
            System.out.println("Special");
    }
}
