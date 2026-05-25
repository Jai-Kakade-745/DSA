// Function is a block of code which is reusable

public class hello{
  //           return_type funct_name(parameters){
      public static void printhello(){  //void does not have any return type
    System.out.println("Hello world");
  //           return statement;} 
  }
  public static void main(String args[]){
    printhello();
  }
}

//calculate sum of two num 
import java.util.*;
public class hello{
    public static int calculatesum(int a , int b){  // here a and b are parameters 
        return a+b;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int result = calculatesum(a, b);  // if we give input 2 and 3 then these will be arguments
        System.out.println(result);
    }
   
    }


// what happens in memory after creating function
// STACK
// ┌──────────────────────┐
// │   calculatesum()     │  ← Pushed ON TOP
// │   int a = 5 (copy)   │
// │   int b = 3 (copy)   │ // stack frame 2
// └──────────────────────┤
// │      main()          │
// │   int a = 5          │
// │   int b = 3          │ // stack frame 1
// └──────────────────────┘
// when calculatesum function is called a new stack frame is created values of a and b are copied into it both 
// frames exists at the same time in memory . after returning a+b calculatesum function ends and after main 
// function finishes stack ends
//   STACK
// ┌──────────────────────┐
// │       EMPTY          │  ← Program ends
// └──────────────────────┘


// Java always calls by value

public static void changeValue(int a) {
    a = 100;  // changing the COPY
}

public static void main(String[] args) {
    int a = 5;
    changeValue(a);
    System.out.println(a);  // still prints 5
}
