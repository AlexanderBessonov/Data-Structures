public class Test {
    public static void main(String[] args) {
        long startTime;
        long endTime;

        startTime = System.currentTimeMillis();
        System.out.println("Time before:"+ startTime);
        numbers();
        endTime = System.currentTimeMillis();
        System.out.println("End time: "+endTime);
        System.out.println("Total time: "+ (endTime-startTime) +" miliseconds");

    }

    public static void numbers() {
        int[] num = {1, 2, 3, 4, 6};
        int[] num2 = {3, 4, 3, 1, 6};

        for (int i = 0; i < num.length; i++) {

            for (int j = 0; j < num2.length; j++) {
                if (num[i] + num2[j] == 6) {
                    System.out.println(num[i] + " , " + num2[j]);
                }
            }
        }
    }
}