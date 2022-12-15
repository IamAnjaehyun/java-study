import java.util.Scanner;

public class Variable04 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("a= :");   
        int a=sc.nextInt();

        System.out.print("b= :");   
        int b=sc.nextInt();

        System.out.print("c= :");   
        int c=sc.nextInt();

        System.out.print("d= :");   
        int d=sc.nextInt();
        
        int tot=a+b+c+d;
        double avg=tot/4.0;

        System.out.println("평균= " +avg);

        sc.close();
    }
}