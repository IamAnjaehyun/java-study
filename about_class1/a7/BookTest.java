package a7;

class Book{
    String title,author;

    public Book(){
        this("","");
    }

    public Book(String title){
        this(title,"작자미상");
    }

    public Book(String title,String author){
        this.title=title;
        this.author=author;
    }

    void show(){
        System.out.println(title+" : "+author);
    }
}

public class BookTest {
    public static void main(String[] args) {
        Book littlePrince=new Book("어린왕자", "생텍쥐페리");

        Book loveStroy = new Book("춘향전");

        littlePrince.show();
        loveStroy.show();
    }
}