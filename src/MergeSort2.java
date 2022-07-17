public class MergeSort2 {

    public static void main(String[] args) {
        Merge merge = new Merge();

        int[] arr = {10, -12, 56, -147, 0, 21};
        merge.sort(arr);

        for (int el : arr) System.out.print(el + " ");

        System.out.println();

    }
}

class Merge {

        public void sort(int[] arr) {
            mergeSort(arr, 0, arr.length - 1);
        }

        private void mergeSort(int[] arr, int left, int right) {
            if (left < right) {
                int middle = (left + right) / 2;

                mergeSort(arr, left, middle);
                mergeSort(arr, middle + 1, right);

                merge(arr, left, middle, right);
            }
        }

        private void merge(int[] arr, int left, int middle, int right) {
            System.out.println(left +" "+ middle +" "+ right);
//            System.out.println(middle);
//            System.out.println(right);
//            System.out.println();

            int len1 = (middle - left) + 1;
            int len2 = right - middle;

            int[] L = new int[len1];
            int[] R = new int[len2];

            for (int i = 0; i < len1; i++) L[i] = arr[left + i];

            for (int i = 0; i < len2; i++) R[i] = arr[middle + 1 + i];

            int i = 0, j = 0;
            int k = left;

            while (i < len1 && j < len2)
                if (L[i] <= R[j]) arr[k++] = L[i++];
                else arr[k++] = R[j++];

            while (i < len1) arr[k++] = L[i++];

            while (j < len2) arr[k++] = R[j++];
        }
    }
