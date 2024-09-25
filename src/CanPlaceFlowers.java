class CanPlaceFlowers {
    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        // We iterate over the array
        // If we can plot a flower, we do, and decrement n
        // if n = 0; return true
        int m = flowerbed.length;
        if (n == 0) return true;
        if (m == 1 && flowerbed[0] == 0 && n == 1) return true;
        if (m == 1 && flowerbed[0] == 1 && n >= 1) return false;
        for (int i  = 0; i < m; i++) {
            if (i == 0 && m > 1) {
                if (n == 0) return true;
                //First element
                if (flowerbed[1] == 0 && flowerbed[0] == 0) {
                    flowerbed[0] = 1;
                    n--;
                }
            }
            //Last element
            else if (i == m - 1 && m > 1) {
                if ( flowerbed[m - 2] == 0 && flowerbed[m - 1] == 0) {
                    flowerbed[m - 1] = 1;
                    n--;
                }
            }
            //In-between
            else if (flowerbed[i - 1] == 0 && flowerbed[i + 1] == 0 && flowerbed[i] == 0)                 {
                flowerbed[i] = 1;
                n--;
            }

        }
        return n == 0;
    }

    public static void main(String[] args) {
        int[] arr = {0,0,1,0,0};
        boolean value = canPlaceFlowers(arr, 1);
    }
}