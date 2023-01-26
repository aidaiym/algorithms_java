
import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        long start = System.nanoTime();
        int [] mas = {1500,1500,1500};

        boolean isSorted = false;
        int buf;
         while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < mas.length-1; i++) {
                if(mas[i] > mas[i+1]){
                    isSorted = false;

                    buf = mas[i];
                    mas[i] = mas[i+1];
                    mas[i+1] = buf;
                }
            }


        }
        long finish = System.nanoTime();; //или System.nanoTime()
        long timeConsumedNano = finish - start;
        System.out.println(timeConsumedNano +" - наносекунд");
        System.out.println(Arrays.toString(mas));
    }
}






