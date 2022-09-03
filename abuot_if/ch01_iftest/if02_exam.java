package ch01_iftest;

import java.util.Scanner;

public class if02_exam {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("a= ");
        int a=sc.nextInt();
        
        System.out.print("b= ");
        int b=sc.nextInt();

        if(a>b){
            System.out.println("max value: "+a);
        }
        else{
            System.out.println("max value: "+b);
        }
    }
}
