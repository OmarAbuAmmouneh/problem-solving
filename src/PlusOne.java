
public class PlusOne {
    public static int[] plusOne(int[] digits) {
        int n = digits.length;
        int[] arr = new int[n + 1];
        boolean returnCopy = false;
        arr[0] = 1;
        digits[n - 1] = digits[n - 1] + 1;

        if (digits[n - 1] == 10) {
            int remnant = 0;
            for (int i = n - 1; i < n; i--) {
                int newNum = digits[i] + remnant;
                digits[i] = newNum;
                if (newNum == 10) {
                    digits[i] = 0;
                    remnant = 1;
                    if (i == 0) {
                        System.arraycopy(digits, 0,arr, 1, digits.length);
                        returnCopy = true;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        return returnCopy ? arr : digits;
    }


    public static void main (String args[]) {
        int[] arr = {8, 9, 9};
        int[] result = plusOne(arr);
        for (int n : result) {
            System.out.print(n);
            System.out.print(" -> ");
        }
    }
}
