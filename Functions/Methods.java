// methods are of two types 
// user defined methods and Inbuild methods

// Function Overloading
//multiple functions with the same name but different parameters
// if we create a calculator int calculator we create multiply function for each datatype like int,float,boolean
// but there should be a differentiating factor like1. type of paramentrs , 2. no. of parameters or which one to 
// call based on arguments we pass
public class hello{
    
        public static int add(int a,int b){
            return a+b;
        }
        public static int add(int a,int b,int c){
            return a+b+c;
        }
        public static double add(double a,double b){
            return a+b;
        }
        
        public static void main(String args[]){
            System.out.println(add(5.5,5.5));
        }
}
