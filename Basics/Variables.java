// variables - A variable is a named container that stores data in memory
int age = 20;

//Types of variables
// Local Variable -> Declared inside a method, Only accessible within that method, Must be initialized before use
void show() {
    int x = 10;  // local variable
    System.out.println(x);
}

// Instance Variable -> Declared inside a class, outside methods,Each object gets its own copy, Gets a default value automatically
class Student {
    String name;  // instance variable
    int age;      // instance variable
}

// Static Variable -> Declared with static keyword,Shared among all objects of the class,Only one copy exists in memory
class Student {
    static String school = "Gujarat University";  // static variable
}

// variable name can start with _ , $ 
// cannot start with number , case sensitive and keywords are not allowed
// convention - Always use camelCase

// In java always use final keyword instead of const keyword
final int MAX_MARKS = 100;
final double PI = 3.14159;
final String COLLEGE = "Gujarat University";
