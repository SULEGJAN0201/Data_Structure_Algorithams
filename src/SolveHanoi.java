public class SolveHanoi {
    public static void main(String[] args) {
             SolveHanoi s =new SolveHanoi();
             s.SolveHanoi(3,'A','B','C');
    }


    public void SolveHanoi(int n,char A,char B,char C){
      if (n==0){
          return;
      }
      SolveHanoi(n-1,A,C,B);
        System.out.println("Move plate " + n +" from " + A +" to " + C);
        SolveHanoi(n-1,B,A,C);
    }
}
