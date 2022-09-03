package exam;

import java.util.Scanner;

public class Zoo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("동물 이름(영어)>> ");
        String name=sc.next();
        if(name.equals("dog")){
            System.out.println("개");
        }
        else if(name.equals("cow")){
            System.out.println("소");
        }
        else if(name.equals("eagle")){
            System.out.println("독수리");
        }
        else{
            System.out.println("몰라서 죄송합니다.");
        }
        sc.close();
    }
}
