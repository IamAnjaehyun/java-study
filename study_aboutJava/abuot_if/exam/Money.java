package exam;

import java.util.Scanner;

public class Money {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //System.out.print("금액 입력: ");
        //int won=sc.nextInt();
        
        int won=76342;
        //5만원권
        int x=won/50000;// 1의자리
        System.out.println("5만원: "+x+"개");
        
        //1만원권
        won=won-x*50000;
        x=won/10000;
        System.out.println("1만원: "+x+"개");
        
        //5천원권
        won=won-x*10000;
        x=won/5000;
        System.out.println("5천원권: "+x+"개");

        //천원권
        won=won-x*5000;
        x=won/1000;
        System.out.println("천원권: "+x+"개");

         //오백원권
         won=won-x*1000;
         x=won/500;
         System.out.println("오백원권: "+x+"개");
        
         //백원권
         won=won-x*500;
         x=won/100;
         System.out.println("백원권: "+x+"개");
        sc.close();
    }
}
