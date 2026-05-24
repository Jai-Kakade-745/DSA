//while loop
while(condition true){
  System.out.println("hello world");
}
// this hello world will run until the condition is true means it will run infinite times

//print hello world 10 times
int counter = 1;
while(counter <= 10){
  System.out.println("Hello worldx");
  counter++;
}

//print numbers from 1 to n
int counter = 1;
while(counter <= n){
  System.out.println(counter);
  counter++; // if we dont update counter it will run infinitely
}

//Sum of first n natural numbers
//Alternatively, you can skip the loop entirely using the sum formula n*(n+1)/2:
import java.util.*;
public class hello{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number");
        int n = sc.nextInt();
        int sum = 0;
        for(int i = 1; i <= n; i++){
            sum = sum+i;
            
        }
        System.out.println(sum);
    }
} 

// using while loop
int n = sc.nextInt();
int i = 1;
int sum = 0;
while(i < n){
  sum += i;
}
System.out.print(sum);
