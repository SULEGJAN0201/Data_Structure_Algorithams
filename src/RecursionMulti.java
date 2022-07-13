public class RecursionMulti {
    public static void main(String[] args) {
        RecursionMulti m=new RecursionMulti();
        int value =m.multi(5);
        System.out.println(value);
    }
    public int multi(int num){
        if (num==1){
            return 1;
        }
       return num*multi(num-1);
    }
}
