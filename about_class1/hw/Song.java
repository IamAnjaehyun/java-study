package hw;

public class Song {
    public static void main(String[] args) {
        Soong a1 = new Soong("Dancing Queen" , "ABBA", 1978,"스웨덴");
        show(a1);
    }


class Soong{
    String mytitle;
    String myartist;
    int myyear;
    String mycountry;

    public Soong(String title, String artist, int year, String country){
        mytitle=title;
        myartist=artist;
        myyear=year;
        mycountry=country;
    }
    public Soong(){
        mytitle="타이틀 없음";
        myartist="작자 미상";
        myyear=0;
        mycountry="국적 미상";
    }
    private static void show(){
        System.out.println(mycountry+" 년"+myyear+"국적의 "+myartist+"가 부른"+mytitle);
    }

}

