package str_02_bubblesort;

import java.util.Scanner;

public class BubbleSort_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] data = new int[n];
        for (int i = 0; i < n; i++) {
            data[i] = sc.nextInt();
        }
        sc.close();

        bubbleSort(n, data);

        System.out.println("Sorted data :");
        for (int i = 0; i < n; i++) {
            System.out.println(data[i]);
        }
    }

    static void bubbleSort(int n, int[] data) {
        for (int i = n - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                swap(data[j], data[j + 1]);
            }
        }
    }
    //원본에는 아무 영향 줄 수 없음(값에 의한 호출때문)
    //이렇게하면 작동되지 않음
    static void swap(int a, int b) {
        int tem = a;
        a = b;
        b = tem;
    }
}