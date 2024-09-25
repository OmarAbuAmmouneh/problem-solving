import java.util.HashSet;


public class RemoveDuplicates {
    public static int[] removeDuplicates(int[] nums) {
        int i = 0;
        for (int n : nums) {
            if (i < 2 || n != nums[i - 2]) {
                nums[i++] = n;
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] numbers = {0,0,1,1,1,2,2,3,3,4};
        var newNumbers = removeDuplicates(numbers);
        for (int element : newNumbers){
            System.out.print(element + " ");
        }
    }
}