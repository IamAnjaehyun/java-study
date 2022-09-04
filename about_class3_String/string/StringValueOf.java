package string;

public class StringValueOf {
    public static void main(String[] args) {
        int a=100;
        long b=1000;
        double c=100.123;
        boolean d=true;
        char e='A';

        String s1=String.valueOf(a);
        String s2=String.valueOf(b);
        String s3=String.valueOf(c);
        String s4=String.valueOf(d);
        String s5=String.valueOf(e);

        System.out.println(s1+ " / "+s1.getClass());
        System.out.println(s2+ " / "+s2.getClass());
        System.out.println(s3+ " / "+s3.getClass());
        System.out.println(s4+ " / "+s4.getClass());
        System.out.println(s5+ " / "+s5.getClass());
    }
}
