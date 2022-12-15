package a1;

import java.util.Scanner;

public class While04 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("5개의 정수를 입력하시오>> ");
        int i=1, tot=0;
        while(i<=5){
            int x=sc.nextInt();
            tot=tot+x;
            i++;
        }

        System.out.println("합: "+tot);
        System.out.println("평균: "+tot/5.);
        sc.close();
    }
}