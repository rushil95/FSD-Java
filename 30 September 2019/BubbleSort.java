class BubbleSort {

    void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    void sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 93, 88, 77, 66, 55 };
        BubbleSort bSort = new BubbleSort();
        bSort.sort(arr);

        for (int value : arr) {
            System.out.println(value);
        }
    }
}