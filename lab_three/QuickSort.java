import java.util.Arrays;/////https://otus.ru/nest/post/788/

public class QuickSort {

    public static void quickSort(int[] array, int low, int high) {
        long start = System.nanoTime();
        if (array.length == 0)
            return;//завершить выполнение, если длина массива равна 0

        if (low >= high)

            return;//завершить выполнение если уже нечего делить

        // выбрать опорный элемент
        int middle = low + (high - low) / 2;
        int opora = array[middle];

        // разделить на подмассивы, который больше и меньше опорного элемента
        int i = low, j = high;
        while (i <= j) {
            while (array[i] < opora) {
                i++;
            }

            while (array[j] > opora) {
                j--;
            }

            if (i <= j) {//меняем местами
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
            long finish = System.nanoTime();; //или System.nanoTime()
            long timeConsumedNano = finish - start;
            System.out.println(timeConsumedNano +" - наносекунд");
        }

        // вызов рекурсии для сортировки левой и правой части
        if (low < j)
            quickSort(array, low, j);

        if (high > i)
            quickSort(array, i, high);

    }

    public static void main(String[] args) {
        int[] x = { 1500,1500,1500};
        System.out.println("Было");
        System.out.println(Arrays.toString(x));

        int low = 0;
        int high = x.length - 1;

        quickSort(x, low, high);
        System.out.println("Стало");
        System.out.println(Arrays.toString(x));
    }

}
