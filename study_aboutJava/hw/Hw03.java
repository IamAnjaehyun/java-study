package hw;

import java.util.Arrays;
import java.util.Scanner;

public class Hw03 {
        public static void wordlist(String str){
            String[] strArr = str.split("\\s");
            System.out.println(Arrays.toString(strArr));
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Sentence : ");
        String str=sc.next();
        wordlist(str);
        sc.close();
    }
}
