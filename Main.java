public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
    public static void insertionSort(int array[]) {
        int n = array.length;
        for (int j = 1; j < n; j++) {
            int key = array[j];
            int i = j - 1;
            while ((i > -1) && (array[i] > key)) {
                array[i + 1] = array[i];
                i--;
            }
            array[i + 1] = key;
        }
    }
    public static void sort(int[] arr){
        insertionSort(arr);
    }
}