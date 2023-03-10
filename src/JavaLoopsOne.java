//https://www.hackerrank.com/challenges/java-loops-i/problem?isFullScreen=true
import java.io.*;


public class JavaLoopsOne {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());
        bufferedReader.close();
        for (int i = 1; i <= 10; i++) {
            System.out.println(
                    N + " x " + i + " = " + i * N);
        }
    }
}
