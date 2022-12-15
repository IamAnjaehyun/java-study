package a1;

import java.nio.charset.MalformedInputException;

class Person{
    private int socNum;
    private int passNum;

    Person(int rnum,int pnum){
        socNum = rnum;
        passNum = pnum;
    }
    Person(int rnum){
        this(rnum,0);
    }
    void showPersonalInfo(){
        System.out.println("주민등록 번호: " + socNum);

        if(passNum != 0 )   System.out.println("여권 번호 : " + passNum + '\n');
        else                System.out.println("여권을 가지고 있지 않습니다. \n");
    }
}

public class ConOverloading {
    public static void main(String[] args) {
        Person jung = new Person(335577, 112233);

        Person hong = new Person(775544);

        jung.showPersonalInfo();
        hong.showPersonalInfo();
    }
}
