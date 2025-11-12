public class Q1_Minimum_Moves_to_Equal_Array_Elements_III{
    static int minMoves(int[] nums) {
        int max = Integer.MIN_VALUE;
        for (int num : nums) {
            max = Math.max(max, num);
        }
        int moves = 0;
        for (int num : nums) {
            moves += max - num;
        }
        return moves;
    }

    public static void main(String[] args) {
        int[] nums = {4, 4, 5};
        System.out.println(minMoves(nums));  
    }
}
