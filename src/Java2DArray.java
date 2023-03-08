//https://www.hackerrank.com/challenges/java-2d-array/problem?isFullScreen=true&h_r=next-challenge&h_v=zen
import java.io.*;
import java.util.*;

public class Java2DArray {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<List<Integer>> arr = new ArrayList<>();

        for (int i = 0; i < 6; i++) {
            String[] arrRowTempItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

            List<Integer> arrRowItems = new ArrayList<>();

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowTempItems[j]);
                arrRowItems.add(arrItem);
            }

            arr.add(arrRowItems);
        }
        int largest = 0;
        for (int i = 0; i < arr.get(0).size() - 2; i++) {
            for(int j = 0; j < arr.get(0).size() - 2; j++) {
                int firstRow = arr.get(i).get(j) + arr.get(i).get(j + 1) + arr.get(i).get(j + 2);
                int secondRow = arr.get(i + 1).get(j + 1);
                int thirdRow = arr.get(i + 2).get(j) + arr.get(i + 2).get(j + 1) + arr.get(i + 2).get(j + 2);
                int totalRows = firstRow + secondRow + thirdRow;
                //The sum might be less than zero
                if (i == 0 && j == 0) {
                    largest = totalRows;
                }
                if (totalRows > largest) {
                    largest = totalRows;
                }
            }
        }
        System.out.print(largest);
        bufferedReader.close();
    }
}
