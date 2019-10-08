import java.util.Locale;
import java.util.Random;

public class Main {
    final static int N = 90;
    static int[][] arr = new int[N][N];

    public static void main(String[] args) {
        final int N = 20;
        int[] arr = new int[N];
    }
    task1();
    changing();
}
public static void task1(){
    final int N = 1,M = 100;
    int[][] arr1 = new int[N][M];
    for (int r = 0; r < arr.length; r++) {
        for (int c = 0; c < arr[r].length; c++) {
            arr[r][c] = (int) (Math.random() * 10);
        }
    }
    printArray(arr1);
}

    private static void changing() {
        final int N = 6;
        int[][] arr = new int[N][N];
        for (int r = 0; r < arr.length; r++) {
            for (int c = 0; c < arr[r].length; c++) {
                arr[r][c] = (int) (Math.random() * 10);
            }
        }
        printArray(arr);

        for (int r = 0; r < arr.length; r++) {
            for (int c = 0; c < arr[r].length; c++) {
                if (r + c == N - 1) {
                    arr[r][c] = 100;
                }
            }
        }
        printArray(arr);


    }



    public static void printArray(int[][] array) {
        Locale.setDefault(Locale.US);
        for (int r = 0; r < array.length; r++) {
            for (int c = 0; c < array[r].length; c++)
                System.out.print(String.format("%" + n + "d", array[r][c]));
            System.out.println();
        }
        System.out.println();
    }

