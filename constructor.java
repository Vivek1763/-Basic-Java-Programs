public class constructor {
    int age;
    String name;

    constructor() {
        System.out.println("Constructor is called");
    }
    public void printinfo(){
      System.out.println(this.name);
      System.out.println(this.age);
    }
public static void main(String[] args) {
    constructor s1=new constructor();
    s1.name="vivek";
    s1.age=20;
    s1.printinfo();
}
}

