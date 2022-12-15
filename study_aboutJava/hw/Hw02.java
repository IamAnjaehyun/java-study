package hw;

import java.util.Scanner;

public class Hw02 {
    public static void score(int a){
        if(a>=90 && a<100) System.out.println("A");
        if(a>=80 && a<90) System.out.println("B");
        if(a>=70 && a<80) System.out.println("C");
        if(a>=60 && a<70) System.out.println("D");
        if(a<60) System.out.println("F");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        
        score(a);

        sc.close();
    }
}
