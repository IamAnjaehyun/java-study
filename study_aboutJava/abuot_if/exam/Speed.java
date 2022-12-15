package exam;

import java.util.Scanner;

public class Speed {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("s: ");
        int s=sc.nextInt();
        
        if(s>=120){
            System.out.println("벌금 10만원");
        }
        
        else if(s<=60){
            System.out.println("벌금 3만원");
        }
        
        else{
            System.out.println("상금 7만원");
        }
    }
}
