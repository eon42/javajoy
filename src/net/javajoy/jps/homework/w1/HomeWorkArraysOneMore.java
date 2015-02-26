package net.javajoy.jps.homework.w1;

/**
 * Создайте массив из всех нечётных чисел от 3 до 35
 * и выведите элементы массива на экран сначала в строку,
 * отделяя один элемент от другого пробелом, а затем в столбик
 * (отделяя один элемент от другого началом новой строки).
 * Перед созданием массива подумайте, какого он будет размера.
 */
//AN: Хорошо, задача решена. Немного убрал дублирование кода.
//AN: Наталья, хочу ометить хороший английский!
public class HomeWorkArraysOneMore {

    public static final int LOWER_BOUND = 3;
    public static final int UPPER_BOUND = 35;

    public static void main(String[] args) {
        int[] arrayOdd = createArray();

        printArray(arrayOdd, " ");
        printArray(arrayOdd, "\n");
    }

    /**
     * Print array in one column, divided by space
     *
     * @param array - array to be printed
     * @param elementSeparator - separator to be used after each array element
     */
    private static void printArray(int[] array, String elementSeparator) {
        for (int i : array) {
            System.out.print(i + elementSeparator);
        }
        System.out.println();
    }

    /**
     * Create and fill the array by odds digit
     *
     * @return int[] array
     */
    private static int[] createArray() {
        int[] arrayOdd = new int[(UPPER_BOUND - LOWER_BOUND) / 2 + 1];
        int j = 0;
        for (int i = LOWER_BOUND; i <= UPPER_BOUND; i++) {
            if (i % 2 == 1) {
                arrayOdd[j++] = i;
            }
        }
        return arrayOdd;
    }
}
