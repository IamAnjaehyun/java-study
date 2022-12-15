package hw;

public class Hw01{
    public static int plusA(int a){
        a++;
        return a;
    }

    public static void main(String[] args) {
        int a=1;
        a=plusA(a);
        a=plusA(a);
        System.out.println(a);
    }
}