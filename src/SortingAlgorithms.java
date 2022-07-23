import java.util.Arrays;

public class SortingAlgorithms {
    public static void main(String[] args) {
            int[] arr ={9,8,7,6,4};

        System.out.print("Selection sort output : ");
            SelectionSort s = new SelectionSort();
            s.SelectionSortArr(arr);

        int[] arr2 ={9,8,7,6,4};
        System.out.print("Bubble Sorting outout : ");
            BubbleSort b= new BubbleSort();
            b.BubbleSortArr(arr2);
        int[] arr3 ={9,8,7,6,4,3};
        System.out.print("Insertion Sorting outout : ");
            InsertionSort i =new InsertionSort();
            i.InsertionSortArr(arr3);

        System.out.print("Merge Sorting outout : ");
        int[] arr4 ={9,8,7,6,4};
            MergeSort m=new MergeSort();
            int[] arrout= m.MergeSortArr(arr4);
            System.out.println(Arrays.toString(arrout));
    }
}

class SelectionSort{
     public void SelectionSortArr(int[] arr){
         for (int i=0;i< arr.length;i++){
             int temp=arr[i];
             int minIndex=i;
             for (int j=i;j< arr.length;j++){

                 if(temp>arr[j]){
                     temp=arr[j];
                     minIndex =j;
                 }
             }
             arr[minIndex]=arr[i];
             arr[i]=temp;
         }
//         for (int i=0;i< arr.length;i++){
//             System.out.print(arr[i]+" ");
//         }
         System.out.println(Arrays.toString(arr));
     }
}

class BubbleSort{
    public void BubbleSortArr(int[] arr){

        int loopcom=0;
        int count=0;
        for (int i=0;i<arr.length-1;i++) {
            for (int j = 0; j <arr.length-i-1; j++) {

                loopcom++;
                if (arr[j+1] < arr[j]) {
                    int temp;
                    temp=arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1]=temp;
                    count= count +1;

                }

            }

        }
        System.out.println(Arrays.toString(arr));
        System.out.println("No of time swap values in Bubble sort : " + count);
        System.out.println("No of times inner for loop run Bubble sort : "+loopcom);

    }
}

class InsertionSort{
    public void InsertionSortArr(int[] arr){
        int count=0;
        for (int i=0;i<arr.length-1;i++){
            for(int j=i+1;j>0;j--){

                if(arr[j-1]>arr[j]){
                    int temp=arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                    count++;
                }
                else {
                    break;
                }

            }

        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Swapping count is(insertion sort) : " + count);
    }
}
class MergeSort{
    public int[] MergeSortArr(int[] arr){
        if (arr.length==1){
            return arr;
        }
        int mid = arr.length/2;
         int[] left =MergeSortArr(Arrays.copyOfRange(arr,0,mid));
         int[] right=MergeSortArr(Arrays.copyOfRange(arr,mid,arr.length));

         return merge(left,right);
     }
     public int[] merge(int[] first,int[] second){
        int[] joinned = new int[first.length +second.length];
        int i=0,j=0,k=0;
        while (i< first.length && j< second.length){
            if (first[i]<second[j]){
                joinned[k]=first[i];
                k++;
                i++;
            }
            else {
              joinned[k]=second[j];
              k++;
              j++;
            }
        }
        while (i< first.length){
            joinned[k]=first[i];
            i++;
            k++;
        }
        while (j<second.length){
            joinned[k]=second[j];
            k++;
            j++;
            // joinned[k++=second[j++];
        }
         return joinned;
     }

}