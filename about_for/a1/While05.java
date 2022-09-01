package a1;

// 주사위를 10번 던짐 랜덤한수나와야함  rand*6.
// 랜덤한 수를 출력.
// 주사위 수들의합과 평균을 출력하시오.

public class While05{
    public static void main(String[] args) {
        int i=1,tot=0;
        while(i<=10){
            int x=(int)(Math.random()*6)+1;
            tot=tot+x;
            System.out.print(x+" ");
            i++;
        }
        System.out.println();
        System.out.println("주사위 합: "+tot);
        System.out.println("주사위 평균: "+((double)tot/10.));
    }
}