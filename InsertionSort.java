public class InsertionSort implements SortingAlgorithm {
    @Override
    public void sort(int[] a) {
        for(int i = 1; i < a.length; i++) {
            int current = a[i];
            int comp = i - 1;
            System.out.println(i);
            while(comp >= 0 && current < a[comp]) {
                int index = i;
                int temp = a[comp];
                a[comp] = a[comp + 1];
                a[comp + 1] = temp;
                comp--;
            }
        }
    }
}
