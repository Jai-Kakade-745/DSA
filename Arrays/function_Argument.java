// in java array , arrays always pass by reference , they dont pass by value
// but in java variable java always pass by  value means it passes the copy of the value of variable.
public class hello{
    public static void update(int marks[]){
        nonchangable = 10;
        for(int i = 0; i < marks.length ; i++){
            marks[i] += 1;
        }
        
    }
    public static void main(String[] args) {
        int nonchangable = 5;
        int marks[] = {1,2,3,4,5};
        update(nonchangable,marks);
        System.out.println(nonchangable);

        for(int i = 0; i < marks.length ; i++){
            System.out.println("Marks "+ marks[i]);
        }
       
        

    }
}
