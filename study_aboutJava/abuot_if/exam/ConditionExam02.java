package exam;

import java.util.Scanner;

public class ConditionExam02 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("2자리 정수 입력: ");
        int a=sc.nextInt();
        int one=a%10;// 1의자리
        int ten=a/10;// 10의 자리
        if (one==ten){
            System.out.println("Yes, 10의 자리와 1의 자리 숫자가 같다.");
        }
        else{
            System.out.println("NO, 10의 자리와 1의 자리 숫자가 다르다.");
        }

        sc.close();
    }
}
