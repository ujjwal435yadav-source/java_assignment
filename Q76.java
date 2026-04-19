class Q76 {
    static int stack[]=new int[5];
    static int top=-1;

    static void push(int x){
        stack[++top]=x;
    }
    static int pop(){
        return stack[top--];
    }
    public static void main(String[] args) {
        push(10); push(20);
        System.out.println(pop());
    }
}