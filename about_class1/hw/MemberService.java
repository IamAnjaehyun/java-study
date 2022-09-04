package hw;

import java.util.Scanner;


public class MemberService{
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String id=sc.next();

        String password=sc.next();

        login(id,password);


        sc.close();
    }

    private static void login(String id, String password) {
        if(id == "Hong" && password == "12345") System.out.println("ok");
        else                                    System.out.println("not ok");
    }

}
