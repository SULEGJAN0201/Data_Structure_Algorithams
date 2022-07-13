public class FibonacciNum {
    public static void main(String[] args) {
        FibonacciNum t =new FibonacciNum();
        int value =t.fibonacci(6);
        System.out.println(value);
    }
    public int fibonacci(int n){
        if (n==0){
            return 0;
        }
        if (n==1){
            return 1;
        }
        return fibonacci(n-1) + fibonacci(n-2);

    }
}
