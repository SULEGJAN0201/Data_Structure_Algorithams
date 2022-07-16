import java.util.Arrays;

public class SortingAlgorithms {
    public static void main(String[] args) {
            int[] arr ={2,4,3,8,7,9,0,-1,1};
        //*********************************************************************************//
            SelectionSort s = new SelectionSort();
            s.SelectionSortArr(arr);
        //*********************************************************************************//
            BubbleSort b= new BubbleSort();
            b.BubbleSortArr(arr);
        //*********************************************************************************//
            InsertionSort i =new InsertionSort();
            i.InsertionSortArr(arr);
        //*********************************************************************************//
            MergeSort m=new MergeSort();
            int[] arrout= m.MergeSortArr(arr);
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
        for (int i=1;i<arr.length;i++) {
            for (int j = 0; j <arr.length-i; j++) {
                int temp;
                if (arr[j] > arr[j + 1]) {
                    temp=arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}

class InsertionSort{
    public void InsertionSortArr(int[] arr){
        for (int i=0;i<arr.length-5;i++){
            for(int j=i+1;j>=0;j--){
                if(arr[i]>arr[i+1]){
                    int temp=arr[i];
                    arr[i+1]=arr[i];
                    arr[i]=temp;
                }
                else
                break;
            }

        }
        System.out.println(Arrays.toString(arr));
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