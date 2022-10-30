import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class HW {
    public static void main(String[] args) {

        int[] buildings={3,5,4,4,3,1,3,2};
        sunsetViews(buildings,"WesT").forEach(System.out::println);
    }
    public static ArrayList<Integer> sunsetViews(int[] buildings, String direction){
        //write your code here
       Stack <Integer> stack = new Stack<>();//stack to hold building indicies that can see sunset
        //this part is for East by default
        int i = 0;
        int step = 1;
        if (direction.equalsIgnoreCase("west")){
            i=buildings.length-1;
            step=-1;
        }
        while (i>= 0 && i< buildings.length){

            while (!stack.isEmpty() && buildings[i]>=buildings[stack.peek()]){
                stack.pop();
            }
            stack.push(i);
            i+=step;
        }
        //now i have a stack with the building indicies that can see sunset
          if (direction.equalsIgnoreCase("west")) Collections.reverse(stack);
        return new ArrayList<Integer>(stack);

    }
}
