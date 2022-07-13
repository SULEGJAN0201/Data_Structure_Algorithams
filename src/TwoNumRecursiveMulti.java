public class TwoNumRecursiveMulti {
    public static void main(String[] args) {
        TwoNumRecursiveMulti m =new TwoNumRecursiveMulti();
        int result = m.multi(5,10);
        System.out.println(result);
    }
    public int multi(int m,int n){
        if (n==1){
            return m;
        }
       return m+multi(m,n-1);
    }
}
