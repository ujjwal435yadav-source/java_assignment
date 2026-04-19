class Q77 {
    static int q[]=new int[5];
    static int front=0,rear=0;

    static void enqueue(int x){
        q[rear++]=x;
    }
    static int dequeue(){
        return q[front++];
    }
    public static void main(String[] args) {
        enqueue(10); enqueue(20);
        System.out.println(dequeue());
    }
}