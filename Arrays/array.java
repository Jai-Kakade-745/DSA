// Array --> list of elements of same type stored in a contiguous memory location

// Creating an array -->
data_type array_name[] = new data_type[size];
int marks[] = new int[50]; // without declaration marks array stores null values.
int numbers[] = {1,2,3,4,5};
String fruits[] = {"apple","Mango","Banana"};

// Arrays --> Input , output and update 
import java.util.*;

public class hello {

    public static void main(String args[]) {
        int marks[] = new int[100];
        Scanner sc = new Scanner(System.in);
        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt(); 
        marks[2] = sc.nextInt();

        System.out.println("phy : "+ marks [0]);
        System.out.println("chem : "+ marks [1]); 
        System.out.println("math : " + marks[2]);

        System.out.println("Length of array :"+ marks.length);

        // updating array
        marks[0] += 1;
        System.out.println("updated marks of phy : "+marks[0]);
    }
}
