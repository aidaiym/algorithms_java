import java.util.Arrays;

public class InsertionSort ////
{
    public static void main(String[] args) {
        System.out.println("Сортировка массива");
        int[] array = { 1500,1500,1500};
        insertionSort(array);
        System.out.println(Arrays.toString(array));
    }

    private static void insertionSort(int[] input) {
        long start = System.nanoTime();
        for (int i = 1; i < input.length; i++) {
            // временная переменная, которая хранит значение
            int newElement = input[i];
            // цикл начался не с нуля, а с единицы - location предыдущее МЕСТО от элемента массива
            int location = i - 1;
            System.out.println("i или круг = " + i);
            System.out.println(newElement);
            System.out.println(input[location]);
            System.out.println("**");

            // пока значение от location больше значения элемента проверки
            while (location >= 0 && input[location] > newElement) {
                System.out.println("Находимся в цикл while при i = " + i);
                System.out.println(newElement);
                System.out.println(input[location]);
                System.out.println("++");
                // присвоить значению на котором был элемент проверки значение предыдущего
                input[location + 1] = input[location];
                location = location - 1;  // Декремент  location
            }


            input[location + 1] = newElement;  // значению location+1 передаём значение из памяти
        }
        long finish = System.nanoTime();; //или System.nanoTime()
        long timeConsumedNano = finish - start;
        System.out.println(timeConsumedNano +" - наносекунд");
    }
}

////вставка