public class hello{
    public static int largest(int numbers[]){
        int smallest = Integer.MIN_VALUE;    // Integer.MIN_VALUE for smallest
        for(int i = 0; i < numbers.length; i++){
            if(smallest < numbers[i]){
                smallest = numbers[i];
            }
            
        }
        return largest;
    }
    public static void main(String[] args) {
        int numbers[] = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(largest(numbers));
    }
}
