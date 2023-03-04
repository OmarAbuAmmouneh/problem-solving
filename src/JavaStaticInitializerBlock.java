// https://www.hackerrank.com/challenges/java-static-initializer-block/problem?isFullScreen=true&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen
import java.util.*;

public class JavaStaticInitializerBlock {

    //Write your code
    // whatever code is needed for initialization goes here
    public static boolean flag = true;
    public static Scanner input = new Scanner(System.in);
    public static int B = input.nextInt();
    public static int H = input.nextInt();

    static {
        if (B <= 0 || H <= 0) {
            flag = false;
            System.out.print("java.lang.Exception: Breadth and height must be positive");

        }
    }


    public static void main(String[] args) {
        if (flag) {
            int area = B * H;
            System.out.print(area);
        }

    }//end of main

}//end of class


