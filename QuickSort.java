public class QuickSort implements SortingAlgorithm {
    @Override
    public void sort(int[] a) {
        quicksort(a, 0,a.length - 1 );
    }


    int partition(int a[], int low, int high) {
        int pivot = a[high];
        int i = (low - 1);

        for (int j = low; j < high; j++) {

            if (a[j] <= pivot) {
                i++;

                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }

        int temp = a[i+1];
        a[i+1] = a[high];
        a[high] = temp;

        return i + 1;
    }


    void quicksort(int arr[], int low, int high) {
        if (low < high) {

            int p = partition(arr, low, high);

            quicksort(arr, low, p - 1);
            quicksort(arr, p + 1, high);
        }
    }
}
