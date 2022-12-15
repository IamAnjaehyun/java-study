package hw0719;

import java.util.Scanner;

public class Coffee {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("에스프레소, 카푸치노, 카페라떼, 아메리카노");
        System.out.println("무슨 커피 드릴까요?");

        String coffee=sc.next();
        if(coffee.equals("에스프레소") ||
            coffee.equals("카푸치노") ||
            coffee.equals("카페라떼")){
            System.out.println("가격은 3500원");
        }
        else if(coffee.equals("아메리카노")){
            System.out.println("가격은 2000원");
        }
        else{
            System.out.println("주문 오류");
        }

        sc.close();
    }
}
