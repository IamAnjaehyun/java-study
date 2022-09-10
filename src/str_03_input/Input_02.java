package str_03_input;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

//데이터 파일에서 이름과 번호 읽어오기
public class Input_02 {

    static String[] name = new String[1000];
    static String[] number = new String[1000];
    static int n = 0; //현재 사람 숫자

    public static void main(String[] args) {
        try {
            Scanner inFile = new Scanner(new File("input.txt"));

            while (inFile.hasNext()) { // detect End of File
                name[n] = inFile.next(); //한단어씩 읽는데 이름 번호 순서
                number[n] = inFile.next(); // 두번째단어는 번호
                n++;
            }
            inFile.close();
        } catch (FileNotFoundException e) {
            System.out.println("No FIle!!!");
            System.exit(0);
        }

        bubbleSort();

        for (int i = 0; i < n; i++) {
            System.out.println(name[i] + ":" + number[i]);
        }
    }

    static void bubbleSort() {
        for (int i = n - 1; i > 0; i--) {
            for (int j = 0; j < 1; j++) {
                if (name[j].compareTo(name[j + 1]) > 0) {
                    String tem = name[j];
                    name[j] = name[j + 1];
                    name[j + 1] = tem;

                    tem = number[j];
                    number[j] = number[j + 1];
                    number[j + 1] = tem;
                }
            }
        }
    }
}
