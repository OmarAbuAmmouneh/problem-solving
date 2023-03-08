//https://www.hackerrank.com/challenges/java-biginteger/problem?isFullScreen=true
import java.util.*;
import java.math.*;

public class JavaBigIntegers {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        BigInteger sum;
        BigInteger multiply;
        Scanner input = new Scanner(System.in);
        BigInteger a = new BigInteger(String.valueOf(input.nextBigInteger()));
        BigInteger b = new BigInteger(String.valueOf(input.nextBigInteger()));
        input.close();
        sum = a.add(b);
        multiply = a.multiply(b);
        System.out.println(sum);
        System.out.println(multiply);
    }
}
