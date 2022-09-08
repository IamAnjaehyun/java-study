package over;

class Animal{
    String name;
    int age;

    Animal(String name){
        this.name = name;
    }

    void show() {
        System.out.println("이 동물의 이름은 " + this.name + "입니다.");
    }
}

class Turtle extends Animal{
    Turtle(String name, int age){
        super(name);
        this.age = age;
    }

    void show() { // 메소드 오버라이딩 --> 부모 클래스의 show() 함수를 재정의
        System.out.println("이 거북이의 이름은 " + this.name + "이고 " + this.age + "살 입니다.");
    }
}

public class over_2 {
    public static void main(String[] args) {
        Animal a = new Animal("꼬부기");
        Turtle b = new Turtle("꼬부기", 120);

        a.show();
        b.show();
    }
}
