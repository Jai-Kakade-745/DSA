// find the factorial of number n
import java.util.*;
public class hello{
    public static int factorial(int n){
        int f = 1;
        for(int i = 1; i <= n ; i++){
            f *= i;
            
        }
        return f;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = factorial(n);
        System.out.println(result);
        
        
    }
}

// calculate the binomial coefficient
import java.util.*;
public class hello{
    public static int factorial(int n){
        int f = 1;
        for(int i = 1; i <= n ; i++){
            f *= i;
            }
        return f;
    }

    public static int binomial(int n, int r){
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_nmr= factorial(n-r);
        int binomial_coefficient= fact_n/(fact_r * fact_nmr);
        return binomial_coefficient;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        int result = binomial(n,r);
        System.out.println("the binomial coefficient is : "+result);
        
    }
}
