package hw0719;

import java.util.Scanner;

public class Coffee2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("에스프레소, 카푸치노, 카페라떼, 아메리카노");
        System.out.println("무슨 커피 드릴까요?");

        String coffee=sc.next();
        switch(coffee){
        case "에스프레소":
        System.out.println("가격은 3500원");
            break;
        case "카푸치노":
            System.out.println("가격은 3500원");
            break;
        case "카페라떼":
            System.out.println("가격은 3500원");
            break;
        case "아메리카노":
            System.out.println("가격은 2000원");
            break;
        default:
            System.out.println("주문 오류");
        }

        sc.close();
    
    }
}
