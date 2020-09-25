public class WrongApproach {
    // Given array [2,5,1,2,3,5,1,2,4] find first recurring number
    // Given array [2,1,1,2,3,5,1,2,4] find first recurring number
    // Given array [2,3,4,5] Should return undefined
    // Naive approach is to try two nested for loops

    public static int recurringChar(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            /* This for loop needs to start at i + 1 or else it will compare
            * the current number to itself and return true for the duplicate.
            * We do not have to worry about comparing previous i and j values
            * because that happens in the initial iterations. */
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]){
                    return arr[i];
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] x = {2,5,1,2,3,5,1,2,4};
        System.out.println(recurringChar(x));
    }
}
/* Inefficient solution it is an O(n^2) solution even though it works */
