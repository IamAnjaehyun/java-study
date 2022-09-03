package exam;

import java.util.Scanner;

public class Exam7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("a: ");
        int a=sc.nextInt();

        System.out.print("b: ");
        int b=sc.nextInt();

        int min=a;
        if(min>b)   min=b;

        System.out.print("min: "+min);
        sc.close();
    }
}