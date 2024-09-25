import java.util.HashMap;

public class TotalFruit {

    public static int totalFruit(int[] fruits) {
        //value -> count
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;
        for (int i = 0; i < fruits.length; i++) {
            map.put(fruits[i], map.getOrDefault(fruits[i], 0) + 1);
        }

        count += max(map);
        count += max(map);

        return count;
    }

    private static int max(HashMap<Integer, Integer> map) {
        int max = 0;
        int maxKey = 0;
        for (int key: map.keySet()) {
            if (map.get(key) > max) {
                max = map.get(key);
                maxKey = key;
            }
        }
        map.remove(maxKey);
        return max;
    }
    public static void main (String args[]) {
        int[] fruits = {3,3,3,1,2,1,1,2,3,3,4};

        int value = totalFruit(fruits);
        System.out.println(value);
    }
}
