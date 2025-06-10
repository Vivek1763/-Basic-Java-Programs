public class copyconstructor {
     int age;
     String name;
     copyconstructor(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Parameterized Constructor is called");
    }
    copyconstructor(copyconstructor obj) {
        this.name = obj.name;
        this.age = obj.age;
        System.out.println("Copy Constructor is called");
    }
public static void main(String[] args) {
    copyconstructor s1=new copyconstructor("vivek",20);
    copyconstructor s2 = new copyconstructor(s1);

        System.out.println("Original: " + s1.name + ", " + s1.age);
        System.out.println("Copied: " + s2.name + ", " + s2.age);
    }

}

