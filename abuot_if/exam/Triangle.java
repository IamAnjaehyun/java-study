package exam;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("a: ");
        int a=sc.nextInt();

        System.out.print("b: ");
        int b=sc.nextInt();

        System.out.print("c: ");
        int c=sc.nextInt();
        
        int max=a;
        if(max<b) max=b;
        if(max<c) max=c;

        if(max<a+b+c-max){
            System.out.println("삼각형이 됩니다.");
        }
        else{
            System.out.println("삼각형이 안됩니다.");
        }
    }
}
