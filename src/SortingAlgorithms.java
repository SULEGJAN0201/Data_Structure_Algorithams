import java.util.Arrays;

public class SortingAlgorithms {
    public static void main(String[] args) {
            SelectionSort s = new SelectionSort();
            int[] arr ={2,4,3,8,7,9,0,-1,1};
            s.SelectionSortArr(arr);
            BubbleSort b= new BubbleSort();
            b.BubbleSortArr(arr);
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