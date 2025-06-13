public class CopyConstructor {
     int age;
     String name;
     CopyConstructor(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Parameterized Constructor is called");
    }
    CopyConstructor(CopyConstructor obj) {
        this.name = obj.name;
        this.age = obj.age;
        System.out.println("Copy Constructor is called");
    }
public static void main(String[] args) {
    CopyConstructor s1=new CopyConstructor("vivek",20);
    CopyConstructor s2 = new CopyConstructor(s1);

        System.out.println("Original: " + s1.name + ", " + s1.age);
        System.out.println("Copied: " + s2.name + ", " + s2.age);
    }

}



