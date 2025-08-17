public class closest {

    public static int findClosest(int[] arr, int target) {
        int closest = arr[0];
        int minDiff = Math.abs(arr[0] - target);

        for (int num : arr) {
            int currDiff = Math.abs(num - target);
            if (currDiff < minDiff || (currDiff == minDiff && num > closest)) {
                closest = num;
                minDiff = currDiff;
            }
        }
        return closest;
    }

    public static void main(String[] args) {
        int[] arr = {2, 5, 6, 7, 8, 8, 9};
        int target = 7;
        System.out.println("Closest number: " + findClosest(arr, target));
    }
}