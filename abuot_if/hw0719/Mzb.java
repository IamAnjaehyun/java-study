package hw0719;

import java.util.Scanner;

public class Mzb{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("가위바위보 게임입니다. 가위,바위,보 중에서 입력하세요.");

        /////////////////////////// 입력
        System.out.print("나: ");
        String me=sc.next();
        
        /////////////////////////// 컴퓨터 입력 랜덤

        int comRand=(int)(Math.random()*3);
        String com="";
        if(comRand==0) com="가위";
        else if(comRand==1) com="바위";
        else com="보";

        System.out.println("나: "+me+", 컴:"+com);
        
        /////////////////////////// 비교,판정
        if(me.equals(com))                          System.out.println("draw(비김)");
        else if(me.equals("가위")   && com.equals("보")     ||
                me.equals("바위")   &&  com.equals("가위")  ||
                me.equals("보")     &&  com.equals("바위")) {
                                                    System.out.println("human win(내가 이겼음)");
        }
        else                                        System.out.println("computer win(내가 졌음)");
        sc.close();
    }
}