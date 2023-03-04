import java.util.*;

public class JavaEndOfFile {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner input = new Scanner(System.in);
        int counter = 1;
        while (input.hasNext()) {
            System.out.println(counter + " " + input.nextLine());
            counter++;
        }
    }
}