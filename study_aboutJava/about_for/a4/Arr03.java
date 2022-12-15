package a4;

import java.util.Scanner;

public class Arr03 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("5 number>> ");
        int[] a=new int[5];
        int sum=0;
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
            sum=sum+i;
        }
        System.out.println(sum/a.length);
    }
}
