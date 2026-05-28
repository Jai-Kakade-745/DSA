// Linear search checks each element one by one from start to end until the target is found or the array ends.

public class hello{
    public static int linearsearch(int numbers[],int key){
        for(int i = 0; i < numbers.length ; i++){
            if(numbers[i] == key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[]){
       int numbers[] = {1,2,3,4,5,6,7,8,9};
       // String menu[] ={"chole","puri","dahi"};
       int key = 8;
       int index = linearsearch(numbers, key);
       if(index == -1){
        System.out.println("Not found");
       }else{
        System.out.println("Key found ar index: "+index);
       }
    }
}
