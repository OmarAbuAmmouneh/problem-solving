// https://www.hackerrank.com/challenges/java-loops/problem?isFullScreen=true
import java.util.*;


class JavaLoopsTwo{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int previousValue = 0;
            for (int j = 0; j < n; j++) {
                if (j == 0) {
                    previousValue = a + b;
                    System.out.print((a + b) + " ");
                }
                else {
                    previousValue += b * Math.pow(2, j);
                    System.out.print(previousValue + " ");
                }
            }
            System.out.print("\n");
        }
        in.close();
    }
}