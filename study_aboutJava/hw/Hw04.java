package hw;

import java.util.Scanner;

public class Hw04 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number(ex.1xx) : ");
        int num=sc.nextInt();
        int result=0;
        while(num!=0){
            result= result * 10 + num % 10;
            num /= 10;
        }
        System.out.println(result);
        sc.close();
    }
}
