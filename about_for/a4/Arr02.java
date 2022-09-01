package a4;

import java.util.Scanner;

public class Arr02 {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("5 number>> ");
        int[] a=new int[5];
        
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
        int max=a[0];
        for(int i=0;i<a.length;i++){
            if(max<a[i]){
                max=a[i];
            }
        }
        System.out.println("max: "+max);
    }
}
