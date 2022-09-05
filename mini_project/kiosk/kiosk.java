package kiosk;

import java.util.Scanner;

public class kiosk {
    public static final int MAX = 10;

    //전역변수
    static String[] box = new String[MAX];
    static int[] price = new int[MAX];
    static int[] stock = new int[MAX];
    static int count = 3; //메뉴 갯수
    static int admin = 1004; //관리자 비밀번호
    static int profit = 0; //수익ㄴ
    static Scanner sc = new Scanner(System.in);

    public static void initialize(){
        box[0] = "장미";
        price[0] = 500;
        stock[0] = 3;
        box[1] = "프리지아";
        price[1] = 1000;
        stock[1] = 2;
        box[2] = "국화";
        price[2] = 3000;
        stock[2] = 1;
    }

    public static void admin(){
        while(true) {
            System.out.println("==========================");
            System.out.println("관리자 페이지 입니다.");
            System.out.println("1: 메뉴 변경 2: 가격 변경 3:재고 추가 4:메뉴 추가 5:수익 확인 (종료)");
            System.out.println("번호를 입력하세요: ");
            int num = sc.nextInt();
            System.out.println("==========================");

            if (num == 1) {
                System.out.println("변경하실 메뉴의 번호를 선택하세요(1~" + count + ") :");
                int i = sc.nextInt();
                System.out.println(box[i - 1] + "를(을) 무엇으로 변경하시겠습니까? : ");
                sc.nextLine();
                String name = sc.next();
                System.out.println(name + "의 가격은 얼마입니까? :");
                int v = sc.nextInt();
                System.out.println(name + "의 재고를 몇 개 등록하시겠습니까? :");
                int n = sc.nextInt();

                box[i - 1] = name;
                price[i - 1] = v;
                stock[i - 1] = n;

            } else if (num == 2) {
                System.out.println("가격을 변경하실 메뉴의 번호를 선택하세요(1~" + count + ") :");
                int i = sc.nextInt();
                System.out.println(box[i - 1] + "의 가격을 얼마로 변경하시겠습니까? :");
                int j = sc.nextInt();
                price[i - 1] = j;
                System.out.println(box[i - 1] + "의 가격이 " + price[i - 1] + "으로 변경되었습니다.");
            } else if (num == 3) {
                System.out.println("재고를 추가하실 메뉴의 번호를 선택하세요(1~" + count + ") :");
                int i = sc.nextInt();
                System.out.println(box[i - 1] + "의 재고를 몇 개 추가 하시겠습니까? :");
                int j = sc.nextInt();
                stock[i - 1] += j;
                System.out.println(box[i - 1] + "의 재고가 " + stock[i - 1] + "개로 변경되었습니다.");
            } else if (num == 4) {
                System.out.println("추가하실 메뉴의 번호를 입력하세요(1~" + count + ") :");
                if (count >= MAX) {
                    System.out.println("메뉴의 갯수가 최대치를 넘었습니다.");
                } else {
                    System.out.println("추가하실 메뉴의 가격을 입력하세요. :");
                    int i = sc.nextInt();
                    System.out.println("추가하실 메뉴의 이름을 입력하세요. :");
                    sc.nextLine();
                    String name = sc.next();
                    System.out.println(name + "의 재고는 몇 개입니까? : ");
                    int j = sc.nextInt();

                    box[count] = name;
                    price[count] = i;
                    stock[count] = j;
                    count++;
                    System.out.println(box[count] + " 메뉴의 가격은 " + price[count] + "이며 재고의 갯수는 " + stock[count] + "입니다.");
                }
            } else if (num == 5) {
                System.out.println("현재까지의 수익은 " + profit + "입니다.");
            }
        }
    }
    public static void user(){
        Boolean first = true;
        int money = 0;

        while(true){
            System.out.println("==========================");
            System.out.println("꽃 자판기입니다. (번호 : 상품(재고))");

            for(int i = 0; i< count; i++){
                System.out.println((i+1)+":"+box[i]+"("+price[i]+"원)-"+stock[i]+"개");
            }
            System.out.println();
            System.out.println("==========================");

            if(first){
                System.out.println("돈을 투입해주세요. :");
                money = sc.nextInt();
                first = false;
            }

            if(money == 1004){
                admin();
                return;
            }

            System.out.println("메뉴 입력: ");
            int num = sc.nextInt();

            if(money>=price[num-1]) {
                //돈 충분+재고충분
                if (stock[num - 1] > 0) {
                    money -= price[num - 1];
                    stock[num - 1]--;
                    profit += price[num - 1];
                    System.out.println(box[num - 1] + "이(가) 나왔습니다.");
                } else {
                    System.out.println("재고가 부족합니다.");
                }
            }else {
                System.out.println("잔액이 부족합니다.!!");
            }
                System.out.println("잔액 : " +money);

                //돈다썼을 때 초기화면으로
                if(money==0){
                    System.out.println("감사합니다. 다음에 또 이용해주세요.");
                    first = true;
                    continue;
                }

                //돈이 남아있을 때
                System.out.println("1. 계속 구매하기 2: 금액 추가하기 3: 잔돈 반환하기 ");
                System.out.println("번호를 입력하세요: ");
                int num1 = sc.nextInt();

                if(num1 == 1){
                    continue;
                }
                else if(num1 == 2){
                    System.out.println("돈을 넣어주세요 : ");
                    int extra = sc.nextInt();
                    money += extra;
                    System.out.println("금액이 추가되었습니다. 잔액은 : " + money);
                }
                else if(num1 == 3){
                    System.out.println("거스름돈 "+ money +"원이 반환되었습니다.");
                    System.out.println("다음에 또 이용해주세요!");
                    first = true;
                }
            }
        }

    public static void main(String[] args) {
        initialize();
        user();
        return;
    }
}
