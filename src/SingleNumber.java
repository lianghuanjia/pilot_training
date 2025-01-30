public class SingleNumber {
    public static int findSingleNumber(int[] nums) {
        int result = 0;
        for (int num : nums) {
            result ^= num; // XOR all elements
        }
        return result;
    }

}
