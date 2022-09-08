package over;

public class over_1 {
    static int sum(int a, int b) {
        return a+b;
    }
    static int sum(int a, int b, int c) {
        return a+b+c;
    }
    static double sum(double a, double b) {
        return a+b;
    }

    public static void main(String[] args) {

        int a = 10, b = 20, c = 30;
        double d = 14.2 , e = 15.5;

        System.out.println(sum(a,b)); // 첫 번째 함수
        System.out.println(sum(a,b,c)); // 두 번째 함수
        System.out.println(sum(d,e)); // 세 번째 함수
    }
}

