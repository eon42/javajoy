package net.javajoy.jps.homework.w1;

public class HomeWorkArrays
{
    public static final int MAX_VALUE = 100;
    public static final int BATCH_NUMBER = 10;

    public static void main(String[] args)
    {
        int[] intermediateSum;
        int sum;

        intermediateSum = sum();
        sum = intermediateSum[MAX_VALUE/BATCH_NUMBER - 1];

        System.out.println(sum);
        System.out.println();

        printArray(intermediateSum);
        System.out.println();

        intermediateSum = sortArray(intermediateSum);
        printArray(intermediateSum);
    }

    /**
     * Count intermediate sums
     *
     * @return int[] array of intermediate sums
     */
    private static int[] sum()
    {
        int[] intermediateSum = new int[MAX_VALUE/BATCH_NUMBER];

        for (int i=BATCH_NUMBER; i<=MAX_VALUE; i += BATCH_NUMBER) {
            intermediateSum[i/BATCH_NUMBER - 1] = (1 + i) * i / 2;
        }
        return intermediateSum;
    }

    /**
     * Sort array in descending order
     *
     * @param intermediateSum
     * @return int[]
     */
    private static int[] sortArray(int[] intermediateSum)
    {
        int temp;

        for(int i=0; i<intermediateSum.length; i++){
            for(int j=i; j<intermediateSum.length; j++) {
                if (intermediateSum[i]<intermediateSum[j]){
                    temp = intermediateSum[i];
                    intermediateSum[i] = intermediateSum[j];
                    intermediateSum[j] = temp;
                }
            }
        }
        return intermediateSum;
    }

    /**
     * Print array
     *
     * @param intermediateSum
     */
    private static void printArray(int[] intermediateSum)
    {
        for(int i=0; i<intermediateSum.length; i++){
            System.out.println(intermediateSum[i]);
        }
    }
}
