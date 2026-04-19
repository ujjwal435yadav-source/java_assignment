class Q78 {
    static class Node{
        int data;
        Node next;
        Node(int d){data=d;}
    }
    static Node top=null;

    static void push(int x){
        Node n=new Node(x);
        n.next=top;
        top=n;
    }
    static int pop(){
        int x=top.data;
        top=top.next;
        return x;
    }
    public static void main(String[] args) {
        push(5); push(10);
        System.out.println(pop());
    }
}
