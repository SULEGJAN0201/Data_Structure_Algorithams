public class NonDublicateArray {
    public static void main(String[] args) {
        NoDupArray x = new NoDupArray(5);
        x.insert(3);
        x.display();
        x.insert(4);
        x.display();
        x.insert(5);
        x.insert(8);
        x.insert(9);
        x.display();
        x.find(3);
        System.out.println( x.find(3));
        x.delete(4);
        x.display();
    }
}
class NoDupArray {
    private long[] a;
    private int nEliments;
    public NoDupArray(int max) {
         this.a =new long[max];
         this.nEliments =0;
    }
    public boolean find(long SearchKey) {
         for(int i=0;i<this.nEliments;i++){
             if(this.a[i]==SearchKey){
                 return true;
             }

         }
        return false;
    }


    public void insert(long value) {
        if (find(value)==false){
            if(this.nEliments<this.a.length){
                this.a[nEliments]=value;
                this.nEliments++;
                System.out.println("value inserted");
            }
            else {
                System.out.println("Array is full");
            }
        }
        else {
            System.out.println("value is already in the array");
        }

    }


    public boolean delete(long value) {
          if (find(value)){
              for (int i=0;i<this.nEliments;i++){
                  if(a[i]==value){
                      for(int j=i+1;j<this.nEliments;j++) {
                          a[j-1] = a[j];
                      }
                      this.nEliments--;
                      System.out.println("value deleted");
                      return true;
                  }

              }
          }
        System.out.println("value is not found");
         return false;
    }


    public void display() {
               for (int i=0;i<nEliments;i++){
                   System.out.print(a[i]+" ");
               }
        System.out.println();
    }
}
