import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    // Selection sort
//    public static void selectionSort(int[] arr) {
//        for (int i = 0; i<arr.length; i++) {
//            int min = i;
//            for (int j = i+1; j<arr.length; j++) {
//                if (arr[j] < arr[min]) {
//                    min = j;
//                }
//            }
//            int temp = arr[min];
//            arr[min] = arr[i];
//            arr[i] = temp;
//        }
//    }
    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();

        int[] arr = new int[10000];

        Random random = new Random();
        for (int i = 0; i<arr.length; i++) {
            arr[i] = random.nextInt(10000);
        }
        Arrays.sort(arr);
//        selectionSort(arr);
        stopWatch.stop();
        System.out.println("Thời gian thực thi của thuật toán Selection Sort: " + stopWatch.getElapsedTime() + " milliseconds");

    }
}
