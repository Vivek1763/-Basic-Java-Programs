class parent {
    void show() {
        System.out.println("this is parent class");
    }
}
class Child extends parent {
    void display() {
        System.out.println("this is child class");
    }
}
public class Inheritance {
    public static void main(String[] args) {

        Child obj = new Child();
        obj.show();
        obj.display();
    }
}

