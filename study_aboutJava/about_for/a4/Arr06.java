package a4;

import java.util.Scanner;

public class Arr07 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] money=new int[]{50000,10000,5000,1000,100,10,1};
        System.out.print("Money>> ");
        int total=sc.nextInt();

        for(int i=0;i<money.length;i++){
            int cnt=total/money[i];
            System.out.println(money[i]+"won \t"+cnt+"need");
            total=total-cnt*money[i];
        }

    }
}
