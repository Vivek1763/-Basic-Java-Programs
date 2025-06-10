public class paraconstructor {
     int age;
    String name;

     paraconstructor(String name,int age) {
        this.name=name;
        this.age=age;
             System.out.println("parameterized Constructor is called");
    }
public static void main(String[] args) {
     paraconstructor s1=new paraconstructor("vivek",20);
             System.out.println(s1.name);
             System.out.println(s1.age);
}
}
