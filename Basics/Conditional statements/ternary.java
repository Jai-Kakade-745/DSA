// Larger of Two -> Take two numbers. Use ternary to print the larger one.
import java.util.*;
public class hello{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int check = (a > b)? a:b;
    System.out.println(check);
  }
}
