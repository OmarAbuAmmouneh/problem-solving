//https://www.hackerrank.com/challenges/java-primality-test/problem?isFullScreen=true&h_r=next-challenge&h_v=zen
import java.io.*;
import java.math.*;


public class JavaPrimalityTest {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String n = bufferedReader.readLine();

        bufferedReader.close();
        BigInteger number = new BigInteger(n);
        if(number.isProbablePrime(1)) {
            System.out.print("prime");
        } else {
            System.out.print("not prime");
        }
    }
}
