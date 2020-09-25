import java.util.HashSet;

public class Main {
    // Given array [2,5,1,2,3,5,1,2,4] find first recurring number
    // Given array [2,1,1,2,3,5,1,2,4] find first recurring number
    // Given array [2,3,4,5] Should return undefined

    // Add elements to Hashset until a duplicate element is found
    public Integer firstRepeating(int[] arr){
        HashSet<Integer> h = new HashSet<>();
        for (int x : arr){
            if (h.contains(x)){
                System.out.println(h);
                return x;
            } else {
                h.add(x);
            }
        }
        return null;
    } // O(n) time complexity

    public static void main(String[] args) {
        int[] arr = {2,5,1,2,3,5,1,2,4};
        var x = new Main();
        System.out.println(x.firstRepeating(arr));
    }
}
