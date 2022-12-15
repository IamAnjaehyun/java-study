package exam;

import java.util.Scanner;

public class Programming {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("언어이름(영어)>> ");
        String name=sc.next();
        if(name.equals("c")){
            System.out.println("Easy");
        }
        else if(name.equals("c++")){
            System.out.println("Very easy");
        }
        else if(name.equals("java")){
            System.out.println("fun");
        }
        else if(name.equals("python")){
            System.out.println("difficult");
        }
        else{
            System.out.println("sorry.");
        }
        sc.close();
    }
}
