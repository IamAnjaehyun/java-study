package hw;

public class SongExam {
    public static void main(String[] args) {
        Song a1 = new Song("Dancing Queen" , "ABBA", 1978,"스웨덴");
        a1.show();
    }


class Song{
    String title;
    String artist;
    int year;
    String country;

    public Song(String title, String artist, int year, String country){
        this.title=title;
        this.artist=artist;
        this.year=year;
        this.country=country;
    }
    public Song(){
        title="타이틀 없음";
        artist="작자 미상";
        year=0;
        country="국적 미상";
    }
    void show(){
        System.out.println(country+" 년"+year+"국적의 "+artist+"가 부른"+title);
    }
}


