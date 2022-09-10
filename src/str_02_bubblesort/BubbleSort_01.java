package str_02_bubblesort;

import java.util.Scanner;

public class BubbleSort_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] data = new int [n];
        for (int i = 0; i<n ;i++){
            data[i] = sc.nextInt();
        }
        sc.close();

        for(int i=n-1; i>0; i++){
            for(int j=0; j<i; j++){
                if(data[j]>data[j+1]){
                    int tem = data[j];
                    data[j] = data[j+1];
                    data[j+1] = tem;
                }
            }
        }
        System.out.println("Sorted data :");
        for(int i = 0; i<n; i++){
            System.out.println(data[i]);
        }

    }


}
