//https://www.hackerrank.com/challenges/java-arraylist/problem?isFullScreen=true&h_r=next-challenge&h_v=zen
import java.util.*;

public class JavaArrayList {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        ArrayList <ArrayList<Integer>> parent = new ArrayList<>();

        for(int i = 0; i < n; i++) {
            int lineSize = scan.nextInt();
            ArrayList<Integer> list = new ArrayList<>();
            for(int j = 0; j < lineSize; j++) {
                list.add(scan.nextInt());
            }
            parent.add(list);
        }
        int numberOfQueries = scan.nextInt();
        for(int i = 0; i < numberOfQueries; i++) {
            int itemOne = scan.nextInt();
            int itemTwo = scan.nextInt();
            try {
                ArrayList<Integer> list = parent.get(itemOne - 1);
                int item = list.get(itemTwo - 1);
                System.out.println(item);
            } catch (Exception e){
                System.out.println("ERROR!");
            }
        }
        scan.close();
    }
}