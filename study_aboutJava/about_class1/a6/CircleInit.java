package a6;
class Circle{
    int radius;
    String name;

    public Circle(){
        radius=1;
        name ="";
    }

    public Circle(int r, String n){
        radius=r;
        name=n;
    }

    public double getArea(){
        return 3.14*radius*radius;
    }
}

public class CircleInit{
    public static void main(String[] args){
        Circle pizza;
        pizza=new Circle(10,"아이스 피자");
        double area=pizza.getArea();
        System.out.println(pizza.name +"의 면적은 " +area+"이다.");

        Circle donut=new Circle(2, "설탕 도넛");
        area=donut.getArea();
        System.out.println(donut.name +"의 면적은 "+area+ " 이다.");
    }
}