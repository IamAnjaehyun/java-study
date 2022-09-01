package a3;

import java.util.Scanner;

public class For15 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("n=");
        int n=sc.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++){
            sum=sum+i*i;
        }
        System.out.println("result: "+sum);
        sc.close();
    }
}
