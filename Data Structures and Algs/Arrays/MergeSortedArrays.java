public class MergeSortedArrays {
    public static void mergeSorted(int[] a, int[] b, int[] c) {

        int i = 0;
        int j = 0;
        int k = 0;

        // Traverse both array
        while (i < a.length && j < b.length) {
            // Check if current element of first
            // array is smaller than current element
            // of second array. If yes, store first
            // array element and increment first array
            // index. Otherwise do same with second array
            if (a[i] < b[j]) {
                c[k] = a[i];
                i++;
                k++;
            } else {
                c[k] = b[j];
                k++;
                j++;
            }
        }
        // Store remaining elements of first array
        while (i < a.length) {
            c[k] = a[i];
            k++;
            i++;
        }
        // Store remaining elements of second array
        while (j < b.length) {
            c[k] = b[j];
            k++;
            j++;
        }

        for (int x : c) {
            System.out.println(x);
        }
    }

    public static void main(String[] args) {
        int[] a = { 1, 4, 6, 7, 8 };
        int[] b = { 2, 3, 45, 67 };
        int[] c = new int[a.length + b.length];
        mergeSorted(a, b, c);
    }
}
