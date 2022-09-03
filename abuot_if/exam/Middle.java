package exam;

import java.util.Scanner;

public class Middle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("a: ");
        int a=sc.nextInt();

        System.out.print("b: ");
        int b=sc.nextInt();

        System.out.print("c: ");
        int c=sc.nextInt();

        if(a>b){
            int temp=a;
            a=b;
            b=temp;
        }
        if(b>c){
            int temp=b;
            b=c;
            c=temp;
        }
        if(a>b){
            int temp=a;
            a=b;
            b=temp;
        }
        System.out.println("중간: "+b);
    }
}
