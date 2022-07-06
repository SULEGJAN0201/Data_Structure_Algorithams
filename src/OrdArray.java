public class OrdArray {
    public static void main(String[] args) {
          OrderArray O =new OrderArray(7);
          O.insert(5);
          O.insert(4);
          O.insert(3);
          O.insert(2);
          O.insert(8);
//          O.display();
        O.delete(20);
        O.display();
    }
}

class OrderArray {
    private long[] a;
    private int nElements;

    public OrderArray(int max) {
        this.a =new long[max];
        this.nElements = 0;
    }
    public int size() {
        return this.a.length;
    }
    public int find(long searchKey) {
        for(int i=0;i<nElements;i++){
            if(searchKey==a[i]){
                return i;
            }
        }
        return -1;
    }

    public void insert(long value) {
           if(this.a.length==this.nElements){
               System.out.println("Array is full");
           }
           else {
                for (int i=0;i<nElements;i++){
                    if (a[i]> value){
                        for (int j=nElements;j>i;j--){
                            a[j]=a[j-1];
                        }
                        a[i]=value;
                        nElements++;
                        return;
                    }
                }
                a[nElements]=value;
                nElements++;
           }
    }
    public boolean delete(long value) {
        for(int j=0;j<nElements;j++){
            if(value==a[j]){
                for(int k=j;k<nElements-1;k++) {
                    a[k] = a[k + 1];
                }
                nElements--;
                return true;
            }
        }
        System.out.println("value " + value +" is not found" );
        return false;
    }

    void display() {
       for(int i=0;i<nElements;i++){
           System.out.print(a[i] + " ");
       }
    }
}