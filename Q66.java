class Q66 {
    static void change(int x){
        x=50;
    }
    static void changeArr(int a[]){
        a[0]=50;
    }
    public static void main(String[] args) {
        int x=10;
        change(x);
        System.out.println(x);

        int a[]={10};
        changeArr(a);
        System.out.println(a[0]);
    }
}