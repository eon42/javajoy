package homework01;

/**
 * Создайте массив из всех нечётных чисел от 3 до 35
 * и выведите элементы массива на экран сначала в строку,
 * отделяя один элемент от другого пробелом, а затем в столбик
 * (отделяя один элемент от другого началом новой строки).
 * Перед созданием массива подумайте, какого он будет размера.
 */

public class HomeWorkArraysOneMore {

    public static final int LOWER_BOUND = 3;
    public static final int UPPER_BOUND = 35;

    public static void main(String[] args) {
        int[] arrayOdd;

        arrayOdd = createArray();
        printArrayRow(arrayOdd);
        printArrayColumn(arrayOdd);
    }

    /**
     * Print array in one column, divided by space
     *
     * @param arrayOdd
     */
    private static void printArrayColumn(int[] arrayOdd) {
        for(int i : arrayOdd){
            System.out.print(i + "\n");
        }
    }

    /**
     * Print array in row
     *
     * @param arrayOdd
     */
    private static void printArrayRow(int[] arrayOdd) {
        for(int i : arrayOdd){
            System.out.print(i + " ");
        }
        System.out.println();
    }

    /**
     * Create and fill the array by odds digit
     *
     * @return int[] array
     */
    private static int[] createArray() {
        int[] arrayOdd = new int[(UPPER_BOUND-LOWER_BOUND)/2 + 1];
        int j = 0;
            for(int i=LOWER_BOUND; i<=UPPER_BOUND; i++){
                if(i%2==1){
                    arrayOdd[j++] = i;
                }
            }
        return arrayOdd;
    }
}
