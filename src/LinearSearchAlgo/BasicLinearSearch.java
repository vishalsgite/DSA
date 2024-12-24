package LinearSearchAlgo;

public class BasicLinearSearch {
        public static int linearSearch(int[] arr, int target) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == target) {
                    return i; // Found target, return index
                }
            }
            return -1; // Target not found
        }

        public static void main(String[] args) {
            int[] arr = {1, 2, 3, 4, 5};
            int target = 3;
            int result = linearSearch(arr, target);
            System.out.println(result); // Output: 2
        }
    }

