import java.util.Arrays;

public class AnotherOptimal {
    public static void main(String[] args) {


        int [] nums={11,2,7,15};
        int target=9;
        int [] ind=new int[2];
        //sort method here nlogn
        for (int i = 0, j=1; i < nums.length; i++,j++) {   // O(n)
            if (nums[i]>target){continue;}                 // constant
            if (target-nums[i]==nums[j]){                 // constant
                //9      2         7
                ind[0]=i; ind[1]=j;
                System.out.println(Arrays.toString(ind));//[1, 2]

            }    // overall complexity will be nlong+ n
        }

    }


}
