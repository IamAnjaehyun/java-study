package a1;

import java.util.Scanner;

public class While06 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("x= ");
        int x=sc.nextInt();
        int i=1;
        while(i<=x){
            System.out.println("Jaehyun"+i);
            i++;
        }


        sc.close();
    }
}
