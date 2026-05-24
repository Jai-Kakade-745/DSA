
import java.util.*;

public class hello {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n > 0) {
            int last_dgit = n % 10;
            System.out.print(last_dgit);
            n = n/ 10;

        }
    }
}
