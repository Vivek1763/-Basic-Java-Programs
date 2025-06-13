public class ParaConstructor {
     int age;
    String name;

     ParaConstructor(String name,int age) {
        this.name=name;
        this.age=age;
             System.out.println("parameterized Constructor is called");
    }
public static void main(String[] args) {
     ParaConstructor s1=new ParaConstructor("vivek",20);
             System.out.println(s1.name);
             System.out.println(s1.age);
}
}
